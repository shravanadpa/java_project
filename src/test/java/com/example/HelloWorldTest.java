package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testSayHello() {
        Main hw = new Main();
        assertEquals("Hello, CI/CD!", hw.sayHello());
    }
}
