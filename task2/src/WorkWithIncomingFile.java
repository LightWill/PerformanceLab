import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithIncomingFile {

    static String[] readWords(String path) {
        Path fileName = Path.of(path);

        try {
            String content = Files.readString(fileName);
            String[] words = content.split("\n");
            return words;
        } catch (Exception except) {
            System.out.println("Ошибка:" + except);
        }

        return null;
    }

}