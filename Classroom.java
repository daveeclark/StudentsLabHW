package com.classroomHW;


public class Classroom {
  private Student[] students;

  public Classroom(int maxNumberOfStudents) {
  }

  public Classroom(Student[] students) {
  }

  public Classroom() {
    this.students = new Student[30];
  }

  public Student[] getStudents() {
    return students;
  }

  public double getAverageExamScore() {
    double sum = 0;
    for (int avgExamScore = 0; avgExamScore < students.length; avgExamScore++) {
      sum += students[avgExamScore].getExamScores();
    }
    return sum;
  }

  public void addStudent(Student student) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == student) {
        students[i] = student;
      }
    }
  }

  public void removeStudent(String firstName, String lastName) {
    for (int i = 0; i < students.length; i++) {
      if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
        students[i] = new Student(null, null, null);
      }
    }
  }

  public void getStudentsByScore() {
    for (int counter = students.length; counter <= students.length; counter--) {
      for (Student student : students) {
        if (student.getExamScores() > 0) {
          students[counter] = new Student(null, null, null);
        }
      }
    }
  }
}
