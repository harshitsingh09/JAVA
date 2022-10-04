public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 56, 46, 56, 23, 12, 34, 65, 34, 1, 23, 32};
        int target = 46;
        int ans = linear(nums, target);
        System.out.println(ans);
    }

    public static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
