package discography;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    @Test
    public void testCreateRecord() {
        Record record = new Record("Under Production");
        assertEquals("Under Production", record.getTitle());
        assertEquals(LocalDate.of(2074, Month.OCTOBER, 6), record.getReleaseDate());
        assertEquals(Duration.ofSeconds(0), record.getPlaytime());
        assertEquals(0, record.getTrackCount());
        assertEquals("single", record.getType());
        assertEquals("Under Production [2074-10-06, PT0S]", record.toString());
    }

    @Test
    public void testCreateAlbum() {
        Record record = new Record("Close to the Edge");
        assertEquals("Close to the Edge", record.getTitle());
        assertEquals(LocalDate.of(1972, Month.SEPTEMBER, 13), record.getReleaseDate());
    }
}
