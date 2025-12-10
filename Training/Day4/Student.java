import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;

class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}

class Main {
    public static void main(String[] args) {
        HashSet<Student> se = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int rollNo;
        String name;
        Student s;

        for(int i = 0; i < n; i++){
            rollNo = sc.nextInt();
            sc.nextLine();
            name = sc.nextLine();
            s = new Student(rollNo, name);
            se.add(s);
        }

        for(Student i : se){
            System.out.println(i.getRollNo() + " " + i.getName());
        }
    }
}