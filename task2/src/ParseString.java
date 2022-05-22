public class ParseString {

    static float[] parseStringInTwoFloats(String in) {
        String[] words = in.split(" ");
        float a = Float.parseFloat(words[0]);
        float b = Float.parseFloat(words[1]);
        float[] answer = {a, b};
        return answer;
    }
    
}
