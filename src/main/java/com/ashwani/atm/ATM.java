/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ashwani.atm;

/**
 *
 * @author Ashu
 */
public class ATM {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage();
            }
        });

    }
}
