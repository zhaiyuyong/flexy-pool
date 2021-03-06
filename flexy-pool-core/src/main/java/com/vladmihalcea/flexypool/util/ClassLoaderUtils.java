package com.vladmihalcea.flexypool.util;

import java.io.InputStream;
import java.net.URL;

/**
 * <code>ClassLoaderUtils</code> - Class loading utilities.
 *
 * @author Vlad Mihalcea
 * @version %I%, %E%
 * @since 1.2
 */
public final class ClassLoaderUtils {

    private ClassLoaderUtils() {
        throw new UnsupportedOperationException("ClassLoaderUtils is not instantiable!");
    }

    /**
     * Load the available ClassLoader
     * @return ClassLoader
     */
    public static ClassLoader getClassLoader() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (classLoader != null) ? classLoader : ClassLoaderUtils.class.getClassLoader();
    }

    /**
     * Load the Class denoted by the given string representation
     * @param className class string representation
     * @return Class
     * @throws ClassNotFoundException
     */
    @SuppressWarnings("unchecked")
    public static <T> Class<T> loadClass(String className) throws ClassNotFoundException {
        return (Class<T>) getClassLoader().loadClass(className);
    }

    /**
     * Get the resource URL
     * @param resourceName resource name
     * @return resource URL
     */
    public static URL getResource(String resourceName) {
        return getClassLoader().getResource(resourceName);
    }

    /**
     * Get the resource InputStream
     * @param resourceName resource name
     * @return resource InputStream
     */
    public static InputStream getResourceAsStream(String resourceName) {
        return getClassLoader().getResourceAsStream(resourceName);
    }
}
