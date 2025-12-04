package Atlas4World.RegisterEx.models;


import java.io.IOException;

public class User {
    private final String UserName;
    private final String LastName;
    private final Integer Age;
    private final String CPF;
    private boolean IsOfLegalAge;

    public Integer getAge() {
        return Age;
    }

    public String getUserName() {
        return UserName;
    }

    public String getLastName() {
        return LastName;
    }





    public void ShowInformation() {
        System.out.println("Full name:" + UserName + " " + LastName);
    }
    public void ShowUsers() {
        System.out.println("Usuário cadastrados: ");

    }

    public void ReadInputKey() {

    }

    public User(String userName, String lastName, String cpf, String surname, Integer age ) throws IOException {
        this.UserName = userName;
        this.LastName = lastName;
        this.CPF = cpf;
        this.Age = age;


        ShowInformation();

    }


}
