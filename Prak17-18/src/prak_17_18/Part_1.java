package prak_17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part_1 {
    public static void Stroki()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(scan.nextLine());
        if (matcher.matches())
        {
            System.out.println("The string matches pattern");
        }
        else
        {
            System.out.println("The string doesn`t match pattern");
        }
    }
}
