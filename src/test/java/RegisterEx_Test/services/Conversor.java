package RegisterEx_Test.services;

import RegisterEx_Test.models.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversor {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
  public void RegisterUserToFile(User user) {
      String json = gson.toJson(user);

      System.out.println("Json:\n " + json);

  }
}
