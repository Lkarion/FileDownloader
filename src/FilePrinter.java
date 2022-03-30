import java.util.List;

public class FilePrinter {

    public static void print(List<?> list){
        list.forEach((o) -> System.out.println(o.toString()));
    }

}
