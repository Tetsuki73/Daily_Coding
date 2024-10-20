
import java.util.*;

public class defDifference {

    public static int findDiff(int n, int m) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }
        }

        return Math.abs(sum1 - sum2);

    }

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int m = obj.nextInt();

        System.out.println(findDiff(n, m));
    }

}
