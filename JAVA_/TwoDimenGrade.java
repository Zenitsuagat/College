import java.util.Scanner;

class TwoDimenGrade{

    public static void printGrade(int[][] grade){
        System.out.println("Grades of all students : ");
        for(int i=0;i<grade.length;i++){
            System.out.println("Student "+(i+1)+": "+"Math : "+grade[i][0]+", Science : "+grade[i][1]);
        }
    }

    public static void printAvg(int[][] grade){
        int mathTol = 0;
        int scienceTol = 0;

        for(int i=0;i<grade.length;i++){
            mathTol += grade[i][0];
            scienceTol += grade[i][1];
        }

        double mathAvg = (double)(mathTol / grade.length);
        double ScienceAvg = (double)(scienceTol / grade.length);

        System.out.println("\nAverage Math Grade : "+mathAvg);
        System.out.println("Average Science Grade : "+ScienceAvg);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] grade = new int[5][2];

        System.out.println("Enter the mark of the student : ");
        for(int i = 0;i<5;i++){
            System.out.print("Student "+(i+1)+": ");
                System.out.print("Math : ");
                grade[i][0] = input.nextInt();
                System.out.print("Science : ");
                grade[i][1] = input.nextInt();
        }

        printGrade(grade);
        printAvg(grade);
    }
}