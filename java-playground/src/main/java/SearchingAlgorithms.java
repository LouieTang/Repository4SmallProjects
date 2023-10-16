package src.main.java;


public class SearchingAlgorithms {

    public static int binarySearch(int[] intArray, int target){
        int left = 0;
        int right = intArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (intArray[mid] == target) {
                return mid;
            } else if (intArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static int linearSearch(int[] intArray, int target) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
