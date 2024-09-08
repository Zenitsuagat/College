import java.util.Scanner;

class NameList{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] nameList = new String[5];

        System.out.println("Enter the names : ");

        for(int i=0;i<5;i++){
            System.out.print("Name "+(i+1)+": ");
            nameList[i] = input.nextLine();
        }

        int l = nameList[0].length();
        int s = nameList[0].length();
        int li = 0;
        int si = 0;

        System.out.print("Name in Reverse Order : ");

        for(int i=4;i>=0;i--){
            System.out.print(nameList[i]);

            if(i != 0){
                System.out.print(", ");
            }

            if(nameList[i].length() > l){
                l = nameList[i].length();
                li = i;
            }

            if(nameList[i].length() < s){
                s = nameList[i].length();
                si = i;
            }
        }
        System.out.println();
        System.out.println("Longest Name : "+nameList[li]);
        System.out.println("Shortest Name : "+nameList[si]);
    }
}