import java.util.*;

public class codingProblems {
    public static void main(String[] args) {
        String string = "Boundaries is the best metal band";
        int[] numArray = {1,2,3,4,5,7,8,9,10,11};
        String word1 = "save peta";
        String word2 = "vase tape";

        System.out.println("Below are some simple problem solutions");
        System.out.println("1. Given a string, capitalize the first half");
        System.out.println(uppercaseFirstHalf(string) + "\n");
        System.out.println("2. Given an array of consecutive numbers, starting from 1. Find the missing number");
        System.out.println("The missing number is: " + missingNumber(numArray) + "\n");
        System.out.println("3. Re create a merge sort algorithm");
        System.out.println("4. Anagram check using " + word1 + " and " + word2 + " : " + anagramCheck(word1, word2));

    }

    public static String uppercaseFirstHalf(String string){
        String finalString = "";

        return finalString;
    }

    public static Boolean anagramCheck(String word1, String word2){
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return (Arrays.equals(first, second));

    }

    public static int missingNumber(int[] array){
        int sum = 0;
        int max = 0;
        int length = array.length;

        // Can be enhanced - I like to see what is happening.
        // Also, we know the numbers start at 1 so can we use length-1 for max
        for(int i = 0; i < length; i++){
            sum += array[i];
            if(array[i] > max) {
                max = array[i];
            }
        }
        return (max * (max + 1) /2) - sum;
    }
}