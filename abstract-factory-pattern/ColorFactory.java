public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color){
        if(color == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("RED")){
            return new Red();
        }else if(shapeType.equalsIgnoreCase("GREEN")){
            return new Green()
        }else if(shapeType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;

    }
}
