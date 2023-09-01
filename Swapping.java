import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping");
        System.out.print("value of a:");
        int a = sc.nextInt();
         System.out.print("value of b:");
        int b = sc.nextInt();

        a = a^b;   
        b = a^b;
        a = a^b;
  
        
        System.out.println("After Swapping");
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);

        sc.close();
    }
}
