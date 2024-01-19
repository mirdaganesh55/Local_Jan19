package com.java.pack1;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Classroom {
    private Student[] students;
    private Teacher teacher;

    public Classroom(int capacity, Teacher teacher) {
        students = new Student[capacity];
        this.teacher = teacher;
    }

    public void addStudent(Student student, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = student;
        }
    }

    public void displayClassInfo() {
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students:");

        for (Student student : students) {
            if (student != null) {
                System.out.println("- " + student.getName());
            }
        }
    }
}

public class School_Management {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Ganesh");

        Classroom classroom = new Classroom(20, teacher);
        classroom.addStudent(student1, 0);
        classroom.addStudent(student2, 1);
        classroom.addStudent(student3, 2);

        classroom.displayClassInfo();
    }
}

