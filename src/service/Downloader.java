package service;

import entity.ImageDescriptor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.List;

public class Downloader {

    public static void downloadFile(List<ImageDescriptor> list) {
        try {
            List<String> listOfUrls = UrlNameListService.getUrlNameList(list);

            for (String link : listOfUrls) {
                File out = DownloadingFileCreator.createNewFileToDownloadIn();
                URL url = URLCreator.createUrlLink(link);
                BufferedImage image = ImageIO.read(url);
                ImageIO.write(image, "jpg", out);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
