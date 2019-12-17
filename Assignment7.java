/*Create three static methods
1. the method duplicate returns every character duplicated three times
2. the method EdhesivePalindrome returns true or false depending on whether a String is a palindrome
3. the method number Scramble returns a value type of double
*/

import java.util.Scanner;
import java.lang.Math;
public class Assignment7 {
    //main method
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //test duplicate
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String val1 = scanner.nextLine();
        String duplicatedString = duplicate(val1);
        System.out.println("The duplicated String is: " + duplicatedString);

        // test isEdhesivePalindrome
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String val2 = scanner.nextLine();
        boolean result = isEdhesivePalindrome(val2);
        if(result)
            System.out.println("Nice, you found an Edhesive Palindrome!");
        else
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");

        //test numberScramble
        System.out.println("Almost done! Please enter a number to scramble.");
        double val3 = scanner.nextDouble();
        double scrambleNumber = numberScramble(val3);
        System.out.println("The scrambled number is: " + scrambleNumber);
    }

    //numberScramble method
    public static double numberScramble (double num){
        if(num < 0)
            return 0;
        num += 5;
        num /= 2;
        num = Math.sqrt(num);
        return num;
    }

    //duplicate method
    public static String duplicate(String str){
        String result = "";
        int n = str.length();
        if(n % 2 == 0)
            n *= 2;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < n; j++){
                result += str.charAt(i);
            }
        }
        return result;
    }

    //isEdhesivePalindrome method
    public static boolean isEdhesivePalindrome(String str){
        if(str.length() <= 3 || str.length() >= 15)
            return false;
        String temp = str.toLowerCase();
        temp = temp.replaceAll("4","a");
        temp = temp.replaceAll("3","e");
        temp = temp.replaceAll("0","o");

        for(int i = 0; i < temp.length()/2; i++){
            char frontChar = temp.charAt(i);
            char backChar = temp.charAt(temp.length()-1-i);
            if(frontChar != backChar)
                return false;
        }
        return true;
    }
}


