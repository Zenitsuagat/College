import java.util.Scanner;

class Animal{
    String speciesName;

    public void setName(String name){
        this.speciesName = name;
    }
}

class Mammal extends Animal{
    boolean hasFur = false;

    public void setFur(String fur){
        if(fur.equals(true)){
            this.hasFur = true;
        }
        else{
            this.hasFur = false;
        }
    }
}

class Dog extends Mammal{
    String breed;

    public void setBreed(String b){
        this.breed = b;
    }
}


class MultiLevelInheritanceAnimal{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the species name : ");
        String name = input.nextLine();
        System.out.print("Has Fur (true / false) : ");
        String bool = input.nextLine();
        System.out.print("Enter Breed : ");
        String bred = input.nextLine();

        Dog obj = new Dog();
        obj.setName(name);
        obj.setFur(bool);
        obj.setBreed(bred);

        System.out.println("Species name : "+obj.speciesName);
        System.out.println("Has Fur : "+obj.hasFur);
        System.out.println("Breed : "+obj.breed);
    }
}