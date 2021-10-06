package com.geektrust.goldencrown.Universe;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class UniverseTest {
    
    @Test
    public void myUniverse() {
        Universe uv = new Universe();
        HashMap<String, String> kingdoms = uv.myUniverse();
        assertEquals("Mammoth",kingdoms.get("ICE"));

    }
}