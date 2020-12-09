package Problem1;

public class BinarySearch {

    public static int b = 0;
    public static int mid;

    public static void main(String[] args){
        int[] data = {0, 1, 3, 5 ,8, 9};
        binarySearch(data, 0);

    }
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls

    public static int binarySearch(int[] data, int target) {
        // homework
        if( b == 0){
            mid = ((0 + (data.length-1)) / 2);
            b++;
        }
        System.out.println("Current mid is: " + data[mid]);
        if(data[mid] == target){
            return data[mid];
        } else if(target > data[mid]){
            mid = ((mid + (data.length - 1)) / 2);
        } else if(target < data[mid]) {
            mid = ((0 + mid) / 2);
        }
        System.out.println("mid is now: " + data[mid]);
        binarySearch(data, target);
        return -1;
    }
}
