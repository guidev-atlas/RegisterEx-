package Atlas4World.RegisterEx.services;

import Atlas4World.RegisterEx.models.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversor {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public String Converter(User user) {
        String json = gson.toJson(user);
        System.out.println("Json: " + json);


        return json;
    }
}
