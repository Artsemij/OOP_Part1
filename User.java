public class User {
    private String login;
    private String password;
    private Basket Basket;
    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.Basket = new Basket();
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public Basket getBasket(){
        return Basket;
    }
}
