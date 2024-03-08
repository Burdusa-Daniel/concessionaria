package otherPackage;

public class User {
private  String userName;
private  String password;
private  int conto;
private  int id;

  public User (String userName, String password, int conto, int id) {
    this.userName = userName;
    this.password = password;
    this.conto = conto;
    this.id = id;
  }

  public String getUserName() {
    return this.userName;
  }

  public String getPassword() {
    return password;
  }

  public int getConto() {
    return conto;
  }

  public int getId() {
    return id;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setConto(int conto) {
    this.conto = conto;
  }

  public void setId(int id) {
    this.id = id;
  }  


}
