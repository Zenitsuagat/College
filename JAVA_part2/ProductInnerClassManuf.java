class Product{
    String productName;
    double productPrice;
    Manufacture manufacturer;

    class Manufacture{
        String manuName;
        String manuCountry;

        public Manufacture(String name, String con){
            this.manuName = name;
            this.manuCountry = con;
        }
    }

    public Product(String name, double price, String mname, String mcon){
        this.productName = name;
        this.productPrice = price;
        this.manufacturer = new Manufacture(mname, mcon);
    }

    public String getProductDetails(){
        return "Product : "+this.productName+", Price : $"+productPrice+", Manufacturer : "+manufacturer.manuName+"("+manufacturer.manuCountry+")";
    }
}

class ProductInnerClassManuf{
    public static void main(String args[]){
        //CASE 1
        Product laptop = new Product("Laptop", 1500.0, "Dell", "USA");
        System.out.println(laptop.getProductDetails());
        //CASE 2
        Product smartphone = new Product("Smartphone", 800.0, "Samsung", "South Korea");
        System.out.println(smartphone.getProductDetails());
        //CASE 3
        Product tablet = new Product("Tablet", 300.0, "Apple", "USA");
        System.out.println(tablet.getProductDetails());

    }
}