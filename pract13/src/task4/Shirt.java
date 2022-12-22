package task4;

public class Shirt {
    private String id;
    private  String name;
    private String color;
    private String size;

    public Shirt(String str) {
        String[] arr = str.split(",");
        id = arr[0];
        name = arr[1];
        color = arr[2];
        size = arr[3];
    }

    public String toString() {
        return String.format("|%-20s||%-20s||%-20s||%-20s|", id, name, color, size);
    }
}
