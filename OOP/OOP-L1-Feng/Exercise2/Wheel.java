/*Wheel
 *-brand: String
 *-model: String
 *-size: int
 *-season: String
 *-KM_usage: int
 *-tread_condition: String
 *--------------
 *+Wheel(br: String, mod: String, siz: int, sea: String)
 *+update_KM_usage(km: int): void
 *+getBrand(): String
 *+getModel(): String
 *+getSize(): int
 *+getSeason(): String
 *+getTreadCondition(): String
 *+getKM(): int
 */


/**
 * @author Feng Xiong
 *
 */
public class Wheel{
	private String brand;
	private String model;
	private int size;
	private String season;
	private int KM_usage;
	private String tread_condition;
	/**
	 * @param br the brand of the wheel
	 * @param mod the model of the wheel
	 * @param siz the size of the wheel
	 * @param sea the season of the wheel
	 */
	public Wheel(String br, String mod, int siz, String sea){
		brand = br;
		model = mod;
		size = siz;
		season = sea;
		KM_usage = 0;
		tread_condition = "new";
	}

	/**
	 * @param km new kilometers driven
	 */
	public void update_KM_usage(int km){
		KM_usage += km;
	}

	/**
	 * @return the current brand
	 */
	public String getBrand(){
		return brand;
	}

	/**
	 * @return the current model
	 */
	public String getModel(){
		return model;
	}

	/**
	 * @return the current size
	 */
	public int getSize(){
		return size;
	}

	/**
	 * @return the current season specification of the tire
	 */
	public String getSeason(){
		return season;
	}

	/**
	 * @return the condition of the tread
	 */
	public String getTreadCondition(){
		return tread_condition;
	}

	/**
	 * @return current kilometers used
	 */
	public int getKM(){
		return KM_usage;
	}
}