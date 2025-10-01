public class StudentObiect {
    public static void main(String[] args) {

        Student student1 = new Student( "Dorin",
                                        18,
                                        "JV25",
                                        "Masculin",
                                        "Blond" );

        Student student2 = new Student( "Elidar",
                                        17,
                                        "PH23",
                                        "Masculin",
                                        "Brunet" );

        Student student3 = new Student( "Aurelia",
                17,
                "ING31",
                "Femenin",
                "Șaten" );


        System.out.println("Numele: " + student1.name);
        System.out.println("Varsta: " + student1.age);
        System.out.println("Denumirea grupei: " + student1.groupName);
        System.out.println("Genul: " + student1.gender);
        System.out.println("Culoarea parului: " + student1.hairColor);

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println("Numele: " + student2.name);
        System.out.println("Varsta: " + student2.age);
        System.out.println("Denumirea grupei: " + student2.groupName);
        System.out.println("Genul: " + student2.gender);
        System.out.println("Culoarea parului: " + student2.hairColor);

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        System.out.println("Numele: " + student3.name);
        System.out.println("Varsta: " + student3.age);
        System.out.println("Denumirea grupei: " + student3.groupName);
        System.out.println("Genul: " + student3.gender);
        System.out.println("Culoarea parului: " + student3.hairColor);

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        student3.lucreaza(student3.name);

    }
}
