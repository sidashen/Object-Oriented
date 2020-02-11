public class Person {
  private int id;
  private String name;
  private int age;

  public Person (int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public void setId(int id) { this.id = id; }

  public int getId() { return id; }

  public void setName(String name) { this.name = name; }

  public String getName() { return name; }

  public void setAge(int age) { this.age = age; }

  public int getAge() { return age; }

  public String introduce() {
    String description = "My name is" + this.getName() + ". I am " + this.getAge() + "years old.";
    return description;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(null == obj) return false;
    if (getClass() != obj.getClass()) return false;
    Person other = (Person) obj;
    if (id != other.id) return false;
    return true;
  }
}
