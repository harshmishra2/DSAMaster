//code was built using "code with john" from youtube as reference guide on the same

import java.util.Random;

public class MergeSort{
    public static void main(String args[]){
        // System.out.println("We gonna make some sorts here.");

        int[] array = new int[10];
        Random rand = new Random();

        for(int i=0; i<10; i++){
            array[i] = rand.nextInt(100000);
        }

        System.out.println("Before");
        printArray(array);
        mergeSort(array);
        System.out.println("After");
        printArray(array);

    }

    private static void mergeSort(int[] inputArray){

        int arraySize = inputArray.length;

        if(arraySize <2 ){
            return;
        }

        int midIndex = arraySize/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arraySize-midIndex];

        for(int i=0; i<midIndex; i++){
            leftHalf[i]= inputArray[i];
        }
        for(int i=midIndex; i<arraySize; i++){
            rightHalf[i-midIndex]= inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize= rightHalf.length;
        int inputSize= inputArray.length;

        int i=0;
        int j=0;
        int k=0;

        while(i<leftSize && j<rightSize){
            
            if(leftHalf[i]<rightHalf[j]){
                inputArray[k]= leftHalf[i];
                i++;
            }else{
                inputArray[k]= rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            inputArray[k]= leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k]= rightHalf[j];
            j++;
            k++;
        }

    }

    private static void printArray(int[] array){
        for(int n: array){
            System.out.println(n);
        }
    }
}
