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
            int Aika;
            Aika = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equals("UlkoTalo")) {
                    ulkoTaloIndex = i;
                    break;
                }
                if (headers[i].equals("Aika")) {
                    Aika = i;
                }
            }

            if (ulkoTaloIndex == -1) {
                System.out.println("There is an error");
                return;
            }
            if (Aika == -1) {
                System.out.println("There is an error");
                return;
            }
            double tempTotal = 0;
            int measurementCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                System.out.println(values[Aika]);
                if(values[Aika].startsWith("01.01.2023")){
                    double temperature =   Double.parseDouble(values[ulkoTaloIndex].replace(",","."));
                    tempTotal += temperature;
                    measurementCount ++;
                }
            }
            bufferedReader.close();

            double average = tempTotal/measurementCount;
            System.out.println(average);
            System.out.println(measurementCount);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
