import java.util.Arrays;

public class Ceeds {

    public static void main(String[] args) {


    }

    //Page 511 hw

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
            if(min>input[i]){
                min=input[i];
            }
            if(max<input[i]){
                max = input[i];
            }
        }
            return max - min + 1;
    }

    // 3
    int countInRange(int[] input, int min, int max){
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if(min<=input[i] && max>=input[i]){
                count++;
            }
        }
        return  count;
    }

    // 4
    boolean isSorted(double[] arr1, double[] arr2){
        return Arrays.equals(arr1, arr2);
    }
}