package discography;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

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

    public ArrayList<Track> getTrackList() {
        return new ArrayList<>(Arrays.asList(new Track("And You and I", 10, 8), new Track("America", 4, 12, true)));
    }
}
