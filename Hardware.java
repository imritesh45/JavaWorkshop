import java.util.Scanner;

public class Hardware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase price of ssd:");
        int ssd = sc.nextInt();
        
        System.out.println("Enter the purchase price of hdd:");
        int hdd = sc.nextInt();
        System.out.println("Enter the purchase price of ssd:");
        int ram = sc.nextInt();

        System.out.println("Enter the selling price of ssd:");
        int s_ssd = sc.nextInt();
        System.out.println("Enter the selling price of hdd:");
        int s_hdd = sc.nextInt();
        System.out.println("Enter the selling price of ram:");
        int s_ram = sc.nextInt();

        int total_purchase_price = ssd+hdd+ram;
        int total_selling_price = s_ssd+s_hdd+s_ram;

        if(total_selling_price<total_purchase_price){
            System.out.println("Loss of:"+(total_purchase_price-total_selling_price));

        }
        else{
            System.out.println("Profit of:"+(total_selling_price-total_purchase_price));
        }
        sc.close();

    }
}
