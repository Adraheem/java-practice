package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTellerTest {
    @Test
    void speakTwelveOClock(){
        assertEquals("twelve o'clock", TimeTeller.speakTime("12:00"));
    }

    @Test
    void speakAfterTwelve(){
        assertEquals("ten minutes after twelve", TimeTeller.speakTime("12:10"));
    }

    @Test
    void speakAfterTwo(){
        assertEquals("eleven minutes after two", TimeTeller.speakTime("2:11"));
    }

    @Test
    void speakHalfPastSix(){
        assertEquals("half past six", TimeTeller.speakTime("6:30"));
    }

    @Test
    void speakToFive(){
        assertEquals("twenty minutes to five", TimeTeller.speakTime("4:40"));
    }

    @Test
    void speakToTwelve(){
        assertEquals("ten minutes to twelve", TimeTeller.speakTime("23:50"));
    }

    @Test
    void speakToOne(){
        assertEquals("eighteen minutes to one", TimeTeller.speakTime("00:42"));
    }

}