package com.classroomHW;


public class Classroom {
  private Student[] students;

  public Classroom(int maxNumberOfStudents){
  }

  public Classroom(Student[] students){}

  public Classroom(){
    this.students= new Student[30];
  }

  public Student[] getStudents() {
    return students;
  }

  public double getAverageExamScore(){
    double sum = 0;
    for (Student avgExamScore : students) {
          sum += avgExamScore;
    }
  }

  public void addStudent(Student student){

  }

}
