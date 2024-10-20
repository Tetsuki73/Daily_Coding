package ACCENTURE;

import java.util.*;

class ratsSolution {

    public static int ratsFood(int rats, int unit, int n, int arr[]) {
        if (arr == null) {
            return -1;

        }
        int sum = 0;
        int c = 0;

        int requiredFood = rats * unit;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            c++;

            if (sum >= requiredFood) {
                break;

            }
        }

        if (sum < requiredFood) {
            return 0;
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int rats = obj.nextInt();
        int unit = obj.nextInt();
        int n = obj.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println(ratsFood(rats, unit, n, arr));
    }
}
