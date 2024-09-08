import java.util.Scanner;

class ManageScore{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] score = new int[5];

        System.out.println("Enter the value scores : ");

        for(int i=0;i<5;i++){
            System.out.print("Score "+(i+1)+": ");
            score[i] = input.nextInt();
        }
        
        int total = 0;
        int h = score[0];
        int l = score[0];

        for(int i=0;i<5;i++){
            total += score[i];

            if(score[i] > h){
                h = score[i];
            }

            if(score[i] < l){
                l = score[i];
            }
        }

        double avg = (double)(total / 5);

        System.out.print("Scores : ");
        for(int i=0;i<5;i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
        System.out.println("Average Score : "+avg);
        System.out.println("Highest Score : "+h);
        System.out.println("Lowest Score : "+l);
    }
}