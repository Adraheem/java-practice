package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime timeOfEntry;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfEntry = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                        =============================================
                        Entry %d
                        Written on: %s
                        Title: %s
                        Body: %s
                        =============================================
                        """,
                id, time, title, body);
    }
}
