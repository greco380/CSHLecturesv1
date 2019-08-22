public class Greeter {

    public static void main(String[] args) {

//        System.out.println("Hello World!");
//        System.out.println("\nsout is shortcut");
//
//        greet("RIT");
//        greet("CSH");
//
//
//        if(true) { //hard coding T/F
//            greet("RIT");
//        }
//        else {
//            greet("CSH");
//        }
//
//        boolean shouldGreetCSH = false;
//
//        if(shouldGreetCSH) {
//            greet("RIT");
//        }
//        else {
//            greet("CSH");
//        }
//
//        greet("Josh");

        System.out.println(args[0]);
        //System.out.println(args[1]);
        //System.out.println(args[2]);
    }

    static void greet(String name) {
        System.out.println("\nHello, " + name);

    }
}
