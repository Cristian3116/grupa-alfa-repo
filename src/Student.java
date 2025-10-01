public class Student {
    String name;
    int    age;
    String groupName;
    String gender;
    String hairColor;

    public Student(String name,
                   int    age,
                   String groupName,
                   String gender,
                   String hairColor) {

        this.name      = name;
        this.age       = age;
        this.groupName = groupName;
        this.gender    = gender;
        this.hairColor = hairColor;
    }

    public void lucreaza(String name) {
        System.out.println("Studentul " + name + " lucreaza la proiect...");

    }
}
