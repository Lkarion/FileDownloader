package service;

import entity.ImageDescriptor;

import java.util.List;
import java.util.stream.Collectors;

public class ImageDescriptorService {
    private FileService fileService;

    public ImageDescriptorService(FileService fileService) {
        this.fileService = fileService;
    }

    public List<ImageDescriptor> getImageDescriptors(String fileName){
        return fileService.loadStringsFromFile(fileName).stream()
                .map(s -> stringToImageDescriptor(s))
                .collect(Collectors.toList());
    }

    private static ImageDescriptor stringToImageDescriptor(String string){
        String[] strings = string.split(";");
        return new ImageDescriptor(strings[0], strings[1]);
    }
}
