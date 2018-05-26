
import java.awt.event.KeyEvent;


public class Kalkulator extends javax.swing.JFrame {

    public Kalkulator() {
        initComponents();
         reset();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pertama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kedua = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnmodulus = new javax.swing.JButton();
        btnx2 = new javax.swing.JButton();
        btnceklis = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        pertama.setText(" ");
        pertama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pertamaActionPerformed(evt);
            }
        });
        pertama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pertamaKeyTyped(evt);
            }
        });

        jLabel1.setText("Masukan angka pertama :");

        jLabel2.setText("Masukan angka kedua    :");

        jLabel3.setText("TOTAL                             :");

        jLabel4.setText("+++++++KALKULATOR SEDERHANA++++++");

        kedua.setText("  ");
        kedua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keduaKeyTyped(evt);
            }
        });

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btnkali.setText("X");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btnmodulus.setText("%");
        btnmodulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodulusActionPerformed(evt);
            }
        });

        btnx2.setText("X2");
        btnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx2ActionPerformed(evt);
            }
        });

        btnceklis.setText("√");
        btnceklis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceklisActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(pertama, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jumlah)
                                            .addComponent(kedua, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnmodulus, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnkurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnkali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnx2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(btnhapus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnceklis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntambah)
                            .addComponent(btnkali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbagi)
                            .addComponent(btnkurang))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnx2)
                                    .addComponent(btnmodulus)))))
                    .addComponent(btnceklis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhapus)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pertamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pertamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pertamaActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
            double i = Double.parseDouble(pertama.getText());
        Double j = Double.parseDouble(kedua.getText());
        penjumlahan(i, j);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
           double i = Double.parseDouble(pertama.getText());
        Double j = Double.parseDouble(kedua.getText());
        pengurangan(i, j);
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
      double i = Double.parseDouble(pertama.getText());
        Double j = Double.parseDouble(kedua.getText());
        pembagian(i, j);
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnmodulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodulusActionPerformed
  double i = Double.parseDouble(pertama.getText());
        Double j = Double.parseDouble(kedua.getText());
        pembagian(i, j);
    }//GEN-LAST:event_btnmodulusActionPerformed

    private void btnx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx2ActionPerformed
       double i = Double.parseDouble(pertama.getText());
        double j = Double.parseDouble(kedua.getText());
       pangkat(i, j);
    }//GEN-LAST:event_btnx2ActionPerformed

    private void btnceklisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceklisActionPerformed
     double i = Double.parseDouble(pertama.getText());
        double j = Double.parseDouble(kedua.getText());
       akar(i, j); 
    }//GEN-LAST:event_btnceklisActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
    double i = Double.parseDouble(pertama.getText());
        Double j = Double.parseDouble(kedua.getText());
        perkalian(i, j);
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    pertama.setText("");
   kedua.setText("");
   jumlah.setText("");
    btntambah.setEnabled(false);
        btnkurang.setEnabled(false);
        btnkali.setEnabled(false);
        btnbagi.setEnabled(false);
        btnmodulus.setEnabled(false);
        btnx2.setEnabled(false);
        btnceklis.setEnabled(false); 
    }//GEN-LAST:event_btnhapusActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
 
    }//GEN-LAST:event_formKeyTyped

    private void pertamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pertamaKeyTyped
       char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )
            )
        {
            evt.consume();
        }
                                   
    }//GEN-LAST:event_pertamaKeyTyped

    private void keduaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keduaKeyTyped
   btntambah.setEnabled(true);
        btnkurang.setEnabled(true);
        btnkali.setEnabled(true);
        btnbagi.setEnabled(true);
        btnmodulus.setEnabled(true);
        btnx2.setEnabled(true);
        btnceklis.setEnabled(true);
                            
    }//GEN-LAST:event_keduaKeyTyped
 public void reset(){

        jumlah.setEnabled(false);
        jumlah.setText("");
        pertama.setText("");
        kedua.setText("");
        btntambah.setEnabled(false);
        btnkurang.setEnabled(false);
        btnkali.setEnabled(false);
        btnbagi.setEnabled(false);
        btnmodulus.setEnabled(false);
        btnx2.setEnabled(false);
        btnceklis.setEnabled(false); 
        
    }    
 
    
   public void penjumlahan(double bilangan1, double bilangan2) {
        double hasil = 0;
        hasil = bilangan1 + bilangan2;
        jumlah.setText(hasil + "");
    }
   public void pengurangan(double bilangan1, double bilangan2) {
        double hasil = 0;
        hasil = bilangan1 - bilangan2;
        jumlah.setText(hasil + "");
    }
   public void pembagian(double bilangan1, double bilangan2) {
        double hasil = 0;
        hasil = bilangan1 / bilangan2;
        jumlah.setText(hasil + "");
    }
   public void perkalian(double bilangan1, double bilangan2) {
        double hasil = 0;
        hasil = bilangan1 * bilangan2;
        jumlah.setText(hasil + "");
    }
   public void modulus(double bilangan1, double bilangan2) {
        double hasil = 0;
        hasil = bilangan1 % bilangan2;
        jumlah.setText(hasil + "");
    }
       public void pangkat(double bilangan1, double bilangan2) {
        double hasil=0;
        hasil = Math.pow(bilangan1, bilangan2);
        jumlah.setText( hasil+ "");
       }
       public void akar(double bilangan1, double bilangan2) {
        double hasil=0;
        hasil = Math.sqrt(bilangan1);
        jumlah.setText( hasil+ "");
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnceklis;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnmodulus;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnx2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kedua;
    private javax.swing.JTextField pertama;
    // End of variables declaration//GEN-END:variables
}
