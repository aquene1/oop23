public class Obla extends Albums{
    private String name;
    private int year;
    private String artist;
    public Obla(String name, int year, String artist){
        super(name, year, artist);
    }
    public void printInfo() {
        System.out.println("Album: " + name);
        System.out.println("Year: " + year);
        System.out.println("Artist: " + artist);
    }
}