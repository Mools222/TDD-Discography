package discography;

import java.time.Duration;

public class Track {
    private String title;
    private Duration playtime;
    private boolean bonusTrack;

    public Track(String title, int minutes, int seconds) {
        this(title, minutes, seconds, false);
    }

    public Track(String title, int minutes, int seconds, boolean isBonusTrack) {
        this.title = title;
        playtime = Duration.ofMinutes(minutes).plusSeconds(seconds);
        this.bonusTrack = isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBonusTrack() {
        return bonusTrack;
    }

    public Duration getPlaytime() {
        return playtime;
    }

    @Override
    public String toString() {
        return title + " [" + playtime + "]";
    }
}
