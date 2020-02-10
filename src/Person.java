public class Person {
  public int id;
  public String name;
  public int age;

  public Person (int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String introduce (String name, int age) {
    String description = "My name is" + name + ". I am " + age + "years old.";
    return description;
  }

}
