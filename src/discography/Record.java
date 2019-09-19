package discography;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Record {
    private String title;
    private LocalDate releaseDate;

    public Record(String title, LocalDate releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
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
