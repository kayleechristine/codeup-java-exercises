import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"aggressive", "ambitious", "brave", "delightful", "victorious", "faithful", "clumsy", "grumpy", "obnoxious", "uptight"};
    public static String[] nouns = {"llama", "axolotl", "alpaca", "platypus", "chinchilla", "iguana", "fruit bat", "snek", "hyena", "doggo"};

    public static String randomizer(String[] array) {

        Random rando = new Random();
        int randomIndex = rando.nextInt((array.length - 2) + 1) + 1;
        return array[randomIndex];

    }

    public static void main(String[] args) {
        System.out.println(randomizer(adjectives) + "-" + randomizer(nouns));
        System.out.println(randomizer(adjectives) + "-" + randomizer(nouns));
        System.out.println(randomizer(adjectives) + "-" + randomizer(nouns));
        System.out.println(randomizer(adjectives) + "-" + randomizer(nouns));
        System.out.println(randomizer(adjectives) + "-" + randomizer(nouns));
    }

}
