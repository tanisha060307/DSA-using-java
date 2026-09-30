import java.util.Arrays;

public class medianoftwosortedarrays4 {
    
    // Your provided Solution class nested inside Main
    static class Solution { 
        public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
            int[] result = new int[nums1.length + nums2.length]; 
            
            // Copy nums1 
            for (int i = 0; i < nums1.length; i++) { 
                result[i] = nums1[i]; 
            } 
            
            // Copy nums2 
            for (int i = 0; i < nums2.length; i++) { 
                result[nums1.length + i] = nums2[i]; 
            } 
            
            Arrays.sort(result); 
            
            if (result.length == 0) { 
                return 0; 
            } 
            
            if (result.length % 2 == 0) { 
                int mid1 = result[result.length / 2 - 1]; 
                int mid2 = result[result.length / 2]; 
                return (mid1 + mid2) / 2.0; 
            } else { 
                return result[result.length / 2]; 
            } 
        } 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // --- Test Case 1: Odd Total Length ---
        int[] nums1_case1 = {1, 3};
        int[] nums2_case1 = {2};
        // Merged array: [1, 2, 3] -> Median is 2.0
        double output1 = solution.findMedianSortedArrays(nums1_case1, nums2_case1);
        printResult(nums1_case1, nums2_case1, output1, 2.0);

        // --- Test Case 2: Even Total Length ---
        int[] nums1_case2 = {1, 2};
        int[] nums2_case2 = {3, 4};
        // Merged array: [1, 2, 3, 4] -> Median is (2 + 3) / 2.0 = 2.5
        double output2 = solution.findMedianSortedArrays(nums1_case2, nums2_case2);
        printResult(nums1_case2, nums2_case2, output2, 2.5);

        // --- Test Case 3: Empty Array Case ---
        int[] nums1_case3 = {};
        int[] nums2_case3 = {1};
        // Merged array: [1] -> Median is 1.0
        double output3 = solution.findMedianSortedArrays(nums1_case3, nums2_case3);
        printResult(nums1_case3, nums2_case3, output3, 1.0);
    }

    // Helper method to log inputs and outputs clearly
    private static void printResult(int[] n1, int[] n2, double actual, double expected) {
        System.out.println("Input 1: " + Arrays.toString(n1));
        System.out.println("Input 2: " + Arrays.toString(n2));
        System.out.println("Output : " + actual);
        System.out.println("Expected: " + expected);
        System.out.println(actual == expected ? "PASS\n" : "FAIL\n");
    }
}
