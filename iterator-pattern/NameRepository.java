public class NameRepository implements Container {

    /*
      Iterator Pattern

      hide the details of list/containers that can be
      iterated
    */
    public String  names[] = { "Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext(){
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}


/* Demo */

public class IteratorPatternDemo {
    public static void main(string[] args){
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
}
