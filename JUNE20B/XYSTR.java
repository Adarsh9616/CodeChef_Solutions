import java.util.Scanner;

public class XYSTR
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {

            String input = sc.next();
            int count = 0;
            int start = 0;
            while (start < input.length()-1) {
                if (input.substring(start, start+2).equals("xy") || input.substring(start, start+2).equals("yx") ) {
                    count++;
                    start+=2;
                } else {
                    start +=1;
                }
            }

            System.out.println(count);
        }

    }
}