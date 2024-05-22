package i_o;
import java.util.Scanner;
public class io10952 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }
        scanner.close();

	}

}
