import java.util.ArrayList;

public class Class {
  private int number;
  private Student leader;
  private ArrayList<Student> studentArrayList;

  public Class (int number) { this.number = number; }

  public void setLeader(Student leader) { this.leader = leader; }

  public Student getLeader() { return leader; }

  public int getNumber() { return number; }

  public void setNumber(int number) { this.number = number; }

  public void assignLeader(Student student) {
    if (studentArrayList.contains(student)) {
      this.setLeader(student);
      student.introduce();
    } else {
      System.out.println("It is not one of us.");
    }
  }

  public void appendMember(Student student) {
    studentArrayList.add(student);
  }

  public boolean isIn(Student student) {
    if (student.getKlass().number == this.number) {
      return true;
    } else {
        return false;
    }
  }

}

