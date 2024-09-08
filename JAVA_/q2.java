import java.util.Scanner;
class q2{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the Item1 : ");
        String item1 = input.nextLine();
        System.out.print("Enter the Quantity of the Item1 : ");
        int q1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter the Price of the Item1 : ");
        float p1 = input.nextFloat();
        input.nextLine();

        System.out.print("Enter the name of the Item2 : ");
        String item2 = input.nextLine();
        System.out.print("Enter the Quantity of the Item2 : ");
        int q2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter the Price of the Item2 : ");
        float p2 = input.nextFloat();
        input.nextLine();

        System.out.print("Enter the name of the Item3 : ");
        String item3 = input.nextLine();
        System.out.print("Enter the Quantity of the Item3 : ");
        int q3 = input.nextInt();
        input.nextLine();
        System.out.print("Enter the Price of the Item3 : ");
        float p3 = input.nextFloat();
        input.nextLine();

        System.out.println("Item:"+item1+"\t"+"Quantity:"+q1+"\t"+"Price:$"+p1);
        System.out.println("Item:"+item2+"\t"+"Quantity:"+q2+"\t"+"Price:$"+p2);
        System.out.println("Item:"+item3+"\t"+"Quantity:"+q3+"\t"+"Price:$"+p3);

    }
}
