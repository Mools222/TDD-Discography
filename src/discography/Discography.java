package discography;

import java.util.ArrayList;
import java.util.Arrays;

public class Discography {
    private String artistName;
    private ArrayList<Record> recordList;

    public Discography(String artistName, Record...records) {
        this.artistName = artistName;
        recordList = new ArrayList<>(Arrays.asList(records));
    }

    public String getArtistName() {
        return artistName;
    }

    public int getRecordCount() {
        return recordList.size();
    }

    @Override
    public String toString() {
        String string = artistName + "\n" + getRecordCount() + " records";
        for (Record record : recordList) {
            string += "\n" + record;
        }
        return string;
    }

    public ArrayList<Record> getRecordList() {
        return recordList;
    }
}
