//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void  main(String[] args) {
        System.out.println("Задача 1 вариант 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Тут я не совсем поняла, потому что в подсказке говорится о рандоме,а в задаче без него, поэтому я сделала 2 варианта
        System.out.println("Задача 1 вариант 2");
        int[] arrayOne = new int[]{10000, 22000, 35000, 19000, 28000};
        int sum1 = 0;
        for (int j : arrayOne) {
            sum1 += j;
        }
        System.out.println("Сумма трат за месяц составила "+sum1);

        System.out.println("Задача 2");
        int[] arrayTwo = new int[5];
        arrayTwo[0] = 15000;
        arrayTwo[1] = 28000;
        arrayTwo[2] = 52000;
        arrayTwo[3] = 35000;
        arrayTwo[4] = 98000;

        int min = 100000;
        int max = 0;
        for (int element : arrayTwo) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная трата за месяц составила "+min+", максимальная "+max);

        System.out.println("Задача 3");
        int[] arrayThree = new int[]{39000, 48000, 94000, 62000, 71000};
        int numbersOfWeeks = 5;
        int sum3 = 0;
        for (int element : arrayThree) {
            sum3 += element;
        }
        float averageWaste = (float) sum3 /numbersOfWeeks;
        String result = String.format("%.2f",averageWaste);
        System.out.println("Средняя сумма трат составила "+result);

        System.out.println("Задача 4");
        char[] reverseFullName = {'n','a','v','I',' ', 'v','o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}