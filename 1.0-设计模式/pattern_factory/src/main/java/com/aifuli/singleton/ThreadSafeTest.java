package com.aifuli.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {
    public static void main(String[] args)
    {
        int count=100;
        CountDownLatch latch=new CountDownLatch(count);

        final Set<Hungry> synSet= Collections.synchronizedSet(new HashSet<Hungry>());
        for(int i=0;i<count;i++)
        {
            new Thread()
            {
                @Override
                public void run() {
                 Hungry.getInstance();
                }
            }.start();
            latch.countDown();
        }
    }
}
