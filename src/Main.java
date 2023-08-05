public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetre = 1.87;
        double massKilogram = 98;
        int index = (int) service.calculate(heightMetre, massKilogram);
        System.out.println(index);
    }
}