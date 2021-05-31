package schoolManagement;

public class Teacher extends Person {


    private String dep;
    private int number;

    public Teacher(String FName, String LName, String idNo, int age, String dep, int number) {
        super(FName, LName, idNo, age);
        this.dep = dep;
        this.number = number;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   public String toString() {
        return "First Name:" +getFName()+ " Last Name:" + getLName() + " Id:" + getIdNo()+ " Age:" + getAge()+
                " Department:" +getDep()+" Number:"+getNumber();
    }
}



