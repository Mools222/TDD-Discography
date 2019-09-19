package discography;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTest {
    @Test
    public void testCreateDiscography() {
        Discography discography = new Discography("Future Artist");
        assertEquals("Future Artist", discography.getArtistName());
        assertEquals(0, discography.getRecordCount());
        assertEquals("Future Artist\n0 records", discography.toString());
    }

    @Test
    public void testCreateDiscographyContainingRecord() {
        Discography discography = new Discography("Yes", new Record("Close to the Edge", LocalDate.of(1972, Month.SEPTEMBER, 13), "album", new Track("And You and I", 10, 8), new Track("America", 4, 12, true)));
        assertEquals("Yes", discography.getArtistName());
        assertEquals(new ArrayList<>(Arrays.asList(new Record("Close to the Edge", LocalDate.of(1972, Month.SEPTEMBER, 13), "album", new Track("And You and I", 10, 8), new Track("America", 4, 12, true)))), discography.getRecordList());
        assertEquals(1, discography.getRecordCount());
        assertEquals("Yes\n1 records\nClose to the Edge [1972-09-13, PT14M20S]\n[1] And You and I [PT10M8S]\n[2] America [PT4M12S]", discography.toString());
    }
}