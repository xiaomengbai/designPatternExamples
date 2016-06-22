public class VisitorPatternDemo {
    /*
      Visitor Pattern

      split the operation with the data. the object
      can operates denpending on the specific
      operations carried by the visitor
    */

    public static void main(String[] args){

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
