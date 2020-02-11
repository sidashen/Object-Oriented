import java.util.ArrayList;

public class Teacher extends Person {
  private ArrayList classes;

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

  public String[] isTeaching(Student student) {
    String[] statement = new String[2];
    if (classes.contains(student.getKlass().getNumber())) {
      statement[0] = "I am " + this.getName() + ". I know " + student.getName()
        + "has joined Class" + this.getClass() + ".";
    }
    if (student.getKlass().getLeader().equals(student.getName())) {
      statement[1] = "I am " + this.getName() + ". I know " + student.getName()
        + "become Leader of Class" + this.getClass() + ".";
    }
    return statement;
  }

}
