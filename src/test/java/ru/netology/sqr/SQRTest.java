package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRTest {

    @Test
    public void testDefaultLowerAndUpperBound() {
        SQRService service = new SQRService();
        int lower = 100;
        int higher = 500;
        int expected = 13;
        int resultate = service.calcSqr(lower, higher);
        assertEquals(resultate, expected);
    }

    @Test
    public void testWhenBoundBig() {
        SQRService service = new SQRService();
        int lower = 100;
        int higher = 10001;
        int expected = 90;
        int resultate = service.calcSqr(lower, higher);
        assertEquals(resultate, expected);
    }
}
