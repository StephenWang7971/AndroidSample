package com.keelean.citest;

import com.keelean.citest.service.Add;
import com.keelean.citest.service.Calculable;
import com.keelean.citest.service.Sub;

import junit.framework.TestCase;

/**
 * Created by Stephen on 1/18/16.
 */
public class TestAdd extends TestCase {

    public void testAdd_3_5_equal_8() {
        Calculable calc = new Add();
        assertEquals(8, calc.calc(3, 5));
    }

    public void testSub_8_5_equal_3() {
        Calculable calc = new Sub();
        assertEquals(3, calc.calc(8, 5));
    }
}
