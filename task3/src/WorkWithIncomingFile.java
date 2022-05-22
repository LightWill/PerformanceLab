import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithIncomingFile {

    static String readStringFromFile(String path) {
        Path fileName = Path.of(path);

        try {
            String content = Files.readString(fileName);
            return content;
        } catch (Exception except) {
            System.out.println("Ошибка:" + except);
        }

        return null;
    }

    static Reader readFromFile(String path) {
        Path fileName = Path.of(path);

        try {
            Reader reader = Files.newBufferedReader(fileName);
            return reader;
        } catch (Exception except) {
            System.out.println("Ошибка:" + except);
        }
        
        return null;
    }

}