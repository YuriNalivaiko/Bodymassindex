public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double height = 1.87;
        int weight = 98;
        int bmi = bmiService.calculate(height, weight);
        System.out.println(bmi);
    }
}