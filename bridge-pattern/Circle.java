public class Circle extends Shape {
    private int x, y, radius;

    /* Bridge Pattern

       It is the method that decompose the methods and the class.
       Or we can describe that the method is dynamically installed
       into the classes. In java, or in current example, this is
       implemented by using "interface"

       interface dynamicMethods {
           public void method1();
           public void method2();
       }

       public abstract class abstractForMethodsInstall{
           protected dynamicMethods methods;
           protected abstractForMethodsInstall(dynamicMethods m){
               methods = m;
           }

           public abstract void method1();
           public abstract void method2();
       }

       class targetClass extends abstractForMethodsInstall{

           public targetClass(dynamicMethods m){
               super(m);
           }

           public void method1(){
               methods.method1();
           }

           public void method2(){
               methods.method2();
           }
       }

       It is complicated because the JAVA does not permit passing both
       function pointer and function itself as arguments
    */

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}


/* Demo */
/*
public class BridgePatternDemo {
    publc static void main(String[] args){
        Shape redCircle = new Circle(100,100, new RedCircle());
        Shape greenCircle = new Circle(100,100, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
*/
