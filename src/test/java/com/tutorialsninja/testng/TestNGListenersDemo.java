package com.tutorialsninja.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
@Listeners(TestNGListeners.class)
public class TestNGListenersDemo {

    @Test
    public void test1() {
        System.out.println("I am inside Test1");
    }

    @Test
    public void test2() {
        System.out.println("I am inside Test2");
    }

    @Test
    public void test3() {
        System.out.println("I am inside Test3");
    }
}
