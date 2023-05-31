public class Product {
    protected String name;
    protected String brand;
    protected double price;

    String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }

    private double getPrice() {
        return price;
    }

    void setPrice(double inputPrice) {
        price = inputPrice;
    }

    Product(String inputBrand, String inputName, double inputPrice) {
        checkPrice(inputPrice);
        checkBrand(inputBrand);
        checkName(inputName);
    }

    Product(String inputName, double inputPrice) {
        this("noName", inputName, inputPrice);
    }

    Product() {
        this("product", 100);
    }

    private void checkBrand(String insertBrand) {
        if (insertBrand.length() < 3) {
            this.brand = "no name";
        } else {
            this.brand = insertBrand;
        }
    }

    private void checkName(String insertName) {
        if (insertName.length() < 5) {
            this.name = "product";
        } else {
            this.name = insertName;
        }
    }

    private void checkPrice(double inputPrice) {
        if (inputPrice <= 0) {
            this.price = 100;
        } else {
            this.price = inputPrice;
        }
    }


}
