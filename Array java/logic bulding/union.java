//  arrays are sorted
// using set 2 times for to different arr and insert this is brute apporach
//for optimal use two pointer 
// port java.util.*; imports ArrayList, Arrays, etc.
// public class union defines the class.
// unionArray() takes two sorted arrays as input.
// ArrayList<Integer> union stores the final union without duplicates.
// n and m store the lengths of nums1 and nums2.
// i = 0 and j = 0 are two pointers starting at the beginning of both arrays.
// while (i < n && j < m) runs while both arrays still have elements.
// If nums1[i] < nums2[j], we consider the element from nums1.
// union.isEmpty() || union.get(...) != nums1[i] prevents duplicate elements.
// If nums2[j] < nums1[i], we similarly take the element from nums2.
// If both elements are equal, we add it only once and increment both i and j.
// After the main loop, the first while adds remaining elements of nums1.
// The second while adds remaining elements of nums2, also avoiding duplicates.
// union.stream().mapToInt(...).toArray() converts ArrayList<Integer> into int[].
// In main(), we create arrays, call unionArray(), and print the result; overall complexity is O(n + m) time and O(n + m) space.
import java.util.*;
public class union{
    public int[] unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> union = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {

                if (union.isEmpty() ||
                    union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }

                i++;

            } else if (nums2[j] < nums1[i]) {

                if (union.isEmpty() ||
                    union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }

                j++;

            } else {

                if (union.isEmpty() ||
                    union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() ||
                union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() ||
                union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }

        return union.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        union obj = new union();

    int[] nums1 = {1, 2, 2, 3, 4};
    int[] nums2 = {2, 3, 5, 6};

    int[] result = obj.unionArray(nums1, nums2);

    System.out.println(Arrays.toString(result));
    }
}

