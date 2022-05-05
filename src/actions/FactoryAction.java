package actions;

import service.ActionNameListService;

import java.util.List;

public class FactoryAction {
    //Using a Factory Pattern write a program, which reads a list of action names from a text file,
    // creates an object by action name and prints a message to console: "Hello, <action_name>".
    //
    //Hints:
    //
    //Use an interface for all actions with one method doAction();
    //Every action implements the interface
    //Every action is created by a method in a factory class. The method accepts action name as a parameter
    //A main method of the program should use the Factory for action creations and then call doAction() method
    //Think how would you modify the program so that adding a new action does not require code change at all,
    // but only adding a new action class.
    public static Actionable createAction(Actions actions){
        switch (actions){
            case GRAYSCALE: return new GrayScaleAction();
            case THUMBNAIL: return new ThumbnailAction();
            default: return new PreviewAction();
        }
    }
}
