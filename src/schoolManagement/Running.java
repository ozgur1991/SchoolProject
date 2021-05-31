package schoolManagement;

import java.util.*;

public class Running {

    private final List<Student> studentList=new ArrayList<>();
    private final List<Teacher> teacherList=new ArrayList<>();

    private String personType;


    public void mainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("======================================");
        System.out.println("1-OGRENCI ISLEMLERI");
        System.out.println("2-OGRETMEN ISLEMLERI");
        System.out.println("Q-CIKIS");


        System.out.println("Please choose an option");

        String choice = scan.next().toUpperCase();

        switch (choice) {
            case "Q":
                exit();
                break;
            case "1":
                personType = "Student";
                processMenu();
                break;
            case "2":
                personType = "Teacher";
                processMenu();
                break;
            default:
                System.out.println("Please choose your option");
                mainMenu();
                break;
        }


    }

    private void processMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("============ISLEMLER===========");
        System.out.println("1-EKLEME");
        System.out.println("2-ARAMA");
        System.out.println("3-LISTELEME");
        System.out.println("4-SILME");
        System.out.println("5-ANA MENU");
        System.out.println("Q-CIKIS");

        System.out.println("Please choose an option");

        String choice = scan.next().toUpperCase();

        switch (choice) {

            case "1":
                add();
                break;
            case "2":
               search();
                break;
            case "3":
               list();
                break;
            case "4":
               delete();
                break;
            case "5":
                mainMenu();
                break;
            case "Q":
                exit();
                break;
            default:
                System.out.println("Please make your choice again");
                processMenu();
                break;
        }

    }

    private void delete() {
        if (personType.equals("Student")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number of the student you want to delete");
            int no = scan.nextInt();
            studentList.removeIf(each -> no == each.getNumber());
            System.out.println("Student's record has been deleted");
        } else if (personType.equals("Teacher")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number of the student you want to delete");
            int no = scan.nextInt();
            teacherList.removeIf(each -> no == each.getNumber());
            System.out.println("Student's record has been deleted");

        }
        processMenu();
    }
    private void list() {
        if (personType.equals("Student")) {

            studentList.forEach(System.out::println);
        } else
        if (personType.equals("Teacher")) {
            teacherList.forEach(System.out::println);
        }
        processMenu();
    }

    private void search() {
        if (personType.equals("Student")) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter the number of the student");
            int no=scan.nextInt();

            studentList.stream().filter(x-> no==x.getNumber()).forEach(System.out::println);
        } else
            if (personType.equals("Teacher")) {
                Scanner scan=new Scanner(System.in);
                System.out.println("Please enter the number of the teacher");
                int no=scan.nextInt();

                teacherList.stream().filter(x-> no==x.getNumber()).forEach(System.out::println);
            }
        processMenu();
    }

    private static void exit() {

        System.out.println("Have a nice day!!");
    }
private void add () {
    Scanner scan=new Scanner(System.in);
    System.out.println("=========="+personType+" Ekleme Sayfasi========");
    System.out.println("Please enter "+personType+"'s  first name:");

    String FName=scan.nextLine();

    System.out.println("Please enter the "+personType+"'s last name:");

    String LName=scan.nextLine();

    System.out.println("Please enter the "+personType+"'s Id:");

    String idNo= scan.next();

    System.out.println("Please enter the "+personType+"'s  age:");

    int age= scan.nextInt();

if ( personType.equals("Student")) {

    System.out.println("Please enter the Student's number:");

    int number = scan.nextInt();

    System.out.println("Please enter the Student's classroom:");

    String classRoom = scan.next();

    Student std = new Student(FName,LName, idNo, age, number, classRoom);

    studentList.add(std);
processMenu();
     } else if ( personType.equals("Teacher")) {

    System.out.println("Please enter the teacher's department:");

    String dep=scan.next();

    System.out.println("Please enter the teacher's number:");

    int number= scan.nextInt();

    Teacher tch=new Teacher(FName,LName,idNo,age,dep,number);

    teacherList.add(tch);
    processMenu();
}

}
}