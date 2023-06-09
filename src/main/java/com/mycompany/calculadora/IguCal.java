/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

import java.util.Stack;
import javax.swing.JButton;

/**
 *
 * @author Bruno
 */
public class IguCal extends javax.swing.JFrame {
    
    public IguCal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_dividir = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        marca = new javax.swing.JLabel();
        btn_porcentaje = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        barra = new javax.swing.JLabel();
        btn_CE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dividir.setBackground(new java.awt.Color(102, 102, 102));
        btn_dividir.setForeground(new java.awt.Color(255, 255, 255));
        btn_dividir.setText("/");
        btn_dividir.setToolTipText("");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, 50));

        btn_3.setBackground(new java.awt.Color(102, 102, 102));
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.setToolTipText("");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 50));

        btn_0.setBackground(new java.awt.Color(102, 102, 102));
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.setToolTipText("");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 60, 50));

        btn_7.setBackground(new java.awt.Color(102, 102, 102));
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.setToolTipText("");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 50));

        btn_multiplicar.setBackground(new java.awt.Color(102, 102, 102));
        btn_multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicar.setText("x");
        btn_multiplicar.setToolTipText("");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, 50));

        btn_8.setBackground(new java.awt.Color(102, 102, 102));
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.setToolTipText("");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 60, 50));

        btn_suma.setBackground(new java.awt.Color(102, 102, 102));
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setText("+");
        btn_suma.setToolTipText("");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 60, 110));

        btn_9.setBackground(new java.awt.Color(102, 102, 102));
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.setToolTipText("");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 50));

        btn_resta.setBackground(new java.awt.Color(102, 102, 102));
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setText("-");
        btn_resta.setToolTipText("");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 60, 50));

        btn_6.setBackground(new java.awt.Color(102, 102, 102));
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.setToolTipText("");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 60, 50));

        btn_5.setBackground(new java.awt.Color(102, 102, 102));
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.setToolTipText("");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 60, 50));

        btn_4.setBackground(new java.awt.Color(102, 102, 102));
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.setToolTipText("");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 50));

        btn_igual.setBackground(new java.awt.Color(102, 102, 102));
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setText("=");
        btn_igual.setToolTipText("");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel1.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 130, 50));

        btn_1.setBackground(new java.awt.Color(102, 102, 102));
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.setToolTipText("");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 60, 50));

        marca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        marca.setText("CASIO");
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        btn_porcentaje.setBackground(new java.awt.Color(102, 102, 102));
        btn_porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        btn_porcentaje.setText("%");
        btn_porcentaje.setToolTipText("");
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, 50));

        btn_2.setBackground(new java.awt.Color(102, 102, 102));
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.setToolTipText("");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        barra.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 50));

        btn_CE.setBackground(new java.awt.Color(102, 102, 102));
        btn_CE.setForeground(new java.awt.Color(255, 255, 255));
        btn_CE.setText("CE");
        btn_CE.setToolTipText("");
        btn_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEActionPerformed(evt);
            }
        });
        jPanel1.add(btn_CE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        String expresion=barra.getText();
        evaluar(expresion);
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        escribir(btn_porcentaje);
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        escribir(btn_dividir);
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        escribir(btn_7);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        escribir(btn_8);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        escribir(btn_9);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        escribir(btn_6);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        escribir(btn_5);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        escribir(btn_4);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        escribir(btn_1);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        escribir(btn_2);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        escribir(btn_3);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        escribir(btn_0);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        escribir(btn_multiplicar);
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        escribir(btn_suma);
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        escribir(btn_resta);
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CEActionPerformed
        barra.setText("");
    }//GEN-LAST:event_btn_CEActionPerformed

    public void evaluar(String expresion) {
        // Eliminar espacios en blanco
        expresion = expresion.replace(" ", "");
        
        // Crear una pila para los números y otra para los operadores
        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();
        
        // Recorrer la cadena de entrada
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            
            // Si es un número, agregarlo a la pila de números
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (i+1 < expresion.length() && Character.isDigit(expresion.charAt(i+1))) {
                    sb.append(expresion.charAt(i+1));
                    i++;
                }
                double numero = Double.parseDouble(sb.toString());
                numeros.push(numero);
            }
            
            // Si es un operador, agregarlo a la pila de operadores
            else if (esOperador(c)) {
                while (!operadores.empty() && precedencia(operadores.peek()) >= precedencia(c)) {
                    aplicarOperador(numeros, operadores.pop());
                }
                operadores.push(c);
            }
        }
        
        // Aplicar los operadores que quedan en la pila
        while (!operadores.empty()) {
            aplicarOperador(numeros, operadores.pop());
        }
        
        // El resultado final está en la pila de números
        //return numeros.pop();
        String numeroString = Double.toString(numeros.peek());
        barra.setText(numeroString);
        
    }
    
    // Funciones auxiliares
    
    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == 'x' || c == '/' || c=='%';
    }
    
    private static int precedencia(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == 'x' || c == '/' || c=='%') {
            return 2;
        }
        return 0;
    }
    
    private static void aplicarOperador(Stack<Double> numeros, char operador) {
        double b = numeros.pop();
        double a = numeros.pop();
        switch (operador) {
            case '+': numeros.push(a + b); break;
            case '-': numeros.push(a - b); break;
            case 'x': numeros.push(a * b); break;
            case '/': numeros.push(a / b); break;
            case '%': numeros.push(a*b/100); break;
        }
    }
        public void escribir(JButton dato) {
        barra.setText(barra.getText() + dato.getText());
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_CE;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marca;
    // End of variables declaration//GEN-END:variables
}
