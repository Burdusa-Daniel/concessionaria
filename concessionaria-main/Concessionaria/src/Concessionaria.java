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

    User user1 = new User("Pippo", "password", 345, 1 );


    ArrayList<Moto> listaMoto = new ArrayList<>();
    ArrayList<Auto> listaAuto = new ArrayList<>();

    Moto moto = new Moto(348, "Ducati");
    Auto auto = new Auto(344, "Ferrari");

    listaMoto.add(moto);
    listaAuto.add(auto);

    //Login

    System.out.println("Login\n");

    
    System.out.println("Inserisci nome utente");
    input = sc.nextLine();

    if (!(input.equals(user1.getPassword()))) {
      System.out.println("Nome utente errato!");
    } 

    System.out.println("Inserisci password");
    input = sc.nextLine();

    if (!(input.equals(user1.getUserName()))) {
      System.out.println("Password errata!");
    } 
    

  }
}
