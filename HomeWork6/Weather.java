package JavaCore.HomeWork6;

import okhttp3.OkHttpClient;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Weather {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        MediaType JSON = MediaType.parse("application/json");

        String authBodyString = "{" +
                "\"username\": \"ir238\", " +
                "\"password\": \"Test125\"" + "}";
        System.out.println(authBodyString);
        RequestBody authBody = RequestBody.create(authBodyString, JSON);

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=H6ldpZ8Uej2NF2cOGdMmZa5wo1wWr0vq")
                .post(authBody)
                .build();

        Response responseWithToken = client.newCall(request).execute();
        String responseBody = responseWithToken.body().string();

        System.out.println(responseBody);

        String token = responseBody.split(":")[1];
        token = token.replaceAll("[^\\p{L}\\p{Nd}]+", "");
        System.out.println(token);
    }
}


// Пример программы на 1 день

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class Weather {
//
//    public static void main(String[] args) {
//        Document doc = null;
//        try {
//            doc = Jsoup.connect("https://www.gismeteo.ru/weather-sankt-peterburg-4079/tomorrow/").get();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Нет интернета");
//        }
//        Elements spans = doc.select("span [class=js_value tab-weather__value_l]");
//        Element span = spans.get(0);
//        System.out.println(span.text());
//    }
//}
