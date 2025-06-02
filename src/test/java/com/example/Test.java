package com.example;

import com.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {

    @Test
    public void testSayHello() {
        Main hw = new Main();
        assertEquals("Hello, CI/CD!", hw.sayHello());
    }
}
