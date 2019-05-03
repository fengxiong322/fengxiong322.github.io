public class House {
    private int street_num;
    private String street;
    private String city;
    private String province;
    private String postal_code;
    private double size;
    private boolean detached;
    private int stories;
    
    public House(int n, String s, String c, String pv, String p, double si, boolean d, int l) {
        street_num = n;
        street = s;
        city = c;
        province = pv;
        postal_code = p;
        size = si;
        detached = d;
        stories = l;
    }
    
    public void displayAddress() {//prints out a formatted house address
        System.out.println(street_num + " " + street);//Prints out the value of (street_num) puts a space, then prints out the value of (street)
        System.out.println(city + ", " + province);//Prints out the value of (city) puts a comma, then prints out the value of (province)
        System.out.println(postal_code);//Prints out the value of (postal_code)
    }

    public static void main(String[] args) {
        House a = new House("2343", "apple", "toronto", "ontario", "M1D3R5", 1230, true, 2);
        House b = new House("2243", "cedar", "toronto", "ontario", "M1D0R5", 1230, true, 2);
        House c = new House("243", "street", "toronto", "ontario", "M1D3R0", 1230, true, 2);
        House d = new House("43", "orange", "toronto", "ontario", "M1D7R8", 1230, true, 2);
        House e = new House("23", "pineapple", "toronto", "ontario", "M1D7R5", 1230, true, 2);
    }
    
} // House class