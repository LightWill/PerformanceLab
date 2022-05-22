public class App {
    public static void main(String[] args) {
       String[] inData = WorkWithIncomingFile.readWords(args[0]);
       
       float[] ab = ParseString.parseStringInTwoFloats(inData[0]);
       float a = ab[0];
       float b = ab[1];
       float r = Float.parseFloat(inData[1]);
       float r2 = r * r;

       String[] dots = WorkWithIncomingFile.readWords(args[1]);
       for (int i = 0; i < dots.length; i++) {
            float[] dot = ParseString.parseStringInTwoFloats(dots[i]);
            float x = dot[0];
            float y = dot[1];
            float formula = (x - a) * (x - a) + (y - b) * (y - b);
            
            if (formula == r2) {
                System.out.print(0 + "\n");
            }
            if (formula < r2) {
                System.out.print(1 + "\n");
            }
            if (formula > r2) {
                System.out.print(2 + "\n");
            }
       }
    }

}