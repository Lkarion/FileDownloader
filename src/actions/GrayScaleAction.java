package actions;

public class GrayScaleAction implements Actionable {
    final String actionName;

    public GrayScaleAction() {
        this.actionName = "GRAYSCALE";
    }

    @Override
    public void doAction(String actionName) {

    }

    @Override
    public void print() {
        System.out.println("Hello, "+ actionName);
    }
}
