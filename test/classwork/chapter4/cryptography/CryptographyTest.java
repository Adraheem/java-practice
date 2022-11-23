package classwork.chapter4.cryptography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @Test
    void encryptNumberTest(){
        assertEquals("2134", Cryptography.encrypt("6754"));
    }

    @Test
    void decryptNumberTest(){
        assertEquals("6754", Cryptography.decrypt("2134"));
    }

    @Test
    void encryptNumberThatReturnsZeroAsFirstDigitTest(){
        assertEquals("0918", Cryptography.encrypt("4132"));
    }

    @Test
    void decryptNumberThatReturnsZeroAsFirstDigitTest(){
        assertEquals("4132", Cryptography.decrypt("0918"));
    }

}