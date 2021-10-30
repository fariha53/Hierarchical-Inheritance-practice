package oop;

public class Main {
// Hierarchical Inheritance
    public static void main(String[] args) {
	// write your code here
        RainySeason rain = new RainySeason();
        Winter winterday = new Winter();
        rain.typesofSeason();
        System.out.println("\nRainy season flowers are: ");
        rain.rainyFlower();

        winterday.typesofSeason();
        System.out.println("\nWinter season flowers are: ");
        winterday.winterFlower();
    }
}
