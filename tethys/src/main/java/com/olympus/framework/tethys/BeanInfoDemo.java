package com.olympus.framework.tethys;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;

public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(Person.class, Object.class);
        Stream.of(info.getPropertyDescriptors()).forEach(
                propertyDescriptor -> {
                    System.out.println(propertyDescriptor.toString());
                }
        );
    }
}
