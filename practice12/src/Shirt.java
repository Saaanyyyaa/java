public class Shirt {
    private String series;
    private String name;
    private String color;
    private String size;

    public Shirt(String s) {
        String[] m =  s.split(",");
        series = m[0];
        name = m[1];
        color = m[2];
        size = m[3];
    }

    @Override
    public String toString() {
        return "Рубашка:\n" +
                "серия - " + series + '\n' +
                "название - " + name + '\n' +
                "цвет - " + color + '\n' +
                "размер - " + size + '\n';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,S";
        shirts[1] = "S002,Black Polo Shirt,Black,S";
        shirts[2] = "S003,Blue Polo Shirt,Blue,S";
        shirts[3] = "S004,Blue Polo Shirt,Blue,S";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XS";
        shirts[5] = "S006,Black T-Shirt,Black,XS";
        shirts[6] = "S007,White TShirt,White,S";
        shirts[7] = "S008,White T-Shirt,White,S";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shs = new Shirt[11];
        for (int i = 0; i < 11; ++i){
            shs[i] = new Shirt(shirts[i]);
        }

        for (Shirt sh : shs){
            System.out.println(sh);
        }
    }
}
