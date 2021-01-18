import java.util.Scanner;

public class Task8 {
    static boolean cut(String str){
        if(str.length() == 1) return true;
        if(str.charAt(0) == str.charAt(str.length()-1)){
            str = str.substring(1, str.length() - 2);
            if(str.length() <= 1){
                return true;
            }
            cut(str);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(cut(word) ? "YES" : "NO");

    }
}