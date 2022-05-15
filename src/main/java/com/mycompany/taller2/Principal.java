package com.mycompany.taller2;

public class Principal extends javax.swing.JFrame {

    Procesos objeto;
    Procesos obj;
    public Principal(){
        initComponents();
        this.setLocationRelativeTo(null);
        pausar.setEnabled(false);
        reiniciar.setEnabled(false);
        objeto = new Procesos(rojo, amarillo, verde, texto, rojo2,amarillo2,verde2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amarillo2 = new javax.swing.JButton();
        verde2 = new javax.swing.JButton();
        rojo2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pausar = new javax.swing.JButton();
        activar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        rojo = new javax.swing.JButton();
        amarillo = new javax.swing.JButton();
        verde = new javax.swing.JButton();
        texto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Semaforo 2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));
        jPanel3.add(amarillo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, 40));
        jPanel3.add(verde2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 40));
        jPanel3.add(rojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 240, 490));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Semaforo 1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        pausar.setText("Pausar");
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });
        jPanel2.add(pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 20));

        activar.setText("Activar");
        activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarActionPerformed(evt);
            }
        });
        jPanel2.add(activar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jPanel2.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
        jPanel2.add(rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 40));
        jPanel2.add(amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, 40));
        jPanel2.add(verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 40));
        jPanel2.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarActionPerformed
        activar.setEnabled(false);
        pausar.setEnabled(true);
        reiniciar.setEnabled(true);
        objeto.start();
    }//GEN-LAST:event_activarActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        objeto.reiniciar();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarActionPerformed
        pausar.setEnabled(false);
        activar.setEnabled(true);
        objeto.detener();
    }//GEN-LAST:event_pausarActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activar;
    private javax.swing.JButton amarillo;
    private javax.swing.JButton amarillo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pausar;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton rojo;
    private javax.swing.JButton rojo2;
    private javax.swing.JTextField texto;
    private javax.swing.JButton verde;
    private javax.swing.JButton verde2;
    // End of variables declaration//GEN-END:variables
}
