public class Main {
    public static void main(String[] args) {
        Country one = new Country(1);
        Country two = new Country(2);
        Country three = new Country(3);

        one.addNeighbor(two);
        one.addNeighbor(three);

        
    }
}