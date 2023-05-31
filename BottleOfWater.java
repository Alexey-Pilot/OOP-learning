public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String inputBrand, String inputName, double inputPrice, double volume) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price){

        super(brand, name, price);
        this.volume = getVolume();
    }

    @Override
    public String displayInfo(){
        return String.format("Water: %s - %s, volume: %.2f liters, price: %.2f rub", brand, name, volume, price);
    }
}
