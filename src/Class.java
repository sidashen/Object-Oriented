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
    this.leader = student.getName();
  }

}

