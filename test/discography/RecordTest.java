package discography;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    @Test
    public void testCreateRecord() {
        Record record = new Record("Under Production", LocalDate.of(2074, Month.OCTOBER, 6));
        assertEquals("Under Production", record.getTitle());
        assertEquals(LocalDate.of(2074, Month.OCTOBER, 6), record.getReleaseDate());
        assertEquals(Duration.ofSeconds(0), record.getPlaytime());
        assertEquals(0, record.getTrackCount());
        assertEquals("single", record.getType());
        assertEquals("Under Production [2074-10-06, PT0S]", record.toString());
    }

    @Test
    public void testCreateAlbum() {
        Record record = new Record("Close to the Edge", LocalDate.of(1972, Month.SEPTEMBER, 13), new Track("And You and I", 10, 8), new Track("America", 4, 12, true));
        assertEquals("Close to the Edge", record.getTitle());
        assertEquals(LocalDate.of(1972, Month.SEPTEMBER, 13), record.getReleaseDate());
        assertEquals(new ArrayList<>(Arrays.asList(new Track("And You and I", 10, 8), new Track("America", 4, 12, true))), record.getTrackList());
        assertEquals(Duration.ofMinutes(14).plusSeconds(20), record.getPlaytime());
    }
}
