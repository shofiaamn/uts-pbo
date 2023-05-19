/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student;

import java.util.Scanner;

/**
 *
 * @author Guesst
 */
public class Student {
    
    private String name;
    private int age;
    
    public Student setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nama Siswa : ");
        String name = sc.nextLine();
        System.out.println("Masukkan Umur Siswa : ");
        int age = sc.nextInt();
        this.name = name;
        this.age = age;
        return this;
    }
    
    public void display_info(){
        System.out.println("Halo " + name + ",kamu sekarang berusia " + age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student = student.setValues();
        student.display_info();
        
    }
}
