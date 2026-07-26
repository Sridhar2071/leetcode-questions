class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                return num;
            }
        }
        return -1;
    }

    public boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}