import java.util.ArrayList;

public class Teacher extends Person {
  private ArrayList<Class> classes;

  public Teacher(int id, String name, int age, ArrayList<Class> classes) {
    super(id, name, age);
    this.classes = classes;
  }

  public ArrayList getClasses() {
    return classes;
  }

  public void setClasses(ArrayList<Class> classes) {
    this.classes = classes;
  }

  public String introduce () {
    if (classes.size() != 0) {
      String myClasses = "";
      for (Class klass :classes){
        myClasses += klass;
      }
      return  "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
        "I am a Teacher. I teach Class" + myClasses + ".";
    } else {
      return "My name is" + this.getName() + ". I am " + this.getAge() + "years old.  " +
        "I am a Teacher. I teach No Class.";
    }
  }

  public boolean isTeaching(Student student) {
    String[] statement = new String[2];
    boolean flag = false;
    if (classes.contains(student.getKlass())) {
      statement[0] = "I am " + student.getName() + ". I know " + student.getName()
        + "has joined Class" + student.getKlass().getNumber() + ".";
      System.out.println(statement[0]);
      flag = true;
    }
    if (student.getKlass().getLeader().equals(student)) {
      statement[1] = "I am " + student.getName() + ". I know " + student.getName()
        + "become Leader of Class" + student.getKlass().getNumber() + ".";
      System.out.println(statement[1]);
    }
    return flag;
  }

  public String personIntroduce() {
    return super.introduce();
  }

}
