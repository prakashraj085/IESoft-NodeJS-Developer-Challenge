import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char nextChar = (i + 1 < str.length()) ? str.charAt(i + 1) : '/0';

            if (currentChar == nextChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                count = 1;
            }
        }
         
        String finalOutput = result.toString() + "bcy1wgkf36";

        for (int i = 3; i < finalOutput.length(); i++) {
            if(i%3==0){
            finalOutput = finalOutput.substring(0, i-1) + "X" + finalOutput.substring(i);
            }
        }

        return finalOutput;
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println(StringChallenge(s.nextLine()));
    }
}
