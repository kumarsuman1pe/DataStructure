package DataStructure.Java8;

import java.util.ArrayList;
import java.util.List;

public class StringAngram {
    public static void main(String[] args) {
        String input = "abced";
        String s = "dceab";
        Boolean isAnagram = checkAnagram(input, s);
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }

    private static Boolean checkAnagram(String input, String input1) {
        List<String> list = new ArrayList<>();
        return input.chars().mapToObj(e -> (char) e).sorted().toList().
                equals(input1.chars().mapToObj(e -> (char) e).sorted().toList());
    }

}
