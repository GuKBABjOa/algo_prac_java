package i_o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class io11720 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            
            String numbers = reader.readLine();

            int sum = 0;
       
            for (int i = 0; i < N; i++) {
                sum += Character.getNumericValue(numbers.charAt(i));
            }

            System.out.println(sum);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
