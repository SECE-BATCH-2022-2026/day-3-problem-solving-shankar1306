import java.util.*;
public class Exp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pat = "[A-Za-z0-9][A-Z][A-Za-z0-9]";
        if (s.matches(pat)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


