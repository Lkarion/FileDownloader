package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileService {
    //private static String FILE_NAME = "filescsv.csv";

    public FileService() {
    }

    public List<String> loadStringsFromFile(String fileName){
        try {
            return Files.lines(Paths.get(fileName)).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }
}
