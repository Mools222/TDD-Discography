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
    }

}