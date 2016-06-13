import java.util.Hashtable;

public class ShapeCache {

    /* Prototype Pattern

       This method is to decompose the building process.
       if all objects has the same intial steps to be built,
       it is reasonable to build prototypes with initial steps
       done in a cache, and then clone a copy to complete the
       constructing process.

    */
    private static Hashtable<String, Shape> shapeMap =
        new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);

    }
}


/* Demo */
/*
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    }
}
*/
