package Atlas4World.RegisterEx.main;

import Atlas4World.RegisterEx.models.User;
import Atlas4World.RegisterEx.services.Conversor;
import Atlas4World.RegisterEx.services.RegisterInformation;

import java.io.IOException;

public class Main {
    public void Init(String n, String Ln, String Cpf, String Sn, Integer age) throws IOException {
        User user = new User(n, Ln, Cpf, Sn, age);
        Conversor conversor = new Conversor();
        String json = conversor.Converter(user);
        RegisterInformation RI = new RegisterInformation();
        RI.RegisterInFile(user, json);

    }
}
