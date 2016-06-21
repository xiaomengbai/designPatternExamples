public class ProxyImage implements Image{
    /* Proxy Pattern

       An additonal class installed over the original
       one, to control accesses from outside

       as to decorate pattern: enhance the original class
       as to adapter pattern: change the interfaces
       as to proxy pattern: limit the access
    */
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display(){
        if(realImage == null){
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}


/* Demo */
/*
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("""");

        image.display();
    }
}
*/
