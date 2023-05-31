public class BottleOfMilk extends Product{
    private double volume;
    private  double fatContent;

    public BottleOfMilk(String inputBrand, String inputName, double inputPrice, double volume, double fatContent) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public BottleOfMilk(String inputBrand, String inputName, double inputPrice) {
        super(inputBrand, inputName, inputPrice);
        this.volume = 0.5;
        this.fatContent = 2.5;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo(){
        return String.format("Milk: %s %.1f percent, volume: %.2f liters, price: %.2f rub", brand, fatContent, volume, price);
    }
}
