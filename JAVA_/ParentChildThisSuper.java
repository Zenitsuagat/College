class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}

abstract class AbstractClass{
    abstract void display();
}

class Child extends Person{
    public Child(String name){
        super(name);
    }

    public void display(){
        System.out.println("Name : "+this.name);
    }
}

class ParentChildThisSuper{
    public static void main(String args[]){
        Child obj = new Child("Hari");
        obj.display();
    }
}