public class Student extends Person{
  private Class klass;

  public Student(int id, String name, int age, Class klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public Class getKlass() { return klass; }

  public void setKlass(Class klass) { this.klass = klass; }

  public String introduce () {
    if (this.klass.getLeader().equals(this.getName())) {
      return "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
        "I am a Student.  I am Leader of Class" + this.getKlass() + ".";
    } else {
      return "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
          "I am a Student. I am at Class" + this.getKlass() + ".";
    }
  }

}
