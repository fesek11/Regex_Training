package org.example.Tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//        13. Write a Java program to find the word Python in a given string. If the word Python appears in the string return Java otherwise return C++. Ignore case sensitive.
        String text = "python";
        System.out.println("Original string: "+text);
        System.out.println("New string: "+thirteenth(text));
        text = "JavaScript";
        System.out.println("\nOriginal string: "+text);
        System.out.println("New string: "+thirteenth(text));
        text = "PYTHON";
        System.out.println("\nOriginal string: "+text);
        System.out.println("New string: "+thirteenth(text));
    }


    public static String thirteenth(String s) {


        return s.replaceFirst(".*Python.*", "Java").replaceFirst("[^Java]", "C++");
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
