package AlphavantageUSDInJPY;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RealtimeCurrencyExchangeRate {
    private String From_Currency_Code;
    private String From_Currency_Name;
    private String To_Currency_Code;
    private String To_Currency_Name;
    private String Exchange_Rate;
    private String Last_Refreshed;
    private String Time_Zone;
    private String Bid_Price;
    private String Ask_Price;

    public RealtimeCurrencyExchangeRate() {

    }

    public RealtimeCurrencyExchangeRate(String from_Currency_Code,
                    String from_Currency_Name,
                    String to_Currency_Code,
                    String to_Currency_Name,
                    String exchange_Rate,
                    String last_Refreshed,
                    String time_Zone,
                    String bid_Price,
                    String ask_Price) {
        From_Currency_Code = from_Currency_Code;
        From_Currency_Name = from_Currency_Name;
        To_Currency_Code = to_Currency_Code;
        To_Currency_Name = to_Currency_Name;
        Exchange_Rate = exchange_Rate;
        Last_Refreshed = last_Refreshed;
        Time_Zone = time_Zone;
        Bid_Price = bid_Price;
        Ask_Price = ask_Price;
    }

    public String getFrom_Currency_Code() {
        return From_Currency_Code;
    }

    public void setFrom_Currency_Code(String from_Currency_Code) {
        From_Currency_Code = from_Currency_Code;
    }

    public String getFrom_Currency_Name() {
        return From_Currency_Name;
    }

    public void setFrom_Currency_Name(String from_Currency_Name) {
        From_Currency_Name = from_Currency_Name;
    }

    public String getTo_Currency_Code() {
        return To_Currency_Code;
    }

    public void setTo_Currency_Code(String to_Currency_Code) {
        To_Currency_Code = to_Currency_Code;
    }

    public String getTo_Currency_Name() {
        return To_Currency_Name;
    }

    public void setTo_Currency_Name(String to_Currency_Name) {
        To_Currency_Name = to_Currency_Name;
    }

    public String getExchange_Rate() {
        return Exchange_Rate;
    }

    public void setExchange_Rate(String exchange_Rate) {
        Exchange_Rate = exchange_Rate;
    }

    public String getLast_Refreshed() {
        return Last_Refreshed;
    }

    public void setLast_Refreshed(String last_Refreshed) {
        Last_Refreshed = last_Refreshed;
    }

    public String getTime_Zone() {
        return Time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        Time_Zone = time_Zone;
    }

    public String getBid_Price() {
        return Bid_Price;
    }

    public void setBid_Price(String bid_Price) {
        Bid_Price = bid_Price;
    }

    public String getAsk_Price() {
        return Ask_Price;
    }

    public void setAsk_Price(String ask_Price) {
        Ask_Price = ask_Price;
    }

    @Override
    public String toString() {
        return "Курс обмена валюты в реальном времени:\n" +
                "Из какой валюты (Кодовое представление) = " + From_Currency_Code +"\n" +
                "Из какой валюты (Название) = " + From_Currency_Name + "\n" +
                "В какую валюту (Кодовое представление) = " + To_Currency_Code + "\n" +
                "В какую валюту (Название) = " + To_Currency_Name + "\n" +
                "Курс обмена = " + Exchange_Rate + "\n" +
                "Последнее обновление = " + Last_Refreshed + "\n" +
                "Временная зона = " + Time_Zone + "\n" +
                "Предложенная цена = " + Bid_Price + "\n" +
                "Запрашиваемая цена = " + Ask_Price + "\n";
    }

    public void createObj(String response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readValue(response,JsonNode.class);
        JsonNode childNode = rootNode.get("Realtime Currency Exchange Rate");
        setFrom_Currency_Code(childNode.get("1. From_Currency Code").asText());
        setFrom_Currency_Name(childNode.get("2. From_Currency Name").asText());
        setTo_Currency_Code(childNode.get("3. To_Currency Code").asText());
        setTo_Currency_Name(childNode.get("4. To_Currency Name").asText());
        setExchange_Rate(childNode.get("5. Exchange Rate").asText());
        setLast_Refreshed(childNode.get("6. Last Refreshed").asText());
        setTime_Zone(childNode.get("7. Time Zone").asText());
        setBid_Price(childNode.get("8. Bid Price").asText());
        setAsk_Price(childNode.get("9. Ask Price").asText());
    }

    public void printBidAsk(){
        System.out.println("Курс обмена валюты в реальном времени:\n"
                + "Обмениваем " + getFrom_Currency_Name() + " на " + getTo_Currency_Name() + "\n"
                + "Предложенная цена = " + Bid_Price + "\n"
                + "Запрашиваемая цена = " + Ask_Price);
    }
}
