package otherPackage;

public class Moto {
  int price;
  String motoName;



  
  public Moto(int price, String motoName) {
    this.price = price;
    this.motoName = motoName;
  }




  public int getPrice() {
    return price;
  }


  public String getMotoName() {
    return motoName;
  }


  public void setPrice(int price) {
    this.price = price;
  }


  public void setMotoName(String motoName) {
    this.motoName = motoName;
  }




  @Override
  public String toString() {
    return "prezzo= " + price + " nome= " + motoName;
  }

  
}
