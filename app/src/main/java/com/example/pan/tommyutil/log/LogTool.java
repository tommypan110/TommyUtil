package com.example.pan.tommyutil.log;

/**
 * Created by tommy.pan on 8/23/2016.
 */
public interface LogTool {
    void d(String tag, String message);

    void e(String tag, String message);

    void w(String tag, String message);

    void i(String tag, String message);

    void v(String tag, String message);

    void wtf(String tag, String message);
}
