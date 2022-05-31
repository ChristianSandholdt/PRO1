import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Opgave1 {
    public static void main(String[] args) throws IOException {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Write to a file");
            writer.close();
        } catch


    }
}
