package i_o;
import java.util.Scanner;
public class io11721 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }

	}

}
