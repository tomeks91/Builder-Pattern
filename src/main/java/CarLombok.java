import lombok.*;

@Builder
@ToString
public class CarLombok {
    @NonNull
    private Integer wheels;
    @NonNull
    private String color;
    private boolean airConditioning;

    /*
        required parametrs, this part is optional since you can create object without this,
        but this help to create object properly since return compile error on builder without parameters, but still with this annotation you can create
        builder in this bad way new CarLombok.CarLombokBuilder();
    */
    public static CarLombokBuilder builder(int wheels, String color) {
        return new CarLombokBuilder().wheels(wheels).color(color);
    }
}
