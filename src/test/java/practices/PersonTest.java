package practices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();
        assertEquals("Hello World", person.helloWorld());
    }

    @Test
    public void shouldReturnHelloNico() {
        Person person = new Person();
        assertEquals("Hello Nico", person.hello("Nico"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person;
        int i = 0;

        do {
            new Person();
            i++;
        } while (i < 4);

        assertEquals(4, Person.numberOfPersons());

        while (i < 4) {
            new Person();
            i++;
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays(Person[] persons) {

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }
        for (Person person : persons) {
            person.helloWorld();
        }

        Person myPerson = new Person();
        Person myPerson2 = null;
        final Person[] persons2 = {persons[0], persons[3], myPerson, myPerson2, persons[2]};

        for (LoggingLevel state : LoggingLevel.values()) {
            if (state == LoggingLevel.PENDING) {

            }
            if (state == LoggingLevel.PROCESSING) {

            }
            if (state == LoggingLevel.PROCESSED) {

            }
        }
    }

}
