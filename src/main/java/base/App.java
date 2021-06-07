package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int monthNum = myApp.pickMonth();
        String month = myApp.findMonth(monthNum);
        myApp.printOutput(month);
    }

    public void printOutput(String month) {
        System.out.printf("The name of the month is %s.", month);
    }

    public String findMonth(int month) {

        switch (month) {

            case 1: return "January";

            case 2: return "February";

            case 3: return "March";

            case 4: return "April";

            case 5: return "May";

            case 6: return "June";

            case 7: return "July";

            case 8: return "August";

            case 9: return "September";

            case 10: return "October";

            case 11: return "November";

            case 12: return "December";

            default: return "Invalid month";
        }
    }


    public int pickMonth() {
        System.out.print("Please enter the number of the month: ");
        return in.nextInt();
    }



}
