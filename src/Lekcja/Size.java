package Lekcja;

enum Size {
    XSMALL("Bardzo mały"), SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private final String description;

    private Size(String description) {

        this.description = description;
    }

    public String getDescription() {

        return description;
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values()) {
            if (size.getDescription().equals(description))
                return size;
        }return null;

    }

    @Override
    public String toString() {
        return description + " " + name() + " " + ordinal();
    }
}
