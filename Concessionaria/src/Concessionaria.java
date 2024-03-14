import java.util.ArrayList;
import java.util.Scanner;

import otherPackage.Auto;
import otherPackage.Moto;
import otherPackage.User;

public class Concessionaria {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    String input;
    int inputInt;

    User user1 = new User();

    ArrayList<Moto> listaMoto = new ArrayList<>();
    ArrayList<Auto> listaAuto = new ArrayList<>();

    Moto moto = new Moto(348, "Ducati");
    Auto auto = new Auto(344, "Ferrari");

    listaMoto.add(moto);
    listaAuto.add(auto);

    // Login

    System.out.println("Login\n");

    String passwordUtente;
    System.out.println("Inserisci nome utente");
    String nomeUtente = sc.nextLine();
    user1.nomeutenteCheck(nomeUtente);
    // Password
    System.out.println("Inserisci una password");
    passwordUtente = sc.nextLine();
    user1.passwordCheck(passwordUtente);
    System.out.println("Sei stato registrato correttamente");
    // Dobbiamo ancora creare i metodi per inserire il conto e l'id incrementato

    User user2 = new User(nomeUtente, passwordUtente);
    System.out
        .println(user2.getConto() + "\n" + user2.getId() + "\n" + user2.getUserName()
            + "\n" + user2.getPassword());
  }
}
