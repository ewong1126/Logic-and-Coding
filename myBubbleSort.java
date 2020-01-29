public class myBubbleSort {
    public static void main (String []args) {
        int [] myArray = {8,2,5,9,3,1,4,6,7};
        bubbleSort(myArray);
    }
    public static void swap (int []myArray,int i, int j){
        int temp = myArray[i];
        myArray[i]= myArray[j];
        myArray[j]= temp;
    }
    public static void bubbleSort (int []myArray){
        for (int i=0; i<myArray.length-1;i++) {
            for(int j=0;j<myArray.length-1-i; j++) {
                if (myArray[j] > myArray[j+1]) {
                    swap (myArray,j,j+1);
                    System.out.println(java.util.Arrays.toString(myArray));
                }
            }
    }
}
}