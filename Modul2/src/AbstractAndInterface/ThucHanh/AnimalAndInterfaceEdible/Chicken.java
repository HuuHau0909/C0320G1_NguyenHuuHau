package AbstractAndInterface.ThucHanh.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "Chip chip";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
