import java.util.List;

public interface Criteria{
    /* Filter Pattern

       Java way to implement *grep*
    */
    public List<Person> meetCriteria(List<Person> persons);
}


/* Demo */
/*
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));


        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);


        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));


        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(perosns));

        System.out.println("\Single Males: ");
        printPersons(singleMale.meetCriteria(perosns));

        System.out.println("\nSingle or Females: ");
        printPersons(singleOrFemale.meetCriteria(perosns));

    }

    public static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println("Person: [ Name: " + person.getName()
                               + ", Gender: " + person.getGender()
                               + ", Marital Status: " + person.getMaritalStatus() + "]");
        }
    }
}
*/
