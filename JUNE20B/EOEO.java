import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class EOEO
{
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            BigInteger TS = new BigInteger((br.readLine()));
            BigInteger b2 = new BigInteger("2");
            while (TS.mod(b2).signum() == 0) {
                TS = TS.divide(b2);
            }
            System.out.println(TS.divide(b2).toString());
        }
    }

}
