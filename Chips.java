public class Chips extends Product {
    private String taste;
    private int weight;

    Chips(String brand, String name, double price, String taste, int weight) {
        super(brand, name, price);
        checkTaste(taste);
        checkWeight(weight);

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Chips(String inputBrand, String inputName, double inputPrice) {
        super(inputBrand, inputName, inputPrice);
        this.taste = "taste";
        this.weight = 25;
    }

    public Chips(String inputBrand, String inputName, double inputPrice, String taste) {
        super(inputBrand, inputName, inputPrice);
        this.taste = taste;
        this.weight = 25;
    }

    private void checkTaste(String inputTaste) {
        if (inputTaste.length() < 4) {
            this.taste = "classic";
        } else {
            this.taste = inputTaste;
        }
    }

    private void checkWeight(int inputWeight) {
        if (inputWeight <= 0) {
            this.weight = 50;
        } else {
            this.weight = inputWeight;
        }
    }
    @Override
    String displayInfo(){
        return String.format("Chips: %s - %s, taste: %s, weight: %dgr , price: %.2f rub", brand, name, taste, weight, price);
    }
}
