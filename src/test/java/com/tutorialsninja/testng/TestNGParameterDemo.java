package com.tutorialsninja.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGParameterDemo {

    @Test
    @Parameters({"myName","surname"})
    public void test(@Optional("Mani") String name,String surname) {
        System.out.println("My name is : " + name);
        System.out.println("My surname is : " + surname);
    }
}
