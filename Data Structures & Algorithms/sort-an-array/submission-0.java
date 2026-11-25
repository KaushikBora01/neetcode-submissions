class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] nums, int s, int e) {
        if (s >= e) return;

        int mid = s + (e - s) / 2;

        mergeSort(nums, s, mid);
        mergeSort(nums, mid + 1, e);

        merge(nums, s, mid, e);
    }

    void merge(int[] nums, int s, int mid, int e) {
        int[] temp = new int[e - s + 1];

        int i = s, j = mid + 1, k = 0;

        while (i <= mid && j <= e) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= e) temp[k++] = nums[j++];

        for (int x = 0; x < temp.length; x++) {
            nums[s + x] = temp[x];
        }
    }
}
    
