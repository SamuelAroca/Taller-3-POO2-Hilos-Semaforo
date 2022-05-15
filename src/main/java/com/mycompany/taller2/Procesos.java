/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Jaylo
 */
public class Procesos implements Runnable{
    public boolean iterar;
    public JButton rojo;
    public JButton amarillo;
    public JButton verde;
    public JTextField texto;
    public JButton rojo2;
    public JButton amarillo2;
    public JButton verde2;
    public int contador=0, temp=0, temp2=0, temp3=0, temp4=0;

    public Procesos(JButton rojo, JButton amarillo, JButton verde, JTextField texto, JButton entrada5,JButton entrada6,JButton entrada7) {
        this.rojo = rojo;
        this.amarillo = amarillo;
        this.verde = verde;
        this.texto = texto;
        this.rojo2 = entrada5;
        this.amarillo2 = entrada6;
        this.verde2 = entrada7;
    }

    @Override
    public void run() {
        while (iterar) {
            contador++;
            if (contador >= 1 && contador <= 10) {
                temp++;
                texto.setText(" "+temp);
            }
            if (contador == 1) {
                rojo.setBackground(Color.RED);
                amarillo.setBackground(Color.GRAY);
                verde.setBackground(Color.GRAY);

                rojo2.setBackground(Color.GRAY);
                amarillo2.setBackground(Color.GRAY);
                verde2.setBackground(Color.GREEN);
            }
            if (contador >= 10 && contador <= 12) {
                temp2++;
                texto.setText(" "+temp2);
            }
            if (contador == 10) {
                rojo.setBackground(Color.GRAY);
                amarillo.setBackground(Color.YELLOW);
                verde.setBackground(Color.GRAY);

                rojo2.setBackground(Color.GRAY);
                amarillo2.setBackground(Color.YELLOW);
                verde2.setBackground(Color.GRAY);
            }
            if (contador >= 12 && contador <= 32) {
                temp3++;
                texto.setText(" "+temp3);
            }
            if (contador == 12) {
                rojo.setBackground(Color.GRAY);
                amarillo.setBackground(Color.GRAY);
                verde.setBackground(Color.GREEN);

                rojo2.setBackground(Color.RED);
                amarillo2.setBackground(Color.GRAY);
                verde2.setBackground(Color.GRAY);
            }
            if (contador >= 32 && contador <= 34) {
                temp4++;
                texto.setText(" "+temp4);
            }
            if (contador == 32) {
                rojo.setBackground(Color.GRAY);
                amarillo.setBackground(Color.YELLOW);
                verde.setBackground(Color.GRAY);

                rojo2.setBackground(Color.GRAY);
                amarillo2.setBackground(Color.YELLOW);
                verde2.setBackground(Color.GRAY);
            }
            if (contador == 33) {
                contador = 0;
                temp = 0;
                temp2 = 0;
                temp3 = 0;
                temp4 = 0;
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void start(){
        iterar = true;
        new Thread(this).start();
    } 
    public void detener(){
        iterar = false;
    }  
    public void reiniciar(){
        contador = 0;
        temp = 0;
        temp2 = 0;
        temp3 = 0;
        temp4 = 0;
        texto.setText("");
    }  
}
