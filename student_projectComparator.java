import java.util.Comparator;

public class student_projectComparator implements Comparator<student_project> {
    private String field;

    public student_projectComparator(String field) {
        this.field = field;

    }

    public int compare (student_project o1, student_project o2){
        switch(field){
            case "name":
              return o1.getName().compareTo(o2.getName());
            case "email":
              return o1.getEmail().compareTo(o2.getEmail());
            case "GPA":
              return Double.compare(o1.getGPA(),o2.getGPA());
            case "ID":
              return Integer.compare(o1.getID(), o2.getID());
            default :
              return 0;
             
        }
       
    }
}
