import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday in the form MM/DD/YYYY: ");
        String birthdayStr = scanner.nextLine();
        int month  = Integer.parseInt(birthdayStr.substring(0, 2));
        int day = Integer.parseInt(birthdayStr.substring(3, 5));
        int year = Integer.parseInt(birthdayStr.substring(6));
        String total = Integer.toString(month + day + year);
        System.out.println(total);
        Day birthday = new Day(year, month, day);

        System.out.println(birthday.daysFromToday());
        
    }


}
