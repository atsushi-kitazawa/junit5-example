package com.example.dynamic.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestTargetTest {

    @TestFactory
    public Stream<DynamicTest> testUpperCase() {
        return Arrays.asList(
                DynamicTest.dynamicTest("upper case test 1.", () -> assertTrue(DynamicTestTarget.isUpperCase("ABCDE"))),
                DynamicTest.dynamicTest("upper case test 2.",
                        () -> assertFalse(DynamicTestTarget.isUpperCase("abcde"))),
                DynamicTest.dynamicTest("upper case test 3.", () -> assertFalse(DynamicTestTarget.isUpperCase(""))),
                DynamicTest.dynamicTest("upper case test 4.", () -> assertFalse(DynamicTestTarget.isUpperCase(null))),
                DynamicTest.dynamicTest("upper case test 5.",
                        () -> assertFalse(DynamicTestTarget.isUpperCase("あいうえお"))))
                .stream();
    }

    @TestFactory
    public Stream<DynamicTest> testLowerCase() {
        return Arrays.asList(
                DynamicTest.dynamicTest("lower case test 1.",
                        () -> assertFalse(DynamicTestTarget.isLowerCase("ABCDE"))),
                DynamicTest.dynamicTest("lower case test 2.", () -> assertTrue(DynamicTestTarget.isLowerCase("abcde"))),
                DynamicTest.dynamicTest("lower case test 3.", () -> assertFalse(DynamicTestTarget.isLowerCase(""))),
                DynamicTest.dynamicTest("lower case test 4.", () -> assertFalse(DynamicTestTarget.isLowerCase(null))),
                DynamicTest.dynamicTest("lower case test 5.",
                        () -> assertFalse(DynamicTestTarget.isLowerCase("あいうえお"))))
                .stream();
    }
}
