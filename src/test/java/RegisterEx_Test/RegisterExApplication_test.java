package RegisterEx_Test;

import Atlas4World.RegisterEx.main.Main;
import RegisterEx_Test.services.Conversor;
import RegisterEx_Test.services.RegisterInformation;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class RegisterExApplication_test {


    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public RegisterExApplication_test() throws IOException {
    }

    public static void main(String[] args) {
        SpringApplication.run(RegisterExApplication_test.class, args);
    }



}

