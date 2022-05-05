import actions.Actionable;
import actions.Actions;
import actions.FactoryAction;
import entity.ImageDescriptor;
import service.ActionNameListService;
import service.Downloader;
import service.FileService;
import service.ImageDescriptorService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String fileName = args[0];

        FileService fileService = new FileService();
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);
        List<ImageDescriptor> imageDescriptors = imageDescriptorService.getImageDescriptors(fileName);

     //   imageDescriptors.stream().forEach(s -> System.out.println(s));

       // Downloader.downloadFile(imageDescriptors);


        
        // actions

        List<String> actionNameList = ActionNameListService.getActionNameList(imageDescriptors);
        for (String s: actionNameList) {
            Actionable action =  FactoryAction.createAction(Actions.valueOf(s.toUpperCase()));
            //action.doAction(s);
            action.print();
        }
    }
}
