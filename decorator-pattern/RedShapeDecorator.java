public class RedShapeDecorator extends ShapeDecorator {


    /* Decorator Pattern

       some additional function is abstracted out, which then
       can be installed to other objects
    */

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}


/* Demo */
/*
public class DecoratorPatternDemo {
    public static void main(String[] args){

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
*/
