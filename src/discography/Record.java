package discography;

import java.time.LocalDate;
import java.time.Month;

public class Record {
    public Record(String title) {
    }

    public String getTitle() {
        return "Under Production";
    }

    public LocalDate getReleaseDate() {
        return LocalDate.of(2074, Month.OCTOBER, 6);
    }
}
