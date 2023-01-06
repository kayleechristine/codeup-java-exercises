public class Person {

    private String name;

    public Person() {
        System.out.println("A person is being created!");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        System.out.printf("New person has been named '%s'\n", name);
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s!\n", this.name);
    }

    public static void main(String[] args) {

        System.out.println("\n**** 1. Object Basics");
        Person joshua = new Person();
        joshua.setName("Joshua");
        joshua.getName();
        joshua.sayHello();

        System.out.println("\n**** 2. Understanding References");
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.print(person1.getName().equals(person2.getName()));
        System.out.println(" -- The .equals() method returns as true because the .getNames() method returns Strings and both objects share the same name value.");
        System.out.print(person1 == person2);
        System.out.println(" -- The boolean operator returned false because the two Person objects are different instances, even though they contain the same information.");

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.print(person3 == person4);
        System.out.println(" -- The boolean operator now returns true because the Person objects were set to equal one another, making them the same instance.");

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.print(person6.getName());
        System.out.println(" -- Both Person objects have been set to equal one another, so person6 takes on person5's name.");
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.print(person6.getName());
        System.out.println(" -- Since both Person objects are one instance, when the name of person6 changes, the name of person5 is set to equal it.");

    }

}
