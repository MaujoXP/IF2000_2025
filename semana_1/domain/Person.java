package IF2000_2025.semana_1.domain;

public class Person {
  private String name;
  private String lastName;
  private String id;
  private String phone;
  private int age;

  public Person(String name, String lastName, String id, String phone, int age) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
    this.phone = phone;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getLastNameString() {
    return lastName;
  }

  public String getId() {
    return id;
  }

  public String getPhone() {
    return phone;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return "Person" +
            "\nname = " + name +
            "\nlastName = " + lastName +
            "\nid = " + id +
            "\nphone = " + phone + 
            "\nage = " + age;
  }
}
