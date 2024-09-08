import java.util.Scanner;

class Item{
    String itemName;
    int noOfItems;
    double itemPrice;
    static int tolItemSold = 0;
    static double tolRevenue = 0;

    Item(String itemName, double itemPrice, int noOfItems){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.noOfItems = noOfItems;
    }

    public static void getTotalItemSold(){
        System.out.println("Total Item Sold : "+Item.tolItemSold);
    }

    public static void getTotalRevenue(){
        System.out.println("Total Revenue : $"+Item.tolRevenue);
    }

    public void sellItem(double itemPrice, int noOfItems){
        Item.tolItemSold += noOfItems;
        double tolPrice = noOfItems * itemPrice;
        Item.tolRevenue += tolPrice;
    }
}

class StoreRevenue{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items : ");
        int n = input.nextInt();
        input.nextLine();

        Item[] items = new Item[n];
        System.out.println("Enter the Info of Items : ");
        for(int i = 0;i<n;i++){
            System.out.print("Enter the NAme of the item "+(i+1)+" : ");
            String itemname = input.nextLine();
            System.out.print("Enter the price of the item "+(i+1)+" : ");
            double price = input.nextDouble();
            System.out.print("Enter the no of Items to be sold : ");
            int num = input.nextInt();
            input.nextLine();

            items[i] = new Item(itemname, price, num);
            items[i].sellItem(price, num);
        }

        Item.getTotalItemSold();
        Item.getTotalRevenue();
    }
}