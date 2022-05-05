package service;

import entity.ImageDescriptor;

import java.util.List;
import java.util.stream.Collectors;

public class ActionNameListService {
    String fileName;

    public ActionNameListService(String fileName) {
        this.fileName = fileName;
    }

    public static List<String> getActionNameList(List<ImageDescriptor> list){
        return list.stream().map(ImageDescriptor::getActionName).collect(Collectors.toList());
    }
}
