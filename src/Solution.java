import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int list[]= new int [10];

        randomFill(list);
        printArr(list);
        bubbleSort(list);
        printArr(list);
    }
    public static void printArr(int[] list){
        System.out.print("[");
        for (int i = 0; i < list.length-1;i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");
    }
    public static void randomFill (int[] list){
        Random rd = new Random();
        for (int i = 0; i < list.length; i++){
            list[i] = rd.nextInt(100);
        }
    }
    public static void bubbleSort (int [] number){
        for (int i = 0; i < number.length; i++){
            for(int k = 0; k < number.length - 1; k++){
                if (number[k] > number[k+1]){
                    int temp = number[k];
                    number[k] = number[k+1];
                    number[k+1] = temp;
                }
            }
        }
    }
}
