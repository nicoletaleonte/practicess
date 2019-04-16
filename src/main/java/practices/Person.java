package practices;

public class Person {
    private Name personName;
    private static int personCounter = 0;

    public String helloWorld() {
        return "Hello World";
    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter++;
        //Empty default constructure
    }

    public Name name() {
        return personName;
    }

    public String hello(String personName) {
        return "Hello " + personName;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
