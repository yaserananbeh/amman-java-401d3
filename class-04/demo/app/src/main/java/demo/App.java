/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

public class App {

    public static void main(String[] args) {
        System.out.println("The app started");
        //Point startingPoint = new Point();
        Point startingPoint = new Point(4,8);
        System.out.println(startingPoint.getX());
        System.out.println(startingPoint.getY());

        Point endingPoint = new Point();
        endingPoint.setX(15);
        System.out.println(endingPoint.getX());
        System.out.println(endingPoint.getY());
    }
}
