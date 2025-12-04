package RegisterEx_Test.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class User {
    private String UserName;
    private String LastName;
    private String Surname;
    private final Integer Age;
    private final String CPF;
    private boolean IsOfLegalAge;
    private String DataDescription;
    private ArrayList<File> users;

    public String getUserName() {
        return UserName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getDataDescription() {
        return DataDescription;
    }

    public void setDataDescription(String dataDescription) {
        DataDescription = dataDescription;
    }

    public ArrayList<File> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<File> users) {
        this.users = users;
    }

    public void ShowInformation() {
        System.out.println("Full name:" + UserName + " " + LastName);
    }
    public void ShowUsers() {
        System.out.println("Usuário cadastrados: ");

    }



    public User(String userName, String lastName, String cpf, String surname, Integer age ) throws IOException {
        this.UserName = userName;
        this.LastName = lastName;
        this.CPF = cpf;
        this.Surname = surname;
        this.Age = age;


        ShowInformation();

        DataDescription = "Nome: " + userName + "\n LastName: " + LastName + "\n Surname:" + Surname +
                "\n Age:" + Age + "\n Cpf: " + CPF;

    }


}
