public class FactoryProducer {

    /* Abstract Factory Pattern
       I can't tell what's the point of this pattern,
       from the perspective of parameterization. It is
       described as "factory of factory". Even you can specify
       what factory you need in the factory producer, you still
       need hard code the different among different species.

       It cannot be more flexible
    */

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}

/* Demo
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shpae shape2 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        Color color2 = colorFactory.getColor("BLUE");

        color1.fill();
        color2.fill();
    }
}
*/
