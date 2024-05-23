package i_o;
import java.util.Scanner;
public class io11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 입력
        int T = sc.nextInt();

        // 각 테스트 케이스에 대해 결과 출력
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);
        }

        sc.close();

	}

}
