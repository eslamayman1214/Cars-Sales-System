package User_Managment;

public abstract class Person {

    protected String username;
    protected String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract void login();

}
