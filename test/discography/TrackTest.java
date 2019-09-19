package discography;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {
    @Test
    public void testCreateTrack() {
        Track track = new Track("And You and I", 10, 8);
        assertEquals("And You and I", track.getTitle());
        assertFalse(track.isBonusTrack());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8), track.getPlaytime());
        assertEquals("And You and I [PT10M8S]", track.toString());
    }

    @Test
    public void testCreateBonusTrack() {
        Track track = new Track("America", 4, 12, true);
        assertEquals("America", track.getTitle());
        assertTrue(track.isBonusTrack());
        assertEquals(Duration.ofMinutes(4).plusSeconds(12), track.getPlaytime());
    }
}