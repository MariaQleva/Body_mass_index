public class BmiService {
    public int calculate (int weightKg, int heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}
