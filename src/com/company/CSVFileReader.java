package com.company;

public class CSVFileReader {
    String linkURL;
    String action;
    static int counter;
    int id;

    public CSVFileReader(String linkURL, String action) {
        this.linkURL = linkURL;
        this.action = action;
        id = ++counter;
    }


    @Override
    public String toString() {
        return String.format("File %s: %s\nAction %s: %s", id, linkURL, id, action);
    }
}
