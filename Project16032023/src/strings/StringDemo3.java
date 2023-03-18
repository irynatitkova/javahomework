package strings;

import java.util.Locale;

class StringDemo3 {
    public static void main(String[] args) {
        String str = "I study basic Java!";{

        }
        System.out.println("I study basic Java");
        System.out.println("Java" .replace('a', 'o'));

        char ch = str .charAt(1);

        System.out.println(ch);
        System.out.println("I study basic Java" .toLowerCase());
        System.out.println("I study basic Java" .toUpperCase());
        System.out.println("I study basic Java" .substring(14, 18));
        System.out.println("I study basic Java" .contains("Java"));
        System.out.println("I study basic Java" .charAt(17));


    }
}