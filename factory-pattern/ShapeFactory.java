public class ShapeFactory {

    /* Factory Pattern
       solves problem that when you want to modify the instantiated
       objects parameterizely.
       You may have to change the object applied by only changing the
       code:
       new Circle() --> new Rectangle()

       now only change the parameter
       ShapeFactory.getShape("CIRCLE") --> ShapeFactory.getShape("RECTANGLE")
    */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;

    }
}

/* Demo */
/*
public class FactoryPatternDemo{
    public static void main(String[] args){
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
*/
