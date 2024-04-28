public class Albums{
    private String name;
    private int year;
    private String artist;
    public Albums(String name, int year, String artist){
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public void printInfo() {
        System.out.println("Album: " + name);
        System.out.println("Year: " + year);
        System.out.println("Artist: " + artist);
    }


}