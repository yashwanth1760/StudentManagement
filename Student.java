package StudentManagementTask;

public class Student {
    private int id;
    private String name;
    private double marks;

   public Student(int id, String name, double marks) {
        this.id= id;
        this.name = name;
        this.marks = marks;
    }

    //getter and setter

    public int getId(){
         return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(double newMarks){
        this.marks = newMarks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }    
}

