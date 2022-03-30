import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class Downloader{

    public static void downloadFile() throws IOException {
        for (CSVData o : CSVFileReader.list) {
            String link = o.linkURL;
            File out = DownloadingFileCreator.createNewFileToDownloadIn();
            URL url = new URL(link);
            BufferedImage image = ImageIO.read(url);
            //TODO классы BufferedImage и URL?
            ImageIO.write(image, "jpg", out);

        }
    }
}
