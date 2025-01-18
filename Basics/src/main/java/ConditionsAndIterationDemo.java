public class ConditionsAndIterationDemo {

    public static void demoIfStatement() {

        int x = 5;
        int y  = 5;

        if (x == y) {
            System.out.println("x == y");
        } else {
            System.out.println("x != y");
        }
        System.out.println("Done");

    }

    public static void demoIfElseStatement() {


    }

    public static void demoWhile() {


    }

    public static void demoFor() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


    }


    public static void demoForeach(String[] args) {
        for (String foo: args) { // for arg in args:
            System.out.println(foo);
        }

        // same thing in OG for loop
//        for (int i = 0; i < args.length; i++) {
//            // for i in range(len(args)):
//            System.out.println(args[i]);
//        }


    }


    public static void main(String[] args) {

        demoIfStatement();
        demoFor();
//        demoForeach(args);
    }
}
