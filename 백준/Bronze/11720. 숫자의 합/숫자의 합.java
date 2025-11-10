import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        String st= bf.readLine();
        char[] array = st.toCharArray();

        for (int j = 0; j < n; j++) {
            sum += array[j] - 48;
        }

        System.out.println(sum);
    }

}