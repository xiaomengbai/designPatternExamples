public class FrontControllerPatternDemo {

    /*
      Front Controller Pattern

      dispatcher? probably adopted by the HTTP server

    */

    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
