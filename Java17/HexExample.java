package Java17;

public class HexExample {
    public static void main(String[] args) {
        int number = 255;
        String hex = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hex);

        int parsed = Integer.parseInt(hex, 16);
        System.out.println("Parsed Number: " + parsed);
    }
}