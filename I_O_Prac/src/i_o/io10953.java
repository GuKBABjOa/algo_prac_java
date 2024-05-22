package i_o;
import java.util.Scanner;
import java.util.StringTokenizer;
public class io10953 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringTokenizer st;
		String str;
		int t = scanner.nextInt();
		
        for(int i=0;i<t;i++) {
            str = scanner.next();
            st = new StringTokenizer(str,",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            		
            System.out.println(A + B);
        }
        scanner.close();

	}

}
