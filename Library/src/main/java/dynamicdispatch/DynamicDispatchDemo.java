package dynamicdispatch;

public class DynamicDispatchDemo {

    public static void main(String[] args) {

//        A a = new A(); // abstract class cannot be instantiated!

        // all good
        A a = new B();
        a.m1();
        a.m2(); // B's m2 gets invoked
//        a.m3(); // there is no m3 in an A!

    }
}
