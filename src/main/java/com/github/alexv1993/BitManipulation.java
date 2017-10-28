package com.github.alexv1993;

import java.util.Random;

/**
 * Created by Alex on 28.10.2017.
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("max positive ", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("max negative ", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt(" i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("1L", 1L);
        long ll = Long.MAX_VALUE;
        printBinaryLong("max positive ", ll);
        long lln = Long.MIN_VALUE;
        printBinaryLong("max negative ", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong(" l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);

    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary: \n    " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary: \n    " + Long.toBinaryString(l));
    }
}
