public class Main {
    public static void main(String[] args) {

        /**** INTRO ****/
        // - PART I
        System.out.println("Hello world! From Nat");
        System.out.println("Or as an Alien Greetings possibly go:");
        Main.greetingsEarthling();
        System.out.println("\nWelcome to CS 112!\n");

        Shoes shoe1 = new Shoes("Adidas");
        System.out.println(shoe1);

    }

    /**** STATIC METHODS - PART II ****/

    public static void greetingsEarthling() {
        System.out.println("Hello Puny Bipedal Carbon-Based Entities of type-0 Civilization");
    }

    public static int onePlusOne(int total) {
        return total;
    }

}