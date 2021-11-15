/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanII_GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

// *
// * @author Naufal Zaki
// *         TIFRP 19A
// *         19552011155
// *  Teknik Informatika
// ----------------------------------
// * SEKOLAH TINGGI TEKNOLOGI BANDUNG
// ----------------------------------
// */

public class MenghitungNilaiMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MenghitungNilaiMahasiswa
     */
    public MenghitungNilaiMahasiswa() {
        initComponents();
        namamahasiswa.setBackground(new java.awt.Color(0,0,0,1));
        nim.setBackground(new java.awt.Color(0,0,0,1));
        uas.setBackground(new java.awt.Color(0,0,0,1));
        uts.setBackground(new java.awt.Color(0,0,0,1));
        tugas.setBackground(new java.awt.Color(0,0,0,1));
        absensi.setBackground(new java.awt.Color(0,0,0,1));
        
    }
    
      void filterhuruf(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom ini Hanya Bisa Memasukan Angka");
        }
    }
    void filterangka (KeyEvent b){
        if(Character.isDigit(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,"Pada Kolom ini Hanya bisa Memasukan Karakter Huruf");
        }
    }
    
    
    private void bersihForm() {
        namamahasiswa.setText("");
        nim.setText("");
        uas.setText("");
        uts.setText("");
        tugas.setText("");
        absensi.setText("");
        grade.setText("");
        NilaiAkhir.setText("");
        jLabel1.setText("");
        jLabel2.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nilaimahasiswa = new javax.swing.JButton();
        namamahasiswa = new javax.swing.JTextField();
        grade = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        uas = new javax.swing.JTextField();
        uts = new javax.swing.JTextField();
        tugas = new javax.swing.JTextField();
        absensi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NilaiAkhir = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nilaimahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/button2warna.png"))); // NOI18N
        nilaimahasiswa.setBorderPainted(false);
        nilaimahasiswa.setContentAreaFilled(false);
        nilaimahasiswa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Button1.png"))); // NOI18N
        nilaimahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaimahasiswaActionPerformed(evt);
            }
        });
        jPanel1.add(nilaimahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 270, 40));

        namamahasiswa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namamahasiswa.setBorder(null);
        namamahasiswa.setOpaque(false);
        namamahasiswa.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        namamahasiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namamahasiswaKeyTyped(evt);
            }
        });
        jPanel1.add(namamahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, 30));

        grade.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 60, 70));

        nim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nim.setBorder(null);
        nim.setOpaque(false);
        nim.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nimKeyTyped(evt);
            }
        });
        jPanel1.add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 220, 30));

        uas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uas.setBorder(null);
        uas.setOpaque(false);
        uas.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        uas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uasKeyTyped(evt);
            }
        });
        jPanel1.add(uas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));

        uts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uts.setBorder(null);
        uts.setOpaque(false);
        uts.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        uts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                utsKeyTyped(evt);
            }
        });
        jPanel1.add(uts, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 220, 30));

        tugas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tugas.setBorder(null);
        tugas.setOpaque(false);
        tugas.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        tugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tugasKeyTyped(evt);
            }
        });
        jPanel1.add(tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 220, 40));

        absensi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        absensi.setBorder(null);
        absensi.setOpaque(false);
        absensi.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        absensi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                absensiKeyTyped(evt);
            }
        });
        jPanel1.add(absensi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 220, 30));

        NilaiAkhir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(NilaiAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 220, 30));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/buttonclearwarna.png"))); // NOI18N
        clear.setBorderPainted(false);
        clear.setContentAreaFilled(false);
        clear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/buttonclear1.png"))); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 270, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/LatarUtamaa.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 624, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nilaimahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaimahasiswaActionPerformed
        // TODO add your handling code here:
        
        int UAS,UTS,TUGAS;
        double Dataabsensi;
        
        String nama = namamahasiswa.getText();
        String NIM = nim.getText();
        UAS=Integer.parseInt(uas.getText());
        UTS=Integer.parseInt(uts.getText());
        TUGAS=Integer.parseInt(tugas.getText());
        Dataabsensi=Double.parseDouble(absensi.getText());
        
        UAS = UAS*40/100;
        UTS = UTS*30/100;
        TUGAS = TUGAS*20/100;
        Dataabsensi = ((Dataabsensi/14)*0.1)*100;
        int absen = (int)Dataabsensi;
        
        double jumlah = UAS+UTS+TUGAS+absen;
        
        String Grade;
            
            if(jumlah>=80) {
                Grade = "A";
            }else if(jumlah>=69) {
                Grade = "B";
            }else if(jumlah>=58) {
                Grade = "C";
            }else if(jumlah>=47) {
                Grade = "D";
            }else{
                Grade = "E";
            }
            
            grade.setText(""+Grade);
            jLabel1.setText(""+nama);
            jLabel2.setText(""+NIM);
            NilaiAkhir.setText(""+jumlah);
    }//GEN-LAST:event_nilaimahasiswaActionPerformed

    private void namamahasiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namamahasiswaKeyTyped
        // TODO add your handling code here:
        filterangka(evt);
    }//GEN-LAST:event_namamahasiswaKeyTyped

    private void nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_nimKeyTyped

    private void uasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uasKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_uasKeyTyped

    private void utsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utsKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_utsKeyTyped

    private void tugasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tugasKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_tugasKeyTyped

    private void absensiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_absensiKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
        
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
        if (absensi.getText().length() == 2) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_absensiKeyTyped

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
          bersihForm();
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenghitungNilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenghitungNilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenghitungNilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenghitungNilaiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenghitungNilaiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NilaiAkhir;
    private javax.swing.JTextField absensi;
    private javax.swing.JLabel background;
    private javax.swing.JButton clear;
    private javax.swing.JLabel grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namamahasiswa;
    private javax.swing.JButton nilaimahasiswa;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField tugas;
    private javax.swing.JTextField uas;
    private javax.swing.JTextField uts;
    // End of variables declaration//GEN-END:variables
}
