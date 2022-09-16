package classwork.chapter3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HealthRecordTest {
    private HealthRecord healthRecord;

    @BeforeEach
    public void init(){
        healthRecord = new HealthRecord("John", "Doe", Gender.MALE, 5, 4, 2010, 2, 65);
        assertNotNull(healthRecord);
    }

    @AfterEach
    public void tearDown(){
        healthRecord = null;
    }

    @Test
    public void UserDetailsTest(){
        assertEquals("John", healthRecord.getFirstName());
        assertEquals("Doe", healthRecord.getLastName());
        assertEquals(Gender.MALE, healthRecord.getGender());
        assertEquals(5, healthRecord.getDobDay());
        assertEquals(4, healthRecord.getDobMonth());
        assertEquals(2010, healthRecord.getDobYear());
        assertEquals(2, healthRecord.getHeight());
        assertEquals(65, healthRecord.getWeight());
    }

    @Test
    public void setUserDetailsTest(){
        healthRecord.setFirstName("Raheem");
        healthRecord.setLastName("Adebayo");
        healthRecord.setGender(Gender.FEMALE);
        healthRecord.setDobDay(28);
        healthRecord.setDobMonth(10);
        healthRecord.setDobYear(2012);
        healthRecord.setHeight(2.3);
        healthRecord.setWeight(67.5);

        assertEquals("Raheem", healthRecord.getFirstName());
        assertEquals("Adebayo", healthRecord.getLastName());
        assertEquals(Gender.FEMALE, healthRecord.getGender());
        assertEquals(28, healthRecord.getDobDay());
        assertEquals(10, healthRecord.getDobMonth());
        assertEquals(2012, healthRecord.getDobYear());
        assertEquals(2.3, healthRecord.getHeight());
        assertEquals(67.5, healthRecord.getWeight());

        int age = healthRecord.getAge();
        assertEquals(9, age);
        assertEquals((67.5 / (2.3 * 2.3)), healthRecord.getBMI());

        int maximumHeartRate = healthRecord.getMaximumHeartRate();
        assertEquals((220 - age), maximumHeartRate);
        assertEquals((0.5 * maximumHeartRate) + " - " + (0.85 * maximumHeartRate), healthRecord.getTargetHeartRateRange());
    }

    @Test
    public void ageTest(){
        int age = healthRecord.getAge();
        assertEquals(12, age);
    }

    @Test
    public void bmiTest(){
        assertEquals(((double) 65 / (2 * 2)), healthRecord.getBMI());
    }

    @Test
    public void maximumHeartRateTest(){
        int age = healthRecord.getAge();
        int maximumHeartRate = healthRecord.getMaximumHeartRate();
        assertEquals((220 - age), maximumHeartRate);
    }

    @Test
    public void targetHeartRateRange(){
        int age = healthRecord.getAge();
        int maximumHeartRate = healthRecord.getMaximumHeartRate();

        assertEquals((220 - age), maximumHeartRate);
        assertEquals((0.5 * maximumHeartRate) + " - " + (0.85 * maximumHeartRate), healthRecord.getTargetHeartRateRange());
    }
}