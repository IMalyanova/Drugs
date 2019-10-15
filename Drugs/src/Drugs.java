import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drugs {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите команду: ");

        TreeSet<String> parking = new TreeSet<>();

        for (; ; ) {
            String command = reader.readLine().trim();

            if (command.equals("exit")) {
                System.out.println("До новых встреч!");
                break;
            } else {
                if (command.equals("LIST")) {
                    for (String element: parking){
                        System.out.println(element);
                    }
                } else {
                    parking.add(command);
                }
            }
        }
    }
}
