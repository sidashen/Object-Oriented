public class Student extends Person{
  public int class;

  public Student(int id, String name, int age) {
    super(id, name, age);
  }

  public int getStudentClass() {
    return class;
  }

  public void setStudentClass(int class) {
    this.class = class;
  }

  

}
