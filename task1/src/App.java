public class App {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        String answer = "";
        int position = 0;
        do {
            answer = answer + Integer.toString(array[position]);

            for (int i = 0; i < m - 1; i++) {
                position = position + 1;

                if (position == n) {
                    position = 0;
                }
            }
        } while (position != 0);

        System.out.println(answer);
    }

}