package com.example.pan.tommyutil.interfaces;

import android.os.Bundle;
import android.view.View;

/**
 * 规范Fragment接口协议
 *
 * @date 2015/11/12
 */
public interface IFragment {
    /**
     * 获取布局文件
     */
    int getLayoutResId();

    /**
     * Fragment被切换到前台时调用
     */
    void onChange();

    /**
     * Fragment被切换到后台时调用
     */
    void onHidden();

    /** 第一次启动会执行此方法 */
    void onFirst();

    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化控件
     */
    void initView(View parentView, Bundle savedInstanceState);

    /**
     * 点击事件回调方法
     */
    void viewClick(View v);

    /**
     * 显示进度条
     */
    void showProgress();

    /**
     * 隐藏进度条
     */
    void hideProgress();
}
