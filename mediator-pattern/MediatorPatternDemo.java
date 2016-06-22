public class MediatorPatternDemo {

    /*
      Mediator Pattern

      Objects all use one specific class/object/method to do
      communication
    */
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hi! Robert!");
    }
}
