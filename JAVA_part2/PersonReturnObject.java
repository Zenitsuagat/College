class Person{
    String pName;
    int pAge;

    public Person(String name, int age){
        pName = name;
        pAge = age;
    }

    public void displayDetails(){
        System.out.println("Person Name : "+pName+" Updated Age : "+pAge);
    }
}

class PersonProcessor{
    public Person updatePerson(Person person){
        person.pAge += 1;
        return person;
    }
}

class PersonReturnObject{
    public static void main(String args[]){
        //CASE 1
        Person alice = new Person("Alice", 25);
        PersonProcessor processor = new PersonProcessor();
        Person updatedAlice = processor.updatePerson(alice);
        updatedAlice.displayDetails();
        //CASE 2
        Person bob = new Person("Bob", 30);
        PersonProcessor processor = new PersonProcessor();
        Person updatedBob = processor.updatePerson(bob);
        updatedBob.displayDetails();
        //CASE 3
        Person charlie = new Person("Charlie", 40);
        PersonProcessor processor = new PersonProcessor();
        Person updatedCharlie = processor.updatePerson(charlie);
        updatedCharlie.displayDetails();
    }
}