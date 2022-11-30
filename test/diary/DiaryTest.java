package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("My Diary", "password");
    }

    @Test
    void diaryExistsTest() {
        assertNotNull(diary);
    }

    @Test
    void newDiaryIsLockedTest() {
        assertTrue(diary.isLocked());
    }

    @Test
    void lockedDiaryCanBeUnlockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }

    @Test
    void wrongPasswordCannotUnlockDiaryTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("wrongPassword");
        assertTrue(diary.isLocked());
    }

    @Test
    void diaryCanBeLockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    void happeningCanBeAddedToTheDiaryTest() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break Up with Simi",
                "I did not do anything to him oh, He just came back one day and...");

        assertEquals(1, diary.numberOfEntries());
    }

    @Test
    void entryCannotBeAddedWhenDiaryIsLockedTest(){
        assertTrue(diary.isLocked());

        diary.write("My Break Up with Simi",
                "I did not do anything to him oh, He just came back one day and...");

        assertEquals(0, diary.numberOfEntries());
    }

    @Test
    void entriesCanBeFoundByIdTest(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break Up with Simi",
                "I did not do anything to him oh, He just came back one day and...");

        assertEquals(1, diary.numberOfEntries());

        Entry foundEntry = diary.findEntryWithId(1);

        assertEquals(1, foundEntry.getId());
        assertEquals("My Break Up with Simi", foundEntry.getTitle());
        assertEquals("I did not do anything to him oh, He just came back one day and...",
                foundEntry.getBody());
    }
}