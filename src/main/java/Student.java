import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    Scanner in = new Scanner(System.in);

    String id;
    String name;
    String surname;
    String fakultet;
    String kyrs;
    String group;
//    Calendar birth;

    public Student(String id, String name, String surname, String fakultet, String kyrs, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fakultet = fakultet;
        this.kyrs = kyrs;
        this.group = group;
        //this.birth = birth;
    }


    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getKyrs() {
        return kyrs;
    }

    public void setKyrs(String kyrs) {
        this.kyrs = kyrs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(){

        id = in.nextLine();
        name = in.nextLine();
        surname = in.nextLine();
        fakultet = in.nextLine();
        kyrs = in.nextLine();
        group = in.nextLine();

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", kyrs='" + kyrs + '\'' +
                ", group='" + group + '\''

                +
                '}';
    }

    static Student[] createStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter kol-vo students ");
        int amount = in.nextInt();

        Student arr[] = new Student[amount];

        for (int i=0; i<arr.length; i++){
            System.out.println("Creating a new student ");
            arr[i] = new Student();
            System.out.println(arr[i].toString());



        }
        return arr;
    }

    public static void find (Student[] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fakultet ");
        String fakultet = in.nextLine();

        System.out.println("Enter kyrs");
        String kyrs = in.nextLine();

        System.out.println("Enter group");
        String group = in.nextLine();

        for (Student a:arr){
            if (a.getFakultet().equals(fakultet)) {
                System.out.println(a.toString());
            }
            if (a.getKyrs().equals(fakultet)){
                System.out.println(a.toString());
            }
            if (a.getGroup().equals(fakultet)){
                System.out.println(a.toString());
            }
        }
    }
}
