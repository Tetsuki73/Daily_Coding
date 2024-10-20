
import java.util.*;

public class binaryNumberSystem {
    public static int findBinaryResult(String str) {
        if (str == null) {
            return -1;

        }

        int res = str.charAt(0) - '0';

        for (int i = 0; i < str.length() - 1;) {
            int prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                res = res & (str.charAt(i) - '0');
            } else if (prev == 'B') {
                res = res | (str.charAt(i) - '0');
            } else {
                res = res ^ (str.charAt(i) - '0');
            }
            i++;
        }

        return res;

    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(findBinaryResult(str));

    }
}
