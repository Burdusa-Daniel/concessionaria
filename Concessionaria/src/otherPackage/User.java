package otherPackage;

import java.util.Scanner;

public class User {

  private String userName;
  private String password;
  private int conto;
  private int id = 0;
  Scanner sc = new Scanner(System.in);

  public User() {
  }

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
    this.conto = (int) (Math.random() * 1001);
    this.id++;
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

  public void passwordCheck(String password) {
    if (password.isBlank() || password.length() < 5) {
      do {
        System.out.println("Ia password non può essere nulla o più corto di 5 caratteri. Riprova.");
        password = sc.nextLine();
      } while (password.isBlank() || password.length() < 5);
    }
  }

  public void nomeutenteCheck(String nomeUtente) {
    if (nomeUtente.isBlank() || nomeUtente.length() < 3) {
      do {
        System.out.println("La nomeUtente non può essere nullo o più corto di 3 caratteri. Riprova.");
        nomeUtente = sc.nextLine();
      } while (nomeUtente.isBlank() || nomeUtente.length() < 3);
    }
    System.out.println("Il tuo nome utente è: " + nomeUtente);
  }

}
