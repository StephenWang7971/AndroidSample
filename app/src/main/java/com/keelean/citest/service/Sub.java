package com.keelean.citest.service;

/**
 * Created by Stephen on 1/18/16.
 */
public class Sub implements Calculable {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}
