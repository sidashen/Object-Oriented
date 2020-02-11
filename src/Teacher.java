import java.util.ArrayList;

public class Teacher extends Person {
  private ArrayList classes;
  private Class klass;

  public Teacher(int id, String name, int age, ArrayList classes) {
    super(id, name, age);
    this.classes = classes;
  }


  public ArrayList getClasses() {
    return classes;
  }

  public void setClasses(ArrayList classes) {
    this.classes = classes;
  }

  public String introduce () {
    String description = "";
    if (this.classes.size() != 0) {
      description = "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
        "I am a Teacher. I teach Class" + this.getClasses() + ".";
    } else {
      description = "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
        "I am a Teacher. I teach No Class.";
    }
    return description;
  }

  public boolean isTeaching(Student student) {
    return classes.contains(student.getKlass().getNumber());
  }
  
}
