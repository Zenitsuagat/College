import java.util.Scanner;

class TwoDimenGrade2{

    public static void subAvg(int[][] grade){
        int mathTol = 0;
        int scienceTol = 0;
        int engTol = 0;
        int hisTol = 0;

        for(int i=0;i<3;i++){
            mathTol += grade[i][0];
            scienceTol += grade[i][1];
            engTol += grade[i][2];
            hisTol += grade[i][3];
        }

        double mathAvg = (double)(mathTol / 4);
        double scienceAvg = (double)(scienceTol / 4);
        double engAvg = (double)(engTol / 4);
        double hisAvg = (double)(hisTol / 4);
        
        System.out.println("Average Scores for each Sybject : ");
        System.out.println("Math : "+mathAvg);
        System.out.println("Science : "+scienceAvg);
        System.out.println("English : "+engAvg);
        System.out.println("History : "+hisAvg);
    }

    public static void studentAvg(int[][] grade){
        System.out.println("Average Scores of Each Student : ");
        for(int i=0;i<3;i++){
            int stuTol = 0;
            stuTol += grade[i][0];
            stuTol += grade[i][1];
            stuTol += grade[i][2];
            stuTol += grade[i][3];
            double stuAVg = (double)(stuTol / 4);
            System.out.println("Student "+(i+1)+": "+stuAVg);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] grade = new int[3][4];

        System.out.println("Enter the marks of the students : ");
        for(int i=0;i<3;i++){
            System.out.println("Student "+(i+1)+": ");
            System.out.print("Math : ");
            grade[i][0] = input.nextInt();
            System.out.print("Science : ");
            grade[i][1] = input.nextInt();
            System.out.print("English : ");
            grade[i][2] = input.nextInt();
            System.out.print("History : ");
            grade[i][3] = input.nextInt();
        }

        studentAvg(grade);
        subAvg(grade);
    }
}