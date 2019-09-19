package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTest {
    @Test
    public void testCreateDiscography() {
        Discography discography = new Discography("Future Artist");
        assertEquals("Future Artist", discography.getArtistName());
        assertEquals(0, discography.getRecordCount());
        assertEquals("Future Artist\n0 records", discography.toString());
    }
}