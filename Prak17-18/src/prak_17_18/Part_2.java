package prak_17_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part_2 {
    public static void MAC()
    {
        System.out.println("Enter the address");
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher matcher = pattern.matcher(scan.nextLine());
        if(matcher.matches())
        {
            System.out.println("Matches");
        }
        else
        {
            System.out.println("Doesn`t match");
        }
    }
}
