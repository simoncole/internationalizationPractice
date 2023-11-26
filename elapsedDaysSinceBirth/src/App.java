import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday in the form MM/DD/YYYY: ");
        String birthdayStr = scanner.nextLine();
        int birthMonth  = Integer.parseInt(birthdayStr.substring(0, 2));
        int birthDayDay = Integer.parseInt(birthdayStr.substring(3, 5));
        int birthYear = Integer.parseInt(birthdayStr.substring(6));

        Day birthday = new Day(birthYear, birthMonth, birthDayDay);

        System.out.println(birthday.daysFromToday());

        scanner.close();
    }

    //Requires: all duplicates must be in succession to one another.
    public static void removeDuplicates(List lst) {
        if (lst == null || lst.size() == 0) return;
        List copy = new ArrayList(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while(elements.hasNext()) {
            Object nex = elements.next();
            if (pre.equals(nex)) lst.remove(nex);
            else pre = nex;
        }
    }

}


