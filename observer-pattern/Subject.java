import java.util.ArrayList;
import java.util.List;

public class Subject {
    /*
      Observer Pattern

      subject:
      - a arraylist containing all observers
      - a method notifying the list of observers
      - a method for individual observer registering itself into the list

      observer:
      - a 'update' method for being invoked from the subject
      - whethor holding the subject I think is unnecessary

    */


    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }

}

/* Demo */
/*
public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}
*/
