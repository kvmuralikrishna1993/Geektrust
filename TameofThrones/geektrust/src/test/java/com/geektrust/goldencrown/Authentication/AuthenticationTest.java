package com.geektrust.goldencrown.Authentication;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class AuthenticationTest {



    @Test
    public void authenticate() {

        Authentication obj = new Authentication();
        assertTrue(obj.authenticate("lion", "lion"));
    }
}