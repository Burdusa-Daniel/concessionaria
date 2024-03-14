import java.util.ArrayList;
import java.util.Scanner;

import otherPackage.Auto;
import otherPackage.Moto;
import otherPackage.User;

public class Concessionaria {
  public static void main(String[] args) {

    // importato lo Scanner
    Scanner sc = new Scanner(System.in);

    String input;
    int inputInt;

    User user1 = new User();

    ArrayList<Moto> listaMoto = new ArrayList<>();
    ArrayList<Auto> listaAuto = new ArrayList<>();

    Moto moto = new Moto(348, "Ducati");
    Moto moto2 = new Moto(542, "suzuki");
    Moto moto3 = new Moto(752, "harley");

    Auto auto = new Auto(344, "Ferrari");
    Auto auto2 = new Auto(400, "ford");
    Auto auto3 = new Auto(250, "bugatti");

    listaMoto.add(moto);
    listaMoto.add(moto2);
    listaMoto.add(moto3);
    listaAuto.add(auto);
    listaAuto.add(auto2);
    listaAuto.add(auto3);

    // Login

    System.out.println("Login\n");

    // nome
    String passwordUtente;
    System.out.println("Inserisci nome utente");
    String nomeUtente = sc.nextLine();
    user1.nomeutenteCheck(nomeUtente);

    // Password
    System.out.println("Inserisci una password");
    passwordUtente = sc.nextLine();
    user1.passwordCheck(passwordUtente);
    System.out.println("Sei stato registrato correttamente");

    // controllo se i parametri vengono presi correttamente
    User user2 = new User(nomeUtente, passwordUtente);
    System.out
        .println(user2.getConto() + "\n" + user2.getId() + "\n" + user2.getUserName()
            + "\n" + user2.getPassword());

    // scelta dei cataloghi
    System.out.println("che catalo desideri vedere? ");
    System.out.println("premi 1 per vedere il catalogo delle auto");
    System.out.println("premi 2 per vedere il catalogo dell moto ");
    int inputUtente = sc.nextInt();

    //faccio vedere all'utente il catalogo che ha scelto
    switch (inputUtente) {
      case 1:
        System.out.println("le macchine a nostra disposizione sono: ");

        for (Auto a : listaAuto)
          System.out.println(a);
        break;
      case 2:
        System.out.println("le moto a nostra disposizione sono: ");
        for (Moto a : listaMoto)
          System.out.println(a);
        break;
      default:
      System.out.println("scelta non valida");
        break;
    }
  }
}
