class Solution {
    public int tribonacci(int n) {

        int[] arr = new int[n+3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 2; i < n; i++)
            arr[i + 1] = arr[i] + arr[i - 1] + arr[i - 2];

        return arr[n];

    }
}
