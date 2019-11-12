import java.util.Scanner;
import java.lang.Math;

class Assignment6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length (must be 10 or greater):");
        int length = scanner.nextInt();
        while (length < 10){
            System.out.println("Enter an array length (must be 10 or greater):");
            length = scanner.nextInt();
        }
            int[] firstArray = new int[length];
            int[] secArray = new int[length];
            int[] mergeArray = new int[length * 2];

            System.out.print("First Array:");
            for (int i = 0; i < length; i++) {
                firstArray[i] = (int) (Math.random() * 100 + 1);
                System.out.print(" " + firstArray[i]);
            }

            System.out.print("\nSecond Array:");
            for (int i = 0; i < length; i++) {
                secArray[i] = (int) (Math.random() * 100 + 1);
                System.out.print(" " + secArray[i]);
            }

            System.out.print("\nMerged Array:");
            int fillpos = 0;
            for(int i = 0; i < length; i++){
                boolean flag = false;
                for(int j = 0; j < fillpos; j++){
                    if(mergeArray[j] == firstArray[i]){
                        flag = true;
                    }
                }
                if(!flag){
                    mergeArray[fillpos] = firstArray[i];
                    fillpos++;
                }
                flag = false;
                for(int j = 0; j < fillpos; j++){
                    if(mergeArray[j] == secArray[i]){
                        flag = true;
                    }
                }
                if(!flag){
                    mergeArray[fillpos] = secArray[i];
                    fillpos++;
                }
            }
            for (int i = 0; i < fillpos; i++) {
                System.out.print(" " + mergeArray[i]);
            }
    }
}
