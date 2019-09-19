package discography;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Record {
    private String title;

    public Record(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return LocalDate.of(2074, Month.OCTOBER, 6);
    }

    public Duration getPlaytime() {
        return Duration.ofSeconds(0);
    }

    public int getTrackCount() {
        return 0;
    }

    public String getType() {
        return "single";
    }

    @Override
    public String toString() {
        return "Under Production [2074-10-06, PT0S]";
    }
}
