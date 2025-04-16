
public class Bank {

    public static void main(String[] args) {
        Bankaccount obj = new Bankaccount();
        obj.setPassword("prasanna");
        obj.name = "prasana d";
        System.out.println(obj.name);
    }
}

class Bankaccount {

    public String name;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }
}
