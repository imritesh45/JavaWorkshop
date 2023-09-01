import java.util.Scanner;

public class ProfitandLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase price:");
        int purchase_price = sc.nextInt();
        System.out.println("Enter the selling Price");
        int selling_price = sc.nextInt();

        if(selling_price<purchase_price){
            System.out.println("Loss of:"+(purchase_price-selling_price));

        }
        else{
            System.out.println("Profit of:"+(selling_price-purchase_price));
        }
        sc.close();
    }
}
