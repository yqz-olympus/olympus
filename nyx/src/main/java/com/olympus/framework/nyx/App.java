package com.olympus.framework.nyx;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private HashMap<String, Integer> wordMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
/*

        File file = new File("/Users/nyx/Documents/books/jdk-11.0.7-doc");
        if (file.exists() && file.isDirectory()) {
            for (String name : Objects.requireNonNull(file.list())) {
                LOGGER.info(name);
            }
        }

*/
        App app = new App();
        app.recursiveDirectory("/Users/nyx/Documents/books/jdk-11.0.7-doc");
        app.showWords();
    }

    public void showWords() {
        int i = 0;
        for (String key : wordMap.keySet()) {
            LOGGER.info(++i + "-->" + key);
        }
    }

    public void recursiveDirectory(String path) throws IOException {
        File file = new File(path);

        for (File temp : Objects.requireNonNull(file.listFiles())) {
            if (temp.isDirectory()) {
                recursiveDirectory(temp.getPath());
            } else {
                String filePath = temp.getPath();
                if (filePath.endsWith(".html")) {
                    Document document = Jsoup.parse(new File(filePath), "UTF-8", filePath);
                    String text = document.text().replaceAll("[^a-z^A-Z]", " ");

                    String array[] = text.split(" ");

                    for (String item : array) {
                        if (!item.replace(" ", "").equals("")) {
                            Integer value = wordMap.get(item);
                            if (value == null) {
                                wordMap.put(item, 1);
                            } else {
                                int a = value;
                                ++a;
                                wordMap.put(item, a);
                            }
                        }
                    }

                    int i = 0;

                }
            }
        }
    }

}


// yum install docker-ce-18.06.3.ce-3.el7 docker-ce-cli-18.06.3.ce-3.el7 containerd.io

