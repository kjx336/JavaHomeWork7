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

abstract class Person{
    public abstract int pay();
}

class Teachers extends Person{
    String TeacherName;
    int BasicSalary;
    int ClassHour;
    Teachers(String a,int b,int c){
        this.TeacherName = a;
        this.BasicSalary = b;
        this.ClassHour = c;
    }
    public int pay(){
        return (BasicSalary + ClassHour*30);
    }
    public static Teachers readTeacher(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("输入教师名称:\n");
        String TeacherName = in.nextLine();
        System.out.print("输入基础工资:\n");
        int BasicSalary = Integer.parseInt(in.nextLine());
        System.out.print("输入教学时长:\n");
        int ClassHour = Integer.parseInt(in.nextLine());
        return new Teachers(TeacherName,BasicSalary,ClassHour);
    }
}
class CollegeStudents extends Person{
    String StudentName;
    int Scholarship;
    CollegeStudents(int a,String b){
        this.Scholarship = a;
        this.StudentName = b;
    }
    public static CollegeStudents readCollegeStudent(){
        Scanner in = new Scanner(System.in,"GB2312");
        System.out.print("输入学生名称:\n");
        String name = in.nextLine();
        System.out.print("输入奖学金支出:\n");
        String S = in.nextLine();
        return new CollegeStudents(Integer.parseInt(S),name);
    }
    public int pay(){
        return Scholarship;
    }
}
public class people {
    public static void main(String[] args) {
        Teachers T1 = Teachers.readTeacher();
        CollegeStudents C1 = CollegeStudents.readCollegeStudent();
        System.out.println(T1.pay());
        System.out.println(C1.pay());
    }
    
}



