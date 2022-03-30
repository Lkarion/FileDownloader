import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {
    static List<CSVData> list = new ArrayList<>();
    public static void readFile() throws IOException {
       // String fileName = args.length > 0 ? args[0] :"filescsv.csv";
        String fileName = "filescsv.csv";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while(br.ready()){
            String[] strings = br.readLine().split(";");//TODO create a class? separator
            list.add(new CSVData(strings[0], strings[1].trim()));
        }
        FilePrinter.print(list);
        br.close();
    }
}
