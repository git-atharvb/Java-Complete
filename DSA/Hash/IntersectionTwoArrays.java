package Hash;
import java.util.HashSet;
public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        System.out.println("Intersection of the two arrays: " + intersectionSet);
    }
}