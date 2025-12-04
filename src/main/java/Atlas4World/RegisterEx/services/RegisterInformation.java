package Atlas4World.RegisterEx.services;

import Atlas4World.RegisterEx.models.User;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterInformation  {
      public void RegisterInFile(User user, String json) throws IOException {

          FileWriter fw = new FileWriter(user.getUserName() + ".json");
          fw.write(json);
          fw.close();



    }
}
