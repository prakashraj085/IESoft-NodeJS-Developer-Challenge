import java.util.*;
import java.io.*;

class Main{
    public static String StringChallenge(String sen) {
        String[] words = sen.split("[^a-zA-Z0-9]+");

        int longestWordIndex = 0;
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWordIndex) {
                longestWord = words[i];
                longestWordIndex = words[i].length();
            }
        }

        String finalOutput = longestWord + "bcy1wgkf36";

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
