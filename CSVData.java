public class CSVData {
    String linkURL;
    String action;
    int id;
    static int counter;

    public CSVData(String linkURL, String action) {
        this.linkURL = linkURL;
        this.action = action;
        id=++counter;
    }


    @Override
    public String toString() {
        return String.format("File %s: %s\nAction %s: %s", id, linkURL, id, action);
    }

}
