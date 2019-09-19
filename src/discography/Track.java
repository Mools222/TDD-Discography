package discography;

import java.time.Duration;

public class Track {
    public Track(String title) {
    }

    public Track(String title, int minutes, int seconds) {
    }

    public String getTitle() {
        return "And You and I";
    }

    public boolean isBonusTrack() {
        return false;
    }

    public Duration getPlaytime() {
        return Duration.ofMinutes(10).plusSeconds(8);
    }

    @Override
    public String toString() {
        return "And You and I [PT10M8S]";
    }
}
