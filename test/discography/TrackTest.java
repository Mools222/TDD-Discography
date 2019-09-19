package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {
    @Test
    public void testCreateTrack() {
        Track track = new Track("And You and I");
        assertEquals("And You and I", track.getTitle());
    }

    @Test
    public void testIsBonusTrack() {
        Track track = new Track("And You and I");
        assertFalse(track.isBonusTrack());
    }

}