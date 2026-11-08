import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temp {
    private URL url;
    public static void main(String[] args){
        Temp temp = new Temp();
        try {
            temp.url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(temp.url.openStream()));
            String line;
            String headerLine;
            headerLine = bufferedReader.readLine();
            String[] headers = headerLine.split(";");
            int ulkoTaloIndex;
            ulkoTaloIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals("UlkoTalo")) {
                    ulkoTaloIndex = i;
                    break;
                }
            }
            if (ulkoTaloIndex == -1) {
                System.out.println("There is an error");
                return;
            }

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
