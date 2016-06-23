public class BusinessDelegatePatternDemo {

    /*
      Business Delegate Pattern

      I don't quite understand, maybe multi layer can improve
      flexibility?
    */
    public static void main(String[] args){

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
