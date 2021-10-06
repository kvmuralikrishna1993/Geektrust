package com.geektrust.goldencrown.Seaser;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SeaserCipherTest {

    SeaserCipher seaser = new SeaserCipher();

    @Test
    public void encryptMessage() {
        assertEquals("def",seaser.encryptMessage("abc",3).toString());
    }

    @Test
    public void decryptMessage() {
        assertEquals("abc",seaser.decryptMessage("def",3).toString());
    }
}