package student_management;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
     //constructor: prompt user to enter student's name and year

    public Student(){
        Scanner in = new Scanner(System.in); //take user input
        System.out.print("Enter student first name");
        this.firstName = in.nextLine(); //takes in a string

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n 2 - Sophomore\n 3 - Junior\n 4 - Senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();



    }
    private void setStudentID(){
        id++;
        this.studentID =  gradeYear + "" + id;
    }

    public void enroll(){
      do {
          System.out.println("Enter course to enroll (Q to quit)");
          Scanner in = new Scanner(System.in);
          String course = in.nextLine();
          if (!course.equals("Q")) {
              courses = courses + "\n " + course;
              tuitionBalance = tuitionBalance + costOfCourse;
          } else { break; }
      } while (1 != 0);
        System.out.println("Tuition balance: " + tuitionBalance);
        }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    public String showInfo() {
        return "Home: " + firstName + " " + lastName + "\nGrade level" + gradeYear + "\nStudent ID:" + studentID + "\nCourses Enrolled" + courses + "\nBalance: $" + tuitionBalance;
    }
}
