public class ServiceLocatorPatternDemo {

    /*
      Service Locator Pattern

      A cache hidden in the locator class
    */
    public static void main(String[] args){
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
