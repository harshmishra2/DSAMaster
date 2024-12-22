import java.util.Arrays;

public class QuickSortArray{

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
         array[index1] = array[index2];
         array[index2] = temp;
    }


    private static void quicksort(int [] array, int LowIndex, int highIndex){

        if(LowIndex>=highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = LowIndex;
        int rightPointer = highIndex;

        while(leftPointer<rightPointer){

            while(array[leftPointer] <= pivot && leftPointer<rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer<rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        quicksort(array, LowIndex, leftPointer-1);
        quicksort(array, leftPointer+1 ,highIndex);

    }

    public static void main(String args[]){
        int[] array = {2, 5, 1, 3, 4};

        int[] res = {1, 2, 3, 4, 5}; //The result we would like to achieve

        quicksort(array, 0, array.length-1);

        // System.out.println(arr);
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}