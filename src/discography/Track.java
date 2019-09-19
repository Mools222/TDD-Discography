package discography;

import java.time.Duration;

public class Track {
    private String title;
    private final int minutes = 10, seconds = 8;
    private boolean isBonusTrack;
    private Duration playtime;

    public Track(String title, int minutes, int seconds) {
        this.title = title;
        playtime = Duration.ofMinutes(minutes).plusSeconds(seconds);
    }

    public Track(String title, int minutes, int seconds, boolean isBonusTrack) {
        this.title = title;
        playtime = Duration.ofMinutes(minutes).plusSeconds(seconds);
        this.isBonusTrack = isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }

    public Duration getPlaytime() {
        return playtime;
    }

    @Override
    public String toString() {
        return title + " [PT" + minutes + "M" + seconds + "S]";
    }
}
