public class student_project {
    private String name;
    private String email;
    private double GPA;
    private int ID;
    private int age;

    public student_project(String name, String email, double GPA, int ID, int age) {
        this.name = name;
        this.email = email;
        this.GPA = GPA;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String toString(){
        return "Name:"+name + "\nEmail :"+email +"\nGPA:" + GPA +" \nID :"+ ID+ "\nAge :" +age +"\n";
    }
}
