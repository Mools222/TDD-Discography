package discography;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    @Test
    public void testCreateRecord() {
        Record record = new Record("Under Production");
        assertEquals("Under Production", record.getTitle());

    }
}
