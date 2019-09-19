package discography;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Record {
    private String title, type;
    private LocalDate releaseDate;
    private ArrayList<Track> trackList;

    public Record(String title, LocalDate releaseDate, String type, Track... tracks) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.type = type;
        trackList = new ArrayList<>(Arrays.asList(tracks));
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Duration getPlaytime() {
        Duration playtime = Duration.ZERO;
        for (Track track : trackList) {
            playtime = playtime.plus(track.getPlaytime());
        }
        return playtime;
    }

    public int getTrackCount() {
        return trackList.size();
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String string = title + " [" + releaseDate + ", " + getPlaytime() + "]";
        for (int i = 0; i < trackList.size(); i++) {
            string += "\n[" + (i + 1) + "] " + trackList.get(i);
        }
        return string;
    }

    public ArrayList<Track> getTrackList() {
        return new ArrayList<>(Arrays.asList(new Track("And You and I", 10, 8), new Track("America", 4, 12, true)));
    }
}
