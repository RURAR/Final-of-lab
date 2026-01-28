import java.util.*;
class Student{
    private String id;
    private String name;
    private double cgpa;
    void setId(String id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }

    void setCgpa(double cgpa){
        if(cgpa>=0&&cgpa <=4)
            this.cgpa=cgpa;
        else
            System.out.println("Invalid CGPA");
    }

    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    double getCgpa(){
        return cgpa;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter ID: ");
        s.setId(sc.nextLine());

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter CGPA: ");
        s.setCgpa(sc.nextDouble());

        System.out.println("\nStudent Details:");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
    }
}
