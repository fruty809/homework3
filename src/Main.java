import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] number = {1.2, 3.5, -2.2, 1.7, 23.67, -43.5, -67.1, 34.6, 21.5, -56.3, 13.14, 64.6, -98.5, 35.5, 11.4};
        double sum = 0;
        int num = 0;
        boolean proverka = false;
        for (double cool : number) {
            if (cool < 0) {
                proverka = true;
            } else if (cool > 0 && proverka) {
                sum += cool;
                num++;
                System.out.println(cool);
            }
        }
        
        //Доп
        System.out.println("Общее арифметическое число = " + sum / num);
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    double temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(number));
        }
    }
}
