package com.test.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderUnitTest {

    @Test
    void testAdd() {
        assertEquals(new Adder().add(2, 4), 6);
    }

}
