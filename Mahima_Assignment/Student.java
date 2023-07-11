package pack1;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isEqual(Student s1, Student s2) {
        return s1.name.equals(s2.name) && s1.age == s2.age;
    }
}


