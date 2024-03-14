package otherPackage;

public class Auto {
  int price;
  String carName;

  public Auto(int price, String carName) {
    this.price = price;
    this.carName = carName;
  }

  public int getPrice() {
    return price;
  }

  public String getCarName() {
    return carName;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  @Override
  public String toString() {
    return " prezzo= " + price + " nome= " + carName ;
  }

}
