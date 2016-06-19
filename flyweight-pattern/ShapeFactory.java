import java.util.HashMap;

public class ShapeFactory {

    /* Flyweight Pattern

       It is a table for reusing the created
       object.
    */
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: "  + color);
        }

        return circle;
    }
}


/* Demo */
/*
public class FlyweightPatternDemo {
    private static final String colors[] =
    {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());

            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
*/
