import java.util.Arrays;
import java.util.Scanner;

public class Ceeds {

    public static void main(String[] args) {
        minMax();
    }


    //Page 511 hw

    static void minMax() {
        Integer min = null;
        Integer max = null;

        Scanner sc = new Scanner(System.in);

        boolean searchingForFirst = true;
        do {
            System.out.println("Enter a number");
            if (sc.hasNextInt()) {
                min = sc.nextInt();
                max = min;
                searchingForFirst = false;
            } else {
                System.out.println("That's not a number, silly");
            }
        } while (searchingForFirst);

        boolean searchingForMore = true;
        do {
            System.out.println("Enter another number or -1 to compute");
            if (sc.hasNextInt()) {
                int current = sc.nextInt();
                if (current != -1) {
                    if (current > max) {
                        max = current;
                    }
                    if (current < min) {
                        min = current;
                    }
                } else {
                    searchingForMore = false;
                }
            } else {
                System.out.println("That's not a number, silly");
            }
        } while (searchingForMore);

        System.out.println("Minimum val was " + min);
        System.out.println("Maximum val was " + max);

    }

    static boolean isVowel(String a) {
        switch (a.toUpperCase()) {
            case "A":
                return true;
            case "E":
                return true;
            case "I":
                return true;
            case "O":
                return true;
            case "U":
                return true;
            default:
                return false;
        }
    }

    // 1
    int lastIndexOf(int[] searchDomain, int whereIs) {
        int foundAt = -1;
        for (int i = 0; i < searchDomain.length; i++) {
            if (searchDomain[i] == whereIs) {
                foundAt = i;
            }
        }
        return foundAt;
    }

    // 2
    int range(int[] input) {
        int min = input[0];
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max - min + 1;
    }

    // 3
    int countInRange(int[] input, int min, int max) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (min <= input[i] && max >= input[i]) {
                count++;
            }
        }
        return count;
    }

    // 4
    boolean isSorted(double[] arr1) {
        double[] arr2 = Arrays.copyOf(arr1, arr1.length);
        return Arrays.equals(arr1, arr2);
    }


}