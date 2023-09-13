/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworldapp;

import java.sql.SQLException;

/**
 *
 * @author Harsh Chandel
 */
public class Helloworldapp {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World ");  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login2().setVisible(true);
            }
        });
    }
}
