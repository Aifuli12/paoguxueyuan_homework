package com.aifuli.singleton.lazy;
/*
懒汉模式 ：非安全模式
 */
public class LazyOne {
    private LazyOne() {
    }

    private static LazyOne lazyOne = null;

    public static LazyOne getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
       // System.out.println(System.currentTimeMillis()+":"+lazyOne);
        return lazyOne;
    }
}
