public class Car {
    private final int wheels;
    private final String color;
    private final boolean airConditioning;

    public Car(int wheels, String color, boolean airConditioning) {
        this.wheels = wheels;
        this.color = color;
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels+ ", color = " + color + ", airConditioning = " + airConditioning +"]";
    }
}
