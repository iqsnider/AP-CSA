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
            //initialize arrays
        
            int[] firstArray = new int[length];
            int[] secArray = new int[length];
            int[] mergeArray = new int[length * 2];     //mergeArray must be able to hold maximum length
            
            //initialize values in firstArray
        
            System.out.print("First Array:");
            for (int i = 0; i < length; i++) {
                firstArray[i] = (int) (Math.random() * 100 + 1);
                System.out.print(" " + firstArray[i]);
            }
        
            //initialize values in secArray

            System.out.print("\nSecond Array:");
            for (int i = 0; i < length; i++) {
                secArray[i] = (int) (Math.random() * 100 + 1);
                System.out.print(" " + secArray[i]);
            }
        
            //merge firstArray and secArray in an alternating fashion; excluding repeat values

            System.out.print("\nMerged Array:");
            int position = 0;
            for(int i = 0; i < length; i++){
                boolean flag = false;
                for(int j = 0; j < position; j++){
                    if(mergeArray[j] == firstArray[i]){
                        flag = true;
                    }
                }
                if(!flag){
                    mergeArray[position] = firstArray[i];
                    fillpos++;
                }
                flag = false;
                for(int j = 0; j < position; j++){
                    if(mergeArray[j] == secArray[i]){
                        flag = true;
                    }
                }
                if(!flag){
                    mergeArray[position] = secArray[i];
                    fillpos++;
                }
            }
            for (int i = 0; i < position; i++) {
                System.out.print(" " + mergeArray[i]);
            }
    }
}
