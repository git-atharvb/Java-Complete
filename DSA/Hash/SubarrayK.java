package Hash;
public class SubarrayK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int count = countSubarraysWithSumK(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + count);
    }
    public static int countSubarraysWithSumK(int[] arr, int k) {
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}