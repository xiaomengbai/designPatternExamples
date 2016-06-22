public class MementoPatternDemo {
    /*
      Memento Pattern

      use objects to keep states of other objects
    */

    public static void main(String[] args){
        Originator originator = new Originator();
        CakeTaker cakeTaker = new CakeTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        cakeTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        cakeTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current state is "  + originator.getState());
        originator.getStateFromMemento(cakeTaker.get(0));
        System.out.println("First saved state is "  + originator.getState());
        originator.getStateFromMemento(cakeTaker.get(2));
        System.out.println("Second saved state is "  + originator.getState());

    }
}
