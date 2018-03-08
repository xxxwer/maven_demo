package com.xxxwer.imooc.util;

import org.junit.*;
import org.junit.Assert.*;

public class HiWorldTest {

    @Test
    public void testSayHi() {
        Assert.assertEquals("Hello World!", new HiWorld().sayHi());
    }
}