//This code was made referencing to "coding with john" youtube guy

public class BinarySearch{
    public static void main(String args[]){
        int[] ints = {1, 2, 3, 4, 5, 6, 9, 11};

        System.out.println(binarySearch(ints, 9));
        System.out.println(binarySearch(ints, 1));
        System.out.println(binarySearch(ints, 11));
        System.out.println(binarySearch(ints, 8));
    }

    private static int binarySearch(int [] inputArray, int inputToFind){
        int low = 0;
        int high = inputArray.length;

        while(low <= high){

            int middlePosition = (low+high)/2;

            if(inputToFind == inputArray[middlePosition]){
                return middlePosition;
            }
            if(inputToFind < inputArray[middlePosition]){
                high = middlePosition -1;
            }else{
                low = middlePosition +1;
            }
        }
        return -1;
    }
}
