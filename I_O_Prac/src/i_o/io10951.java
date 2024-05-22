package i_o;
import java.util.Scanner;
public class io10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;
            System.out.println(sum);
        }
        sc.close();

	}

}
