public class Animal {
    private String name;
    private boolean tired;
    private boolean hungry;
    private double weight;
    
    public Animal(String n, double w) {
        name = n;
        tired = true;
        hungry = true;
        weight = w;
    }
    
    public void feed(String v) {//feeds the animal
        hungry = false;//sets the hungry variable to false, making the animal not hungry
        if (v.equals("vegetables"))//If you chose to feed the animal "vegetables"...
            weight += 2;//The animal's weight increases by 2
        else if (v.equals("meat"))//If you chose to feed the animal "meat"...
            weight += 4;//The animal's weight increases by 4
        else//If you chose to feed the animal anything else...
            weight += 1;//The animal's weight increases by 1
    }
    
    public void sleep() {//makes the animal sleep
        tired = false;//Sets the tired variable to false, making the animal not tired
        weight -= 3;//The animal's weight decreases by 3
    }
    
    public static void main(String[] args) {
        Animal a = new Animal("Cow", 10);
        Animal b = new Animal("Sheep", 10);
        Animal c = new Animal("Hippo", 10);
        Animal d = new Animal("Cat", 10);
        Animal e = new Animal("Goose", 10);
    }
} // Animal class