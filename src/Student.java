public class Student extends Person{
  private int klass;

  public Student(int id, String name, int age) {
    super(id, name, age);
  }

  public int getKlass() {
    return klass;
  }

  public void setKlass(int klass) {
    this.klass = klass;
  }

  public String introduce (String name, int age, int klass) {
    String description = "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
      "I am a Student. I am at Class" + this.getKlass() + ".";
    return description;
  }

}
