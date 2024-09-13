package Practices;

public class Practice14_Proper_MergeSort {

    public void mergeSort(int[] unsortedArray, int lowIndex, int highIndex) {
        //base case - stop when low >= high to define only one index left
        if (lowIndex >= highIndex) return;
        //divide
        int middleIndex = lowIndex + (highIndex - lowIndex) / 2;

        mergeSort(unsortedArray, lowIndex, middleIndex);
        mergeSort(unsortedArray, middleIndex + 1, highIndex);
        //conquer
        conquer(unsortedArray, lowIndex, middleIndex, highIndex);
    }

    public void conquer(int[] unsortedArray, int lowIndex, int middleIndex, int highIndex) {
        //define temporary first index of the first array which will be modified
        int startIndexFirstArray = lowIndex;
        //define temporary first index of the second array which will be modified
        int startIndexSecondArray = middleIndex + 1;
        //define a temporary array to insert sorted data
        int[] temp = new int[highIndex-lowIndex+1];
        //define a temporary index of temporary array
        int tempIndex = 0;

        //iterate through the both array
        while (startIndexFirstArray<=middleIndex && startIndexSecondArray<=highIndex){
            //compare the value with one array to another array
            if (unsortedArray[startIndexFirstArray]<=unsortedArray[startIndexSecondArray]){
                temp[tempIndex]=unsortedArray[startIndexFirstArray];
                tempIndex++;
                startIndexFirstArray++;
            }else {
                temp[tempIndex]=unsortedArray[startIndexSecondArray];
                tempIndex++;
                startIndexSecondArray++;
            }
        }

        while (startIndexFirstArray<=middleIndex){
            temp[tempIndex]=unsortedArray[startIndexFirstArray];
            tempIndex++;
            startIndexFirstArray++;
        }

        while (startIndexSecondArray<=highIndex){
            temp[tempIndex]=unsortedArray[startIndexSecondArray];
            tempIndex++;
            startIndexSecondArray++;
        }

        //merge the temporary array to the main array
        for (int i = 0,  j=lowIndex; i < temp.length ; i++, j++) {
            unsortedArray[j]=temp[i];
        }
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i]+" ");
        }
        System.out.println();
    }
}
