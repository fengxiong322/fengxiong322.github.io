public class Car{
  private String color;

  public Car(String newColor){
    color = newColor;
  }

  public String getColor(){
    return color;
  }

  public boolean equals(Car anotherCar){//If two cars have the same color, they are considered to be the same car
    if(this.getColor() == anotherCar.getColor())
      return true;
  }
}
