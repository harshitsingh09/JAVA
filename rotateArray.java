import java.util.Arrays;

class rotateArray{
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < 3; i++) {
            arr1[arr.length] = arr[0];
            for (int j = 0; j < arr.length-2; j++) {
                arr1[j] = arr[j+1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}