package _13_search_algorithm.TH;

public class BinarySearch {
    static int binarySearch(int []arr , int x){
        int left = 0;
        int right = arr.length -1;

        while (right >= left) {
            int mid = (left + right) / 2;
            if (x < arr[mid])
                right = mid - 1;
            else if (x == arr[mid])
                return mid;
            else
                left = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
