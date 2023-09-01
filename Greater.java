import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        ans = Math.max(a, b);
        ans = Math.max(ans, c);

        System.out.println("Largest number is:"+ans);

        sc.close();

    }
    
}
