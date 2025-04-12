// this should be dry run every time when you read

public class Insertiondescending {

    public static void sorting(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {// traversing 1st index to last incex
            int cur = numbers[i];// storing the current element pos to put it in correct pos
            int prev = i - 1;// storing next element pos
            //finding out the correct pos to insert
            while (prev >= 0 && numbers[prev] < cur) { //checking the condition 
                numbers[prev + 1] = numbers[prev];
                prev--;// decrementing the prev pos
            }
            //inserting the cur element to the correct pos
            numbers[prev + 1] = cur;
        }
    }

    public static void printing(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sorting(numbers);
        printing(numbers);
    }
}
