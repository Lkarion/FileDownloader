package entity;

public class ImageDescriptor {
    private String linkURLName;
    private String actionName;

    public ImageDescriptor(String linkURLName, String actionName) {
        this.linkURLName = linkURLName;
        this.actionName = actionName;
    }

    public String getLinkURLName() {
        return linkURLName;
    }

    public String getActionName() {
        return actionName;
    }

    @Override
    public String toString() {
        return "ImageDescriptor{" +
                "linkURLName='" + linkURLName + '\'' +
                ", actionName='" + actionName + '\'' +
                '}';
    }
}
