public class ShapeMaker {

    /* Facade Pattern

       It is described to hidden the complexity of
       a system, and a few interfaces are provided
       in the facade class to users

       it is a little weird, I can't tell why
    */

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public shapeMaker(){
        circle = new circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}


/* Demo */
/*
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMakershapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
*/
