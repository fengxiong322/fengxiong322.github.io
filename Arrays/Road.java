public class Road{
  Car[] road; //Our road is defined as an array of cars. General syntax: "Object/primitive data type" [] "variable name"

  public Road(int size){
    road = new Car[size]; //This tells the JVM(Java Virtual Machine) to set aside a certain amout of space, enough to fit each car. For now they are empty
  }

  //This allows us to set a Car at a certain index in the array.
  public boolean addCar(Car newCar, int position){
    //Lets read this method in plain english
    if(road[position] == null){ //If the specified position of our road is empty
      road[position] = newCar;//Then set that specified position on the road as our new car
      return true;// Tells use that the car was successfully placed
    }
    return false;//If the position on the road was filled, it will tell us that the new car could not be placed
  }

  //Drives all cars forward.
  public void driveCars(){
    for(int i = 0; i < road.length-1; i++){//For each position in the array, excluding the last position
      road[i+1] = road[i]; //The next position is set to the value at the current position
    }
    road[0] = null;//Sets the first position to null, because at this point, road[0] is == to road[2]
  }
}
