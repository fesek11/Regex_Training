package org.example.Tasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) {
//        2. Write a Java program that matches a string that has a p followed by zero or more q's.
//        3. Write a Java program to find sequences of lowercase letters joined by an underscore.
//        4. Write a Java program to find the sequence of one upper case letter followed by lower case letters.
//        5. Write a Java program that matches a string with a 'p' followed by anything ending in 'q'.
//        6. Write a Java program to check if a word contains the character 'g' in a given string.
//        7. Write a Java program that matches a word containing 'g', not at the start or end of the word.
//        8. Write a Java program to match a string containing only upper and lowercase letters, numbers, and underscores.
//        9. Write a Java program where a string starts with a specific number.
//        10. Write a Java program to remove leading zeros from a given IP address.
//        11. Write a Java program to check for a number at the end of a string.
//        12. Write a Java program to replace Python with Java and code with coding in a given string.
//        13. Write a Java program to find the word Python in a given string.
//        If the word Python appears in the string return Java otherwise return C++. Ignore case-sensitive.
//        14. Write a Java program to count the number of vowels in a given string using a regular expression.
//        15. Write a Java program to remove all vowels from a given string. Return the updated string.
//        16. Write a Java program to replace all vowels in a string with a specified character.
//        17. Write a Java program to count the number of decimal places in a given number.
//        18. Write a Java program to validate a personal identification number (PIN). Assume a PIN is 4, 6 or 8.
        /*19. Write a Java program to remove specific letters from a string and return the updated string.
              Specific letters: "p", "q", or "r".*/
//        20. Write a Java program that takes a number and sets a thousand separators for that number.
//        21. Write a Java program to remove all non-alphanumeric characters from a given string.
//        22. Write a Java program to validate a phone number.
//        23. Write a Java program to move all lower case letters to the front of a given word.
//        This will keep the relative position of all the letters (both upper and lower case) same.
//        24. Write a Java program to separate consonants and vowels from a given string.
//        25. Write a Java program to get the last n vowels of a given string.
//        26. Write a Java program to check whether a given string is valid hex code or not.
//        27. Write a Java program to add a dash before and after every vowel in a given string.
//        28. Write a Java program to reverse words longer than 3 in a given string.
//        29. Write a Java program to check if a given string is a mathematical expression or not.
//        30. Write a Java program to insert a dash (-) between an upper case letter and a lower case letter in a string.


    }


    public static boolean twenty_ninth(String s) {

        return s.matches("(?:(?:^|[-+*/])(?:\\s*\\-?\\d+(.?\\d+)?\\s*))+$");
    }

    public static String twenty_eighth(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for (String word : words) {
            if (word.length() > 3) {
                answer.append(new StringBuilder(word).reverse());
            } else {
                answer.append(word);
            }
            answer.append(" ");
        }
        return answer.toString();
    }

    public static String twenty_seventh(String s) {
        return s.replaceAll("(?i)[aoeiuy]", "-$0-");
    }

    public static boolean twenty_sixth(String s) {
        return switch (s.length()) {
            case 7 -> s.matches("#(?i)[a-f0-9]{6}");
            case 4 -> s.matches("#(?i)[a-f0-9]{3}");
            default -> false;
        };

    }

    public static String twenty_fifth(String s, int n) {
        String temp = s.replaceAll("(?i)[^aoeiuy]", "");
        return n > temp.length() ? "Error! n is greater than string" : temp.substring(temp.length() - n);

    }

    public static String twenty_forth(String s) {
        return s.replaceAll("((?i)[aoeiuy]*)", " $1");

    }

    public static String twenty_third(String s) {
        return s.replaceAll("[^a-z]", "") + s.replaceAll("[^A-Z]", "");

    }

    public static boolean twenty_second(String s) {
        return s.matches("\\+\\d{2}\\(?\\d{3}\\)? ?\\d{7}");

    }

    public static String twenty_first(String s) {
        return s.replaceAll("(?i)[a-z]", "");

    }

    public static String twentieth(int s) {
        return String.format("%,d", s).replaceAll("\\W", "*");

    }

    public static String nineteen(String s) {
        return s.replaceAll("(?i)[pqr]", "");

    }

    public static boolean eighteen(String s) {
        return s.matches("\\d{4}|\\d{6}|\\d{8}");
    }

    public static int seventeen(String s) {
//        if (s.contains(".")) return s.replaceAll("[0-9]+[.]", "").length();
//        return 0;
        if (s.contains(".")) return s.replaceAll("\\d+[.]+(?=\\d+)", "").length();
        return 0;

    }

    public static String sixteenth(String s, char symbol) {
        return s.replaceAll("((?i)[aeiou])", "" + symbol);
    }

    public static String fifteenth(String s) {
        return s.replaceAll("(?i)[aeiou]", "");
    }

    public static int fourteenth(String s) {
        return s.toLowerCase().replaceAll("[^aeiou]", "").length();
    }

    public static String thirteenth(String s) {
        return s.toLowerCase().replaceFirst(".*[java].*", "C++").replaceFirst(".*[python].*", "Java");
    }

    public static String twelfth(String s) {

        return s.replaceFirst("Python", "Java").replaceFirst("code", "coding");
    }

    public static boolean eleventh(String s) {
        final Pattern pattern = Pattern.compile("[\\d]+$");
        final Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static String tenth(String s) {
        final Pattern pattern = Pattern.compile("\\b0*");
        final Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("");
    }

    public static boolean ninth(String s) {
        Pattern pattern = Pattern.compile("^5.*$");
        Matcher m = pattern.matcher(s);
        return m.find();
    }

    public static boolean eighth(String s) {
        Pattern pattern = Pattern.compile("^[\\w]+$");
        Matcher m = pattern.matcher(s);
        return m.find();
    }

    public static boolean seventh(String s) {
        Pattern pattern = Pattern.compile("\\Bg\\B");
        Matcher m = pattern.matcher(s);
        return m.find();
    }

    public static boolean sixth(String s) {
        return s.matches("\\w*g\\w*");
    }

    public static boolean fifth(String s) {
        return s.matches("p.*q$");
    }

    public static boolean forth(String s) {
        return s.matches("[A-Z][a-z]+$");
    }

    public static boolean third(String s) {
        return s.matches("([a-z]+_[a-z]+ )+");
    }

    public static boolean second(String s) {
        return s.matches("pq*?");
    }
}
