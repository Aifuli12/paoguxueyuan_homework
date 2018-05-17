package com.aifuli.singleton.lazy;
/*
懒汉模式 ：非安全模式
 */
public class LazyTwo {
    private LazyTwo() {
    }

    private static LazyTwo lazyOne = null;

    public static synchronized LazyTwo getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyTwo();
        }
        System.out.println(System.currentTimeMillis()+":"+lazyOne);
        return lazyOne;
    }
}
