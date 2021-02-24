package _7_abstractclass_and_interface.TH;

public interface Edible {
    public String howToEat();
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Apple";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Orange";
    }
}