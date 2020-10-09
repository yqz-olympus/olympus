package com.olympus.framework.cyclopes;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Demo01 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("hi, yqzhang".getBytes());

        new BigInteger(1,md.digest());
    }
}
