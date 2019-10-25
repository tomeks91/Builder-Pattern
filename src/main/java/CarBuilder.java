public class CarBuilder {
    private int wheels;
    private String color;
    private boolean airConditioning;

    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
        return this;
    }

    public Car build(){
        return new Car(wheels, color, airConditioning);
    }
}
