public class BmiService {
    public double calculate(double heightMetre, double massKilogram) {
        double height2 = heightMetre * heightMetre;
        double index = (massKilogram / height2);
        return index;
    }
}
