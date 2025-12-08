import java.io.*;

public class repeatFront {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(repeatFront(s, n));
    }

    public static String repeatFront(String s, int n) {
        StringBuilder res = new StringBuilder();

        if (s.length() <= n) {
            for (int j = 0; j < n; j++) {
                res.append(s);
            }
        } else {
            String part = s.substring(0, n);
            for (int j = 0; j < n; j++) {
                res.append(part);
            }
        }

        return res.toString();
    }
}
