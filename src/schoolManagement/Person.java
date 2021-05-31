package schoolManagement;

public class Person {

    private String FName;
    private String LName;
    private String idNo;
    private int age;


    public Person(){

    }

    public Person(String FName, String LName, String idNo, int age) {
        this.FName = FName;
        this.LName = LName;
        this.idNo = idNo;
        this.age = age;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
