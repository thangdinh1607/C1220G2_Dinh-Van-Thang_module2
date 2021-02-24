package _7_abstractclass_and_interface.TH;

import java.nio.charset.CharsetEncoder;

public abstract class  Animal {
    public abstract String makeSound();
}
class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Eat";
    }
}
class Tiger extends Animal{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}
class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibles = (Chicken) animal;
                System.out.println(edibles.howToEat());

                Fruit[] fruits = new Fruit[2];
                fruits[0] = new Orange();
                fruits[1] = new Apple();
                for (Fruit fruit : fruits) {
                    System.out.println(fruit.howToEat());
                }

            }
        }
    }
}