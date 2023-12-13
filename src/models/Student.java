package models;

public class Student {
    String name;
    int age;
    int[] marks;
    String grade;

    // Constructor
    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for marks
    public int[] getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // custom method
    public void displayResults() {
        int totalMarks = 0;
        for(int i=0;i<marks.length;i++) {
            int a=marks[i];
            totalMarks += marks[i];
        }
        double percentage = (double) totalMarks / marks.length;


        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else  if (percentage >= 50){
            grade = "C+";
        } else  if (percentage >= 40){
            grade = "C";
        } else{
            System.out.println("F");
        }

        // Display report card information
        System.out.println("------ Report Card for " + name + " ------");
        System.out.println("Age: " + age);
        System.out.println("Marks Obtained:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + ((grade.equals("F")) ? "Fail" : "Pass"));
        System.out.println("------------------------------------");
    }
}
