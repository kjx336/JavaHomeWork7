/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Scanner;

/**
 *
 * @author kjx33
 */
class Teacher implements Paying{
    String TeacherName;
    int BasicSalary;
    int ClassHour;
    Teacher(String a,int b,int c){
        this.TeacherName = a;
        this.BasicSalary = b;
        this.ClassHour = c;
    }
    public int pay(){
        return (BasicSalary + ClassHour*30);
    }
    public static Teacher readTeacher(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("输入教师名称:\n");
        String TeacherName = in.nextLine();
        System.out.print("输入基础工资:\n");
        int BasicSalary = Integer.parseInt(in.nextLine());
        System.out.print("输入教学时长:\n");
        int ClassHour = Integer.parseInt(in.nextLine());
        return new Teacher(TeacherName,BasicSalary,ClassHour);
    }
}
class CollegeStudent implements Paying{
    String StudentName;
    int Scholarship;
    CollegeStudent(int a,String b){
        this.Scholarship = a;
        this.StudentName = b;
    }
    public static CollegeStudent readCollegeStudent(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("输入学生名称:\n");
        String name = in.nextLine();
        System.out.print("输入奖学金支出:\n");
        String S = in.nextLine();
        return new CollegeStudent(Integer.parseInt(S),name);
    }
    public int pay(){
        return Scholarship;
    }
}
public class PaySystem {
    public static void main(String[] args) {
        Teacher T1 = Teacher.readTeacher();
        CollegeStudent C1 = CollegeStudent.readCollegeStudent();
        System.out.println(T1.pay());
        System.out.println(C1.pay());
    }
    
}
