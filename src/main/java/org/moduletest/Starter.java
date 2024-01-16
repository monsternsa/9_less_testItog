package org.moduletest;

public class Starter {
    public static void main(String[] args) {
        System.out.println("HW");
        Student student=new Student("SSS_Student");
        student.addMark(3);
        student.getMarks().add(222);
        System.out.println(student);
    }
}
