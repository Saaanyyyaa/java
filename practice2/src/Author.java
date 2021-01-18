public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, char a) {
        color = n;
        size = a;
    }
    public ball(String n) {
        color = n;
        size = 0;
    }
    public ball() {
        color = "white";
        size = 0;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color) {
        return color;
    }
    public int getSize() {
        return size;
    }
    public String toString() {
        return this.color+", size "+this.size;
    }
}
