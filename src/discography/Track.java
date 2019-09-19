package discography;

import java.time.Duration;

public class Track {
    private String title;
    private final int minutes = 10, seconds = 8;

    public Track(String title, int minutes, int seconds) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBonusTrack() {
        return false;
    }

    public Duration getPlaytime() {
        return Duration.ofMinutes(minutes).plusSeconds(seconds);
    }

    @Override
    public String toString() {
        return title + " [PT" + minutes + "M" + seconds + "S]";
    }
}
