package schoolManagement;

import java.util.List;
import java.util.Scanner;

public class Student extends Person {

    private int number;
    private String classRoom;

    public Student(String FName, String LName, String idNo, int age, int number, String classRoom) {
        super(FName, LName, idNo, age);
        this.number = number;
        this.classRoom = classRoom;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

   public String toString() {
        return "First Name:" +getFName()+ " Last Name:" + getLName() + " Id:" + getIdNo()+ " Age:" + getAge()+
                " Number:" +getNumber()+" Class:"+getClassRoom();
    }

}
