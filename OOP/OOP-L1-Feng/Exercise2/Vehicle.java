/**
 *Vehicle
 *-type: String
 *-manufactuer: String
 *-model: String
 *-year: short
 *-colour: String
 *-numOfDoors: byte
 *-gassTankSize: float
 *-gas: float
 *-km: int
 *--------------
 *+Vehicle(typ: String, manu: String, mod: String, yea: short, col: String, nDoors: byte, tankS: float)
 *+paint(colour: String): void
 *+gasUp(litres: int): void
 *+drive(distance: int): boolean
 *+getType(): String
 *+getManufact(): String
 *+getModel(): String
 *+getYear(): short
 *+getColour(): String
 *+getDoors(): byte
 *+getTankSize(): float
 */

/**
 * @author Feng Xiong
 *
 */
public class Vehicle {
    private String type;
    private String manufacturer;
    private String model;
    private short year;
    private String colour;
    private byte numOfDoors;
    private float gasTankSize;
    private float gas;
    private int km;

    /**
     * @param typ Represents the type of vehicle
     * @param manu Represents the manufactuer
     * @param mod Represents the model
     * @param yea Represents the year
     * @param col Represents the colour
     * @param nDoors Represents the number of doors
     * @param tankS Represents the tank size
     */
    public Vehicle(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS) {
        type = typ;
        manufacturer = manu;
        model = mod;
        year = yea;
        colour = col;
        numOfDoors = nDoors;
        gasTankSize = tankS;
        gas = 0.0f;
        km = 0;
    }

    /**
     * @param colour The colour of the paint
     */
    public void paint(String colour) {
        this.colour = colour;
    }

    /**
     * @param litres The amount of litres put into the tank
     */
    public void gasUp(int litres) {
        if (litres + gas < gasTankSize)
            gas += litres;
    }

    /**
     * @param distance The distance the car needs to drive
     * @return If it can reach its destination
     */
    public boolean drive(int distance) {
        if (gas - distance > 0) {
            gas -= distance;
            km += distance;
            return true;
        } else {
            return false;
        }

    }

    /**
     * @return the type of vehicle
     */
    public String getType() {
        return type;
    }

    /**
     * @return The manufactuer
     */
    public String getManufact() {
        return manufacturer;
    }

    /**
     * @return The model of the vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * @return The year
     */
    public short getYear() {
        return year;
    }

    /**
     * @return The colour of the vehicle
     */
    public String getColour() {
        return colour;
    }

    /**
     * @return The number of doors on the vehicle
     */
    public byte getDoors() {
        return numOfDoors;
    }

    /**
     * @return The size of the tank
     */
    public float getTankSize() {
        return gasTankSize;
    }
}
