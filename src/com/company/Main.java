package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File fileCSV = new File("/Users/lkarion/telran/filescsv.csv");
        FileReader fileReader = new FileReader(fileCSV);
        BufferedReader br = new BufferedReader(fileReader);
        List<CSVFileReader> list = new ArrayList<>();
        while(br.ready()){
            String[] strings = br.readLine().split(";");
            list.add(new CSVFileReader(strings[0], strings[1]));
        }
        list.forEach((o) -> System.out.println(o.toString()));
        br.close();
    }
}
