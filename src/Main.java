import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


// API key: HO3NXJ8RITS1D6KY
public class Main {


    public static void main(String[] args) {

        String ticker = "";

        try {

            StringBuilder informationString = new StringBuilder();
            Scanner input = new Scanner(System.in);

            System.out.print("Enter to get a ticker information: ");
            ticker = input.nextLine();


            while(ticker != "EXIT"){

                URL url = new URL("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol=" + ticker + "&apikey=2QWFMRDRH55PQWMI");
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.connect();

                //Scanner scanner = new Scanner(url.openStream());
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                String price = "Not Found";
                StringBuilder content = new StringBuilder();

                while((inputLine = in.readLine()) != null){

                    content.append(inputLine);

                }

                String temp = content.toString();
                String[] temp1 = temp.split("}|,|\\{");
                System.out.println(temp);
                System.out.println(Arrays.toString(temp1));
                System.out.println();
                System.out.println();
                System.out.println();
                //playing with temp1[10] value
                for(int i =10; i <= 14; i++){

                    if(i == 14){

                        System.out.println(temp1[i+1].replace("\"", "").trim());

                    }else{

                        System.out.println(temp1[i].replace("\"", "").trim() + "$");

                    }

                }



                System.out.print("Enter to get a ticker information: ");
                ticker = input.nextLine();

            }


        } catch (Exception e){

            e.printStackTrace();

        }
    }

}