package pack1;

public class Student1 {

	public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 18);
        Student student3 = new Student("John", 20);

        boolean isEqual1 = student1.isEqual(student1, student2);
        boolean isEqual2 = student1.isEqual(student1, student3);

        System.out.println("Are student1 and student2 equal? " + isEqual1);
        System.out.println("Are student1 and student3 equal? " + isEqual2);
    }

}
