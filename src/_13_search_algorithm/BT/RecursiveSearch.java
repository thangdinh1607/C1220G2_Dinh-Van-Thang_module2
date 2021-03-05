package _13_search_algorithm.BT;

import java.util.List;

public class RecursiveSearch {
    int recursiveSearch(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = (r + l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return recursiveSearch(arr, l, mid - 1, x);
            } else
                return recursiveSearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        RecursiveSearch recursive = new RecursiveSearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int r = arr.length - 1;
        int x = 1;
        int result = recursive.recursiveSearch(arr, 0, r, x);

        if (result == -1) {
            System.out.println("not found x");
        } else
            System.out.println("x=" + x + "index=" + result);
    }
}
