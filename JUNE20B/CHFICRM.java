import java.util.Scanner;

public class CHFICRM
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int i, n, count5, count10;

        int arr[];

        while (t-- > 0) {
            count5 = count10 = 0;

            n = sc.nextInt();
            arr = new int[n];

            for (i = 0; i < n; i++)
                arr[i] = sc.nextInt();


            for (i = 0; i < n; i++) {

                if (arr[i] == 5) {
                    count5++;
                } else if (arr[i] == 10) {
                    if (count5 > 0) {
                        count5--;
                        count10++;
                    } else
                        break;
                } else if (arr[i] == 15) {
                    if (count5 > 1 || count10 > 0) {
                        if (count10 > 0) {
                            count10--;
                        } else {
                            count5 -= 2;
                        }
                    } else
                        break;
                }
            }

            if (i == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}