class Solution {
    public void sortColors(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
    }

    public static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] A, int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m;
        int[] la = new int[n1];
        int[] ra = new int[n2];

        for (int i = 0; i < n1; i++) {
            la[i] = A[s + i];
        }
        for (int i = 0; i < n2; i++) {
            ra[i] = A[m + 1 + i];
        }

        int k = s, i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (la[i] < ra[j]) {
                A[k] = la[i];
                i++;
            } else {
                A[k] = ra[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = la[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = ra[j];
            j++;
            k++;
        }
    }
}
