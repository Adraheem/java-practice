package practice.sevenSegmentDisplay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {

    private SevenSegmentDisplay sevenSegmentDisplay;

    @BeforeEach
    void setUp() {
        sevenSegmentDisplay = new SevenSegmentDisplay();
    }

    @Test
    void sevenSegmentDisplayNotNull() {
        assertNotNull(sevenSegmentDisplay);
    }

}
