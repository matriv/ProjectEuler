package org.dev.matriv;

/**
 * Created with IntelliJ IDEA.
 * User: matriv
 * Date: 7/21/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static final void main(String args[]) {
        try {
            System.out.println("Hello World");
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
