// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carrot Carrot1 = new Carrot("Mike", 100);
        Carrot Carrot2 = new Carrot("Micah", 80);

        Carrot1.details();
        Carrot1.attack(Carrot2);
        Carrot2.details();
    }
}