import java.util.Scanner;

class BMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Height : ");
        Float h = input.nextFloat();
        System.out.print("Weight : ");
        Float w = input.nextFloat();

        Float bmi = w / (h * h);

        if(bmi < 18.5){
            System.out.println("BMI : "+bmi+", Category : Underweight");
        }
        else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println("BMI : "+bmi+", Category : Normal weight");
        }
        else if(bmi <= 25 && bmi < 29.9){
            System.out.println("BMI : "+bmi+", Category : Overweight");
        }
        else if(bmi >= 30){
            System.out.println("BMI : "+bmi+", Category : Obesity");
        }
    }
}