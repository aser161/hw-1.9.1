public class Main {
    public static void main(String[] args) {
          // Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //System.out.println(arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2
        System.out.println("Задача 2");
        int max = 0;
        int min = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if ( max < arr[i]){
                max = arr[i];
            }
            if ( min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задача 3
        System.out.println("Задача 3");
        double total = sum;
        double mean = total/30;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}