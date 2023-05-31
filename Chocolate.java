public class Chocolate extends Product {
    String type;
    int weight;

    public Chocolate(String inputBrand, String inputName, double inputPrice, String type, int weight) {
        super(inputBrand, inputName, inputPrice);
        this.type = type;
        this.weight = weight;
    }

    private void checkType(String type) {
        if (type.length() < 4) {
            this.type = "milk";
        } else {
            this.type = type;
        }
    }

    public Chocolate(String inputBrand, String inputName, double inputPrice) {
        super(inputBrand, inputName, inputPrice);
        this.type = "tasty";
        this.weight = 50;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private  void checkWeight(int weight){
        if(weight <=0){
            this.weight = 50;
        }else{
            this.weight = weight;
        }
    }

    @Override
    public String displayInfo(){
        return String.format("Chocolate: %s - %s - %s, weight: %d gr, price: %.2f rub", brand, name, type, weight, price);
    }
}
