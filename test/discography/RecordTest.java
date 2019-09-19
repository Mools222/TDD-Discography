package discography;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    @Test
    public void testCreateRecord() {
        Record record = new Record("Under Production");
        assertEquals("Under Production", record.getTitle());
        assertEquals(LocalDate.of(2074, Month.OCTOBER, 6), record.getReleaseDate());
    }
}
