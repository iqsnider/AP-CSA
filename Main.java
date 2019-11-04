import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want the array?");
        int list = scanner.nextInt();

        if (list <= 0){
            System.out.println("Not a valid length!");
        }
        else{
            double[] array = new double[list];
            double sum = 0;
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            boolean incr = true;
            boolean dcr = true;

            for (int i = 0; i < list;i++){
                System.out.println("Enter a number");
                array[i] = scanner.nextDouble();
                sum += array[i];

                if(array[i] > max){
                    max = array[i];
                }
                if(array[i] < min){
                    min = array[i];
                }
                if (i > 0){
                    if (array[i] < array[i-1]) {
                        incr = false;
                    }
                    if (array[i] > array[i-1]) {
                        dcr = false;
                    }
                }

                }
            System.out.print("Your array is {");
            for (int i = 0; i < list -1; i++){
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[list - 1] + "}");
            System.out.println("\nThe average is " + (sum/list));
            System.out.println("The range is " + (max - min));

            if(incr){
                System.out.println("The array is sorted in increasing order");
            }
            else if(dcr){
                System.out.println("The array is sorted in decreasing order");
            }
            else{
                System.out.println("The array is unsorted");
            }
        }
    }
}
