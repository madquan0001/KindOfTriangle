package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class KindTriangleTest {

    @Test
    @DisplayName("Test 2-2-2")
    void testTriangle1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "3 cạnh vừa nhập là tam giác đều";

        String result = TriangleClassifier.triangleTest(2, 2, 2);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test 2-2-3")
    void testTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "3 cạnh vừa nhập là tam giác cân";

        String result = TriangleClassifier.triangleTest(2, 2, 3);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Test 3-4-5")
    void testTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "3 cạnh vừa nhập là tam giác";

        String result = TriangleClassifier.triangleTest(3, 4, 5);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Test 8-2-3")
    void testTriangle4() {
        int a = 8;
        int b = 2;
        int c = 2;
        String expected = "3 cạnh vừa nhập không phải tam giác";

        String result = TriangleClassifier.triangleTest(8, 2, 3);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Test -1-2-1")
    void testTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "3 cạnh vừa nhập không phải tam giác";

        String result = TriangleClassifier.triangleTest(-1, 2, 1);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Test 0-1-1")
    void testTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "3 cạnh vừa nhập không phải tam giác";

        String result = TriangleClassifier.triangleTest(0, 1, 1);
        assertEquals(expected, result);

    }
}