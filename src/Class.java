public class Class {
  private int number;
  private String leader;

  public Class (int number) {
    this.number = number;
  }

  public void setLeader(String leader) {
    this.leader = leader;
  }

  public String getLeader() {
    return leader;
  }

  public void assignLeader(Student student) {
    if (appendMember(student)) {
      this.leader = student.getName();
    } else {
      System.out.println("It is not one of us.");
    }
  }

  public boolean appendMember(Student student) {
    student.getKlass().number = this.number;
    return true;
  }
}

