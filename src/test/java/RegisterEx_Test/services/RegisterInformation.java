package RegisterEx_Test.services;

import RegisterEx_Test.models.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterInformation  {
    private static final Logger log = LoggerFactory.getLogger(RegisterInformation.class);

    public void WriteFileJson(User u) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(u.getUserName() + ".json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Conversor cvn = new Conversor();
        } catch (Exception e) {
            log.error(String.valueOf(e.getCause()));
        }
    }
}
