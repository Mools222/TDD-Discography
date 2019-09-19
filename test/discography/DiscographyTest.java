package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTest {
    @Test
    public void testCreateDiscography() {
        Discography discography = new Discography("Future Artist");
        assertEquals("Future Artist", discography.getArtistName());
    }
}