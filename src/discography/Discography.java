package discography;

public class Discography {
    private String artistName;

    public Discography(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getRecordCount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Future Artist\n0 records";
    }
}
