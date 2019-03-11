/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

/**
 *
 * @author kjx33
 */
class Licenses{
    int id;
    String name;
    int gender;
    String birth;
    void print(){
        System.out.println(this.id + this.name + this.gender + this.birth);
    }
}
class SLicense extends Licenses{
    String major;
    String loginDate;
    String login;
    SLicense(int a,String b,int c,String d,String e,String f,String g){
        this.id = a;
        this.name = b;
        this.gender = c;
        this.birth = d;
        this.major = e;
        this.loginDate = f;
        this.login = g;
    }
    void printf(){
        System.out.println("哈哈哈");
    }
}
class TLicense extends Licenses{
    String job;
    String signDate;
    TLicense(int a,String b,int c,String d,String e,String f){
        this.id = a;
        this.name = b;
        this.gender = c;
        this.birth = d;
        this.job = e;
        this.signDate = f;
    }
}
public class License {
    public static void main(String[] args) {
        SLicense Me = new SLicense(1,"柯正轩",1,"1998-12-16","IMIS","9-1","True");
        TLicense teacher = new TLicense(1,"李猛坤",1,"unknow","讲师","unknow");
        Me.print();
        teacher.print();
        Me.printf();
    }
    
}

