public class Main {
    public static void main(String args[]) {
        Car car = new CarBuilder().setWheels(4).setColor("White").setAirConditioning(true).build();
        System.out.println(car.toString());
        CarLombok carLombok = CarLombok.builder(4, "White").airConditioning(true).build();
        System.out.println(carLombok.toString());
    }
}
