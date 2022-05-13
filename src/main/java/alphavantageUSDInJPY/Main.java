package alphavantageUSDInJPY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        final String BASE_URL = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=USD&to_currency=JPY&apikey=8W1CJXL8UKIFRIZM";

        URL request = new URL(BASE_URL);
        URLConnection connection = request.openConnection();
        connection.setConnectTimeout(3000);
        connection.setReadTimeout(5000);

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

        StringBuilder responseBuilder = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            responseBuilder.append(line);
        }

        String response = responseBuilder.toString();

        RealtimeCurrencyExchangeRate obj = new RealtimeCurrencyExchangeRate();
        obj.createObj(response);
        obj.printBidAsk();
    }

    public static class Connection{
        private final String BaseUrl = "https://www.alphavantage.co/query?";
        private int connectTimeout;
        private int readTimeout;
        private URLConnection connection;
//        private Function;

        public Connection(int connectTimeout, int readTimeout) {

            this.connectTimeout = connectTimeout;
            this.readTimeout = readTimeout;
        }
    }
}

