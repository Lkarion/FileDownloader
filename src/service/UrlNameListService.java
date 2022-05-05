package service;

import entity.ImageDescriptor;

import java.util.List;
import java.util.stream.Collectors;

public class UrlNameListService {
    String fileName;

    public UrlNameListService(String fileName) {
        this.fileName = fileName;
    }

    public static List<String> getUrlNameList(List<ImageDescriptor> list){
        return list.stream().map(ImageDescriptor::getLinkURLName).collect(Collectors.toList());
    }
}
