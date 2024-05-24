package i_o;
import java.util.Scanner;
public class io1924 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = 0;
        for (int i = 1; i < month; i++) {
            sum += daysInMonth[i];
        }

        sum += day;

        System.out.println(daysOfWeek[sum % 7]);
    }

	}

