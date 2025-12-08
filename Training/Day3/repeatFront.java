import java.io.*;

public class repeatFront {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(repeatFront(s, n));
    }

    public static String repeatFront(String s, int n) {
        String res = "";
        int i = s.length();

        if (i < 3) {
            for (int j = 0; j < i; j++) {
                res += s;
            }
        } else {
            String inpl = s.substring(0, n);
            for (int j = 0; j < n; j++) {
                res += inpl;
            }
        }

        return res;
    }
}