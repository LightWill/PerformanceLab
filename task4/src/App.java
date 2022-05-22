import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] words = WorkWithIncomingFile.readWords(args[0]);
        int[] numbers = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }

        Arrays.sort(numbers);

        int mediana = numbers.length / 2;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i] - mediana;
            if (number < 0) {
                number = number * -1;
            }
            result = result + number;
        }

        System.out.println(result);
    }

}