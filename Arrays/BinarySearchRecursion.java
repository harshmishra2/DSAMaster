public class BinarySearchRecursion{
    public static void main(String [] args){
        int[] ints = {1, 2, 3, 4, 5, 6, 9, 11};

        System.out.println(binarySearch(ints, 9, 0, 7));
        System.out.println(binarySearch(ints, 1, 0, 7));
        System.out.println(binarySearch(ints, 11, 0, 7));
        System.out.println(binarySearch(ints, 8, 0, 7));
    }

    private static int binarySearch(int[] numbers, int numToFind, int low, int high){

        int start = low;
        int end = high;

        if(numToFind<numbers[start]){
            return -1;
        }

        int middlePosition = (start+end)/2;


        if(numbers[middlePosition] == numToFind){
            return middlePosition;
        }
        if(numToFind < numbers[middlePosition]){
            return binarySearch(numbers, numToFind, start, middlePosition-1);
        }
        // if(numToFind> numbers[middlePosition]){
            else{
            return binarySearch(numbers, numToFind, middlePosition+1, end);
        }
    }
}