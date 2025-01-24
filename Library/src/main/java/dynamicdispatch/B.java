package dynamicdispatch;

/**
 * An example concrete class that is a child of abstract class A.
 */
public class B extends A {

    /**
     * m2 partially overrides the method m2 in class A.
     */
    @Override
    public void m2() {
        super.m2();
        System.out.println("B - m2");
    }

    /**
     * m3 exist in B but not in A.
     */
    public void m3() {
        System.out.println("B - m3");
    }
}
