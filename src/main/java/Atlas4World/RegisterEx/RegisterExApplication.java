package Atlas4World.
        RegisterEx;

import Atlas4World.RegisterEx.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class RegisterExApplication {

    public RegisterExApplication() throws IOException {
    }

    public static void main(String[] args) throws IOException {
		SpringApplication.run(RegisterExApplication.class, args);

        Main main = new Main();
        main.Init("Julia", "Oliveira santos", "000.000.000-00", "julinha",
        12);
	}



}

