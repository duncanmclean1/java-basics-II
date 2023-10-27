package Inheritance;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person() {
    }

    public Person(String f, String l){
        this.firstname = f;
        this.lastname = l;
    }

    public Person(String f, String l, int a){
        this.firstname = f;
        this.lastname = l;
        this.age = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && firstname.equals(person.firstname) && lastname.equals(person.lastname);
    }

    @Override
    public int hashCode() { // Used for Hash* data structures (e.g. prevents dupes in HashSets).
        return Objects.hash(age, firstname, lastname);
    }


    /**
     * @return String return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return String return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
