package com.company;

public class CSVFileReader {
    String linkURL;
    String action;

    public CSVFileReader(String linkURL, String action) {
        this.linkURL = linkURL;
        this.action = action;
    }


    @Override
    public String toString() {
        return String.format("File: %s\nAction: %s", linkURL, action);
    }
}
