package actions;

public class ThumbnailAction implements Actionable {
    final String actionName;

    public ThumbnailAction() {
        this.actionName = "THUMBNAIL";
    }

    @Override
    public void doAction(String actionName) {

    }

    @Override
    public void print() {
        System.out.println("Hello, "+ actionName);
    }
}
