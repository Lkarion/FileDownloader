import java.io.File;

public class DownloadingFileCreator {
    static int counter;

    public static File createNewFileToDownloadIn(){
        //TODO get the file name from the link string
        return new File("/Users/lkarion/telran/IDEAJavaProj/FileDownloader/"+ ++counter +".jpg");
    }
}
