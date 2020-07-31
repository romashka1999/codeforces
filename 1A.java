import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int x = n / a;
        int y = m / a;
        if(n % a != 0) x++;
        if(m % a != 0) y++;
        System.out.println((long)x*y);
    }

}