public class Platina extends Albums{

    private String name;
    private int year;
    private String artist;
    public Platina(String name, int year, String artist){
        super(name, year, artist);
    }
    public void printInfo() {
        System.out.println("Album: " + name);
        System.out.println("Year: " + year);
        System.out.println("Artist: " + artist);
    }
}