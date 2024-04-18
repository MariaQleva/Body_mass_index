//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weightKg = 98;
        int heightCm = 187;
        int bmiResult = bmiService.calculate(weightKg, heightCm);
        System.out.println("При росте " + heightCm + "см" + " и весе " + weightKg + "кг ваш индекс массы тела : " + bmiResult);

        }
    }
