final class Car{
    String cModel;

    Car(String model){
        this.cModel = model;
    }
    public final String getModel(){
        return this.cModel;
    }
}

class Subclass extends Car{
    Subclass(String mod){
        super(mod);
    }
    
}

class FinalKeywordCar{
    public static void main(String args[]){
        Subclass obj = new Subclass("Car");

        String a = obj.getModel();
        System.out.print("Car Model : "+a);
    }
}