package actions;

public class PreviewAction implements Actionable {
    final String actionName;

    public PreviewAction() {
        this.actionName = "PREVIEW";
    }

    @Override
    public void doAction(String actionName) {

    }

    @Override
    public void print() {
        System.out.println("Hello, "+ actionName);
    }
}
