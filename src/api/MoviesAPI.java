package api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class MoviesAPI {
    public static final String baseURL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=%s&page=%d";
    public static void main(String[] args) throws IOException {

        getMovies("spider");
    }

    public static List<String> getMovies(String movieName)throws IOException {
        int page=1;
        int totalPages=1;
        List<String> list= new ArrayList<>();

        while(page<=totalPages){
            URL url= new URL(String.format(baseURL,movieName,page));
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode=connection.getResponseCode();
            StringBuffer response= new StringBuffer();
            if(responseCode==200){
                String rawResponse;
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((rawResponse= br.readLine())!=null){
                    response.append(rawResponse);
                }
            }
            JsonObject jsonObject=new Gson().fromJson(response.toString(),JsonObject.class);
            totalPages = jsonObject.get("total_pages").getAsInt();
            JsonArray jsonData = jsonObject.get("data").getAsJsonArray();
            for(JsonElement jsonElement:jsonData){
                String movieNameFromRest=jsonElement.getAsJsonObject().get("Title").getAsString();
                list.add(movieNameFromRest);
            }
            page++;
        }
        Collections.sort(list);
        System.out.println(list);
        String[] arr = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

    return null;
    }
}
