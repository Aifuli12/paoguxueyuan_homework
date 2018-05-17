package com.aifuli.singleton.lazy;

import com.aifuli.singleton.hungry.Hungry;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {
    public static void main(String[] args) {
        int count = 100;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        final long end;
        // final Set<Hungry> synSet= Collections.synchronizedSet(new HashSet<Hungry>());
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        LazyOne instance = LazyOne.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + instance);
                        end = System.currentTimeMillis();
                        System.out.println("总耗时" + (end - start));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    LazyOne.getInstance();
                }
            }.start();
            latch.countDown();
        }

    }
}
