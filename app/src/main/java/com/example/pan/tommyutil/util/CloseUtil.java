package com.example.pan.tommyutil.util;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author tommy
 * @date 2015/11/4
 */
public class CloseUtil {
    private CloseUtil() { }


    public static void close(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void close(Closeable... params) {
        if (null != params) {
            try {
                for (Closeable closeable : params) {
                    closeable.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
