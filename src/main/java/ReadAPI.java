import com.google.gson.*;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAPI {
    public static void main(String[] args) throws Exception {

        String resultHttp = get("https://rickandmortyapi.com/api/character");

        System.out.println(resultHttp);

        // Creare un oggetto Gson
        Gson gson = new Gson();

        // Convertire il JSON in un oggetto JsonObject
        JsonObject jsonObject = gson.fromJson(resultHttp, JsonObject.class);

        JsonArray resultsArray = jsonObject.getAsJsonArray("results");

        //System.out.println(resultsArray);

        List<RickAndMortyCharacter> remList = new ArrayList<>();

        for (JsonElement el : resultsArray){
            String id = el.getAsJsonObject().getAsJsonPrimitive("id").getAsString();
            String name = el.getAsJsonObject().getAsJsonPrimitive("name").getAsString();

            remList.add(new RickAndMortyCharacter(Integer.parseInt(id),name));
        }

        System.out.println(remList);

    }


    public static String get(String url) {
        String result = null;
        try {
            Response response = Request.get(url).execute();
            result = response.returnContent().asString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

