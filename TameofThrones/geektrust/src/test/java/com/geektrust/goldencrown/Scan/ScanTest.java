package com.geektrust.goldencrown.Scan;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ScanTest {

    @Test
    public void scan() {
        Scan sc = new Scan();
        assertEquals(null,sc.scan(""));
    }
}