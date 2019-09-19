package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {
    @Test
    public void testCreateTrack() {
        Track track = new Track("title");
        String title = track.getTitle();
        assertEquals(title, "title");
    }
}