public class Oringinator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        this.state = Memento.getState();
    }
}