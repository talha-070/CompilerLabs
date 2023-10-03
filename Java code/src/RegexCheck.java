import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

        public static void main(String[] args) {
            String input;
            Scanner in = new Scanner(System.in);
            System.out.println("Regular Expression For Matching Constants");
            System.out.print("Enter Expression Space Seperated: ");
            input = in.nextLine();
            Pattern pattern = Pattern.compile("^[0-9][0-9]*(([\\.][0-9][0-9]*)?([e][+|-][0-9][0-9]*)?)?$");
            for (String data : input.split(",")) {
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    System.out.println("Match Found");
                } else {
                    System.out.println("Match Not Found");
                }
            }
            System.out.println("Regular Expression for Matching Keywords e.g. [int, float, double, if, etc]");
            System.out.print("Enter Expression Space Seperated: ");
            input = in.nextLine();
            pattern = Pattern.compile("^(int|float|char|for|while|if|switch|case|default|break|else)$");
            for (String data : input.split(",")) {
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    System.out.println("Match Found");
                } else {
                    System.out.println("Match Not Found");
                }
            }
            System.out.println("Regular Expression for Macthing Floating Point Numbers With Max 6 digits");
            System.out.print("Enter Expression Space Seperated: ");
            input = in.nextLine();
            pattern = Pattern.compile("^[0-9][0-9]*[\\.]\\d{1,6}$");
            for (String data : input.split(",")) {
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    System.out.println("Match Found");
                } else {
                    System.out.println("Match Not Found");
                }
            }
            System.out.println("Regular Expression for Macthing Numbers with Exponentials");
            System.out.print("Enter Expression Space Seperated: ");
            input = in.nextLine();
            pattern = Pattern.compile("^[0-9][0-9]*[e|E][\\-|+]{0,1}[0-9][0-9]*$");
            for (String data : input.split(",")) {
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    System.out.println("Match Found");
                } else {
                    System.out.println("Match Not Found");
                }
            }
            System.out.println("Regular Expression to Find Word Starting with t or m");
            System.out.print("Enter Expression Space Seperated: ");
            input = in.nextLine();
            pattern = Pattern.compile("^[t|m]");
            for (String data : input.split(" ")) {
                Matcher matcher = pattern.matcher(data);
                if (matcher.find()) {
                    System.out.println(data);

                }
                else {
                    System.out.println("Match Not Found");
                }
            }
        }

    }

