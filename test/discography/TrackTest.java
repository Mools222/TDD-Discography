package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {
    @Test
    public void testCreateTrack() {
        Track track = new Track("And You and I");
        String title = track.getTitle();
        assertEquals("And You and I", title);
    }
}