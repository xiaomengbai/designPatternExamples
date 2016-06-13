public class SingleObject {
    private static SingleObject instance = new SingleObject();

    // won't be instantialized
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

/* DEMO
public class SingletonPatternDemo {
    public static void main(String [] args){
        // SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
*/
