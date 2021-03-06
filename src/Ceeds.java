import java.util.Arrays;
import java.util.Scanner;

public class Ceeds {

    public static void main(String[] args) {
        minMax();

        int[] arr = new int[]{5, 6, 7, 8, 9};
        contains(arr, arr);

    }

    static boolean contains(int[] searchIn, int[] searchFor) {
        if (searchFor.length > searchIn.length) {
            return false;
        }

        int followIndex = 0;

        for (int i = 0; i < searchIn.length; i++) {
            if(searchIn[i]==searchFor[followIndex]){
                followIndex++;
            }else {
                followIndex=0;
            }
            if(followIndex==searchFor.length){
                return true;
            }
        }

        return false;
    }

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

    public boolean isUnique(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    //Page 511 hw

    public int priceIsRight(int[] bids, int price) {
        int winner = -1;
        int distance = price;

        for (int i = 0; i < bids.length; i++) {
            if ((bids[i] <= price) && (price - bids[i] < distance)) {
                winner = i;
                distance = price - bids[i];
            }
        }
        return winner;
    }

    int longestSortedSequence(int[] input) {
        int length = 0;
        int beginning = 0;
        int end = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] >= input[i - 1]) {
                end = i;


            }
        }
        return length;
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