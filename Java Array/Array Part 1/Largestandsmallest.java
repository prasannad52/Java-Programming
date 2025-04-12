
public class Largestandsmallest {

    public static int[] finding(int numbers[]) {// int[] this is very important 
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        int[] list = {largest, smallest};
        return list;// return a list
    }

    public static void main(String[] args) {
        int numbers[] = {23, 56, 78, 33};
        int list[] = finding(numbers);
        System.out.println("Largest number is : " + list[0] + "\n" + "Smallest number is: " + list[1]);
    }
}
