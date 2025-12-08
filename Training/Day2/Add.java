import java.util.*;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = Add.su(a, b, c);
        System.out.println(ans);
    }

    public static int su(int a, int b, int c) {
        if (a == 13) {
            if (c == 13) {
                return 0;
            } else {
                return c;
            }
        } 
        else if (b == 13) {
            return a;
        } 
        else if (c == 13) {
            return a + b;
        } 
        else {
            return a + b + c;
        }
    }
}