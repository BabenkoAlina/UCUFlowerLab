package flower.store;

public enum FlowerColor {
    RED("#FF0000"),
    WHITE("#FFFFFF"),
    YELLOW("#FFFF00");

    private final String hexColor;

    FlowerColor(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getHexColor() {
        return hexColor;
    }
}
