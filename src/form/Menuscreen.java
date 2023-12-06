/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandym
 */
public class Menuscreen extends javax.swing.JFrame {
    int xx, xy;

    int no = 0;

    public double total = 0;
    public double tax = 0;
    private int x = 0;

    /**
     * Creates new form Menuscreen
     */
    public Menuscreen() {
        initComponents();
        cetak.setEnabled(false);
        Insert.setEnabled(false);
    }

    public void init() {

    }

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Harap tambahkan jumlah barang");
            return false;
        }
        return true;
    }

    public void reset() {
        Total.setEnabled(true);
        cetak.setEnabled(false);
        Insert.setEnabled(false);
        
        ncoklatcake.setValue(0);
        nredvelvetcake.setValue(0);
        nstrawberycake.setValue(0);
        ntiramisucake.setValue(0);

        nChocolate.setValue(0);
        nAlmondChip.setValue(0);
        nGreenTea.setValue(0);

        niChocolate.setValue(0);
        nVanila.setValue(0);
        nStrawberry.setValue(0);
        nHazelnutChruncy.setValue(0);

        ChocolateCake.setSelected(false);
        RedVelvetCake.setSelected(false);
        StrawberyCake.setSelected(false);
        TiramisuCake.setSelected(false);

        Chocolate.setSelected(false);
        AlmondChip.setSelected(false);
        GreenTea.setSelected(false);

        iChocolate.setSelected(false);
        Vanila.setSelected(false);
        Strawbery.setSelected(false);
        HazelnutChruncy.setSelected(false);

        tax = 0;
        x = 0;
        total = 0;
        jTextArea.setText("");
    }

    public void clear() {
        nama.setText("");
        alamat.setText("");
        nohp.setText("");
    }

    public void SubTotal() {
        jTextArea.setText("Total \t\t" + total + "\n");

    }

    public void tax(int t) {
        if (t >= 10 && t <= 20) {
            tax = 0.5;
        } else if (t >= 20 && t <= 30) {
            tax = 1.0;
        } else if (t >= 30 && t <= 40) {
            tax = 2.0;
        } else if (t >= 40 && t <= 60) {
            tax = 3.0;
        } else if (t >= 60 && t <= 80) {
            tax = 4.0;
        } else if (t >= 80 && t <= 100) {
            tax = 4.0;
        } else if (t >= 100 && t <= 120) {
            tax = 8.0;
        } else if (t >= 120 && t <= 150) {
            tax = 10.0;
        } else if (t >= 100) {
            tax = 15.0;
        }
    }
    
    private boolean isCheckBoxAlreadyAdded(String checkBoxText) {
        return jTextArea.getText().contains(checkBoxText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        nohp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ChocolateCake = new javax.swing.JCheckBox();
        RedVelvetCake = new javax.swing.JCheckBox();
        StrawberyCake = new javax.swing.JCheckBox();
        TiramisuCake = new javax.swing.JCheckBox();
        Chocolate = new javax.swing.JCheckBox();
        AlmondChip = new javax.swing.JCheckBox();
        GreenTea = new javax.swing.JCheckBox();
        iChocolate = new javax.swing.JCheckBox();
        Vanila = new javax.swing.JCheckBox();
        Strawbery = new javax.swing.JCheckBox();
        HazelnutChruncy = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ntiramisucake = new javax.swing.JSpinner();
        ncoklatcake = new javax.swing.JSpinner();
        nredvelvetcake = new javax.swing.JSpinner();
        nstrawberycake = new javax.swing.JSpinner();
        niChocolate = new javax.swing.JSpinner();
        nVanila = new javax.swing.JSpinner();
        nHazelnutChruncy = new javax.swing.JSpinner();
        nStrawberry = new javax.swing.JSpinner();
        nGreenTea = new javax.swing.JSpinner();
        nAlmondChip = new javax.swing.JSpinner();
        nChocolate = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Insert = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        Total = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(110, 49, 18));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 242, 223));

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LogoMelsan.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(110, 49, 18));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(110, 49, 18));
        jLabel5.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA PELANGGAN");

        jLabel7.setText("Nama Pelanggan");

        jLabel10.setText("Alamat Pelanggan");

        jLabel11.setText("No Hp Pelanggan");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User Male.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Mailbox.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nohp))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 242, 223));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Kiri.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        ChocolateCake.setBackground(new java.awt.Color(255, 242, 223));
        ChocolateCake.setText("Chocolate Cake");
        ChocolateCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateCakeActionPerformed(evt);
            }
        });
        jPanel3.add(ChocolateCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        RedVelvetCake.setText("Red Velvet Cake");
        RedVelvetCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedVelvetCakeActionPerformed(evt);
            }
        });
        jPanel3.add(RedVelvetCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        StrawberyCake.setText("Strawbery Cake");
        StrawberyCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberyCakeActionPerformed(evt);
            }
        });
        jPanel3.add(StrawberyCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        TiramisuCake.setText("Tiramisu Cake");
        TiramisuCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiramisuCakeActionPerformed(evt);
            }
        });
        jPanel3.add(TiramisuCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 124, 120, -1));

        Chocolate.setText("Donuts Chocolate");
        Chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateActionPerformed(evt);
            }
        });
        jPanel3.add(Chocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 186, -1, -1));

        AlmondChip.setText("D Almond Chip");
        AlmondChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmondChipActionPerformed(evt);
            }
        });
        jPanel3.add(AlmondChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 216, -1, -1));

        GreenTea.setText("Donuts Green Tea");
        GreenTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenTeaActionPerformed(evt);
            }
        });
        jPanel3.add(GreenTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 246, -1, -1));

        iChocolate.setText("Ice Chocolate");
        iChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iChocolateActionPerformed(evt);
            }
        });
        jPanel3.add(iChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 316, -1, -1));

        Vanila.setText("IC Vanila");
        Vanila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanilaActionPerformed(evt);
            }
        });
        jPanel3.add(Vanila, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 344, -1, 30));

        Strawbery.setText("Ice Strawbery");
        Strawbery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberyActionPerformed(evt);
            }
        });
        jPanel3.add(Strawbery, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 372, -1, 30));

        HazelnutChruncy.setText("IC Hazelnut Chruncy");
        HazelnutChruncy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazelnutChruncyActionPerformed(evt);
            }
        });
        jPanel3.add(HazelnutChruncy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 404, -1, 20));

        jLabel15.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 49, 18));
        jLabel15.setText("Ice Cream");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 285, 118, -1));

        jLabel16.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 49, 18));
        jLabel16.setText("Cake");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 83, -1));

        jLabel17.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 49, 18));
        jLabel17.setText("Donuts");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 162, 162, 24));

        jLabel6.setText(": 50K");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 36, -1, -1));

        jLabel8.setText(": 45K");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 66, -1, -1));

        jLabel9.setText(": 48K");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 96, -1, -1));

        jLabel18.setText(": 50K");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 126, -1, -1));

        jLabel19.setText(": 20K");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 188, -1, -1));

        jLabel20.setText(": 15K");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 218, -1, -1));

        jLabel21.setText(": 15K");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 248, -1, -1));

        jLabel22.setText(": 25K");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 312, -1, 30));

        jLabel23.setText(": 25K");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 336, -1, 40));

        jLabel24.setText(": 25K");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 374, -1, 30));

        jLabel25.setText(": 30K");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 402, -1, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ice Cream.png"))); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 312, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cake.png"))); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Donuts.png"))); // NOI18N
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 172, -1, -1));

        ntiramisucake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(ntiramisucake, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 50, 30));

        ncoklatcake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(ncoklatcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 50, 30));

        nredvelvetcake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nredvelvetcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 50, 30));

        nstrawberycake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nstrawberycake, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 50, 30));

        niChocolate.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(niChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 312, 50, 30));

        nVanila.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nVanila, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 342, 50, 30));

        nHazelnutChruncy.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nHazelnutChruncy, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 402, 50, 30));

        nStrawberry.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 372, 50, 30));

        nGreenTea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nGreenTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 242, 50, 30));

        nAlmondChip.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nAlmondChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 212, 50, 30));

        nChocolate.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel3.add(nChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 182, 50, 30));

        jPanel6.setBackground(new java.awt.Color(255, 242, 223));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_3.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bannercoklat2.png"))); // NOI18N
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 110));

        jPanel7.setBackground(new java.awt.Color(255, 242, 223));

        Insert.setBackground(new java.awt.Color(110, 49, 18));
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(110, 49, 18));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea.setEditable(false);
        jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        Total.setBackground(new java.awt.Color(110, 49, 18));
        Total.setText("Total");
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        cetak.setBackground(new java.awt.Color(110, 49, 18));
        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(cetak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 242, 223));

        jTable1.setBackground(new java.awt.Color(255, 242, 223));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Nohp", "Cake", "Donuts", "IceCream", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ChocolateCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateCakeActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(ncoklatcake.getValue().toString());
            if (qtyIsZero(qty) && ChocolateCake.isSelected()) {
                String checkBoxText = ChocolateCake.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 50;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t"+qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    ChocolateCake.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ChocolateCakeActionPerformed

    private void TiramisuCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiramisuCakeActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(ntiramisucake.getValue().toString());
            if (qtyIsZero(qty) && TiramisuCake.isSelected()) {
                String checkBoxText = TiramisuCake.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 50;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    TiramisuCake.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TiramisuCakeActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
        boolean atLeastOneCheckBoxSelected = ChocolateCake.isSelected()
        || RedVelvetCake.isSelected()
        || StrawberyCake.isSelected()
        || TiramisuCake.isSelected()
        
        || Chocolate.isSelected()
        || AlmondChip.isSelected()
        || GreenTea.isSelected()
                
        || iChocolate.isSelected()        
        || Vanila.isSelected()
        || Strawbery.isSelected()
        || HazelnutChruncy.isSelected();
        
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (atLeastOneCheckBoxSelected && allTextFieldsFilled) {
        jTextArea.setText(jTextArea.getText()
                + "\n\n"
                + "****************************************\n"
                + "Tax : \t\t" + tax + "\n"
                + "Sub Total : \t\t" + total + "K\n"
                + "Total : \t\t" + (total + tax) + "K\n"
                + "************Thank You*****************"
        );
        Total.setEnabled(false);
        cetak.setEnabled(true);
        Insert.setEnabled(true);
        } else {
                    // Tampilkan pesan kesalahan atau lakukan tindakan lain jika kondisi tidak terpenuhi
                    JOptionPane.showMessageDialog(null, "Harap Mengisi Data Pelanggan dan Pilih Menu Pesanan terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_TotalActionPerformed

    private void RedVelvetCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedVelvetCakeActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
       }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nredvelvetcake.getValue().toString());
            if (qtyIsZero(qty) && RedVelvetCake.isSelected()) {
                String checkBoxText = RedVelvetCake.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 45;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: "  + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    RedVelvetCake.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RedVelvetCakeActionPerformed

    private void StrawberyCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberyCakeActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nstrawberycake.getValue().toString());
            if (qtyIsZero(qty) && StrawberyCake.isSelected()) {
                String checkBoxText = StrawberyCake.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 48;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: "  + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    StrawberyCake.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_StrawberyCakeActionPerformed

    private void ChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nChocolate.getValue().toString());
            if (qtyIsZero(qty) && Chocolate.isSelected()) {
                String checkBoxText = Chocolate.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 20;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    Chocolate.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ChocolateActionPerformed

    private void AlmondChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmondChipActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nAlmondChip.getValue().toString());
            if (qtyIsZero(qty) && AlmondChip.isSelected()) {
                String checkBoxText = AlmondChip.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 15;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    AlmondChip.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AlmondChipActionPerformed

    private void GreenTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenTeaActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nGreenTea.getValue().toString());
            if (qtyIsZero(qty) && GreenTea.isSelected()) {
                String checkBoxText = GreenTea.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 15;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    GreenTea.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GreenTeaActionPerformed

    private void iChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iChocolateActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(niChocolate.getValue().toString());
            if (qtyIsZero(qty) && iChocolate.isSelected()) {
                String checkBoxText = iChocolate.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 25;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    iChocolate.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iChocolateActionPerformed

    private void VanilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanilaActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nVanila.getValue().toString());
            if (qtyIsZero(qty) && Vanila.isSelected()) {
                String checkBoxText = Vanila.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 25;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    Vanila.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VanilaActionPerformed

    private void StrawberyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberyActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nStrawberry.getValue().toString());
            if (qtyIsZero(qty) && Strawbery.isSelected()) {
                String checkBoxText = Strawbery.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 25;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    Strawbery.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_StrawberyActionPerformed

    private void HazelnutChruncyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HazelnutChruncyActionPerformed
        // TODO add your handling code here:
        if (!Total.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Menambah Item, Bersihkan data sebelumnya");
            return;
        }
        boolean allTextFieldsFilled = !nama.getText().isEmpty() && !alamat.getText().isEmpty() && !nohp.getText().isEmpty();
        if (allTextFieldsFilled) {
            int qty = Integer.parseInt(nHazelnutChruncy.getValue().toString());
            if (qtyIsZero(qty) && HazelnutChruncy.isSelected()) {
                String checkBoxText = HazelnutChruncy.getText();
                 if (!isCheckBoxAlreadyAdded(checkBoxText)) {
                    x++;
                    if (x == 1) {
                        MellsanCafe();
                    }
                    double price = qty * 30;
                    total += price;
                    jTextArea.setText(jTextArea.getText() + x + ". " + checkBoxText + "\t" +qty +" :: " + price + "K \n");
                } else {
                    JOptionPane.showMessageDialog(null, "Checkbox already added.");
                    }
                } else {
                    HazelnutChruncy.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all text fields first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_HazelnutChruncyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        boolean[] CakeBox = {
            ChocolateCake.isSelected(),
            RedVelvetCake.isSelected(),
            StrawberyCake.isSelected(),
            TiramisuCake.isSelected()
        };
        boolean[] DonutsBox = {
            Chocolate.isSelected(),
            AlmondChip.isSelected(),
            GreenTea.isSelected()
        };
        boolean[] IceCreamBox = {
            iChocolate.isSelected(),
            Vanila.isSelected(),
            Strawbery.isSelected(),
            HazelnutChruncy.isSelected()
        };
        if (total != 0) {
            if (!Total.isEnabled()) {
        String pil = null;
            jTable1.setValueAt(nama.getText(), no, 0);
            jTable1.setValueAt(alamat.getText(), no, 1);
            jTable1.setValueAt(nohp.getText(), no, 2);
            jTable1.setValueAt(getCheckBoxesTextCake(CakeBox), no, 3);
            jTable1.setValueAt(getCheckBoxTextDonuts(DonutsBox), no, 4);
            jTable1.setValueAt(getCheckBoxesTextIceCream(IceCreamBox), no, 5);
            
            
            jTable1.setValueAt(total + " K", no, 6);
        no = no + 1;
        Insert.setEnabled(false);
        }
        else {
                JOptionPane.showMessageDialog(null, "First, you should calculate the total price");
            } 

        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product");
        }
    }//GEN-LAST:event_InsertActionPerformed
    
    private String getCheckBoxesTextCake(boolean[] checkBoxes) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i]) {
                text.append(getCheckBoxTextCake(i)).append(", ");
            }
        }
        if (text.length() > 0) {
            text.delete(text.length() - 2, text.length());
        }
        return text.toString();
    }
    
    private String getCheckBoxTextCake(int index) {
        switch (index) {
            case 0:
                return "ChocolateCake \n";
            case 1:
                return "RedVelvetCake \n";
            case 2:
                return "StrawberyCake \n";
            case 3:
                return "TiramisuCake \n";
            // tambahkan kasus lainnya untuk DonutsBox dan IceCreamBox jika diperlukan
            default:
                return "";
        }
    }
    
    
    private String getCheckBoxTextDonuts(boolean[] checkBoxes) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i]) {
                text.append(getCheckBoxTextDonuts(i)).append(", ");
            }
        }
        if (text.length() > 0) {
            text.delete(text.length() - 2, text.length());
        }
        return text.toString();
    }
    
    private String getCheckBoxTextDonuts(int index) {
        switch (index) {
            case 0:
                return "D Chocolate \n";
            case 1:
                return "D Almond Chip \n";
            case 2:
                return "D Green Tea \n";
            // tambahkan kasus lainnya untuk DonutsBox dan IceCreamBox jika diperlukan
            default:
                return "";
        }
    }
    
    private String getCheckBoxesTextIceCream(boolean[] checkBoxes) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < checkBoxes.length; i++) {
            if (checkBoxes[i]) {
                text.append(getCheckBoxesTextIceCream(i)).append(", ");
            }
        }
        if (text.length() > 0) {
            text.delete(text.length() - 2, text.length());
        }
        return text.toString();
    }
    
    private String getCheckBoxesTextIceCream(int index) {
        switch (index) {
            case 0:
                return "IC Chocolate \n";
            case 1:
                return "IC Vanila \n";
            case 2:
                return "IC Strawbery \n";
            case 3:
                return "IC Hazelnut Chruncy \n";
            // tambahkan kasus lainnya untuk DonutsBox dan IceCreamBox jika diperlukan
            default:
                return "";
        }
    }
    
    
    
    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        if (total != 0) {
            if (!Total.isEnabled()) {
                try {
                    // TODO add your handling code here:
                    jTextArea.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Menuscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "First, you should calculate the total price");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product");
        }
    }//GEN-LAST:event_cetakActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    public void MellsanCafe() {
        String nma = nama.getText();
        String almt = alamat.getText();
        String hp = nohp.getText();
        
        int purchaseId = 15020 + (int) (Math.random()*80800);

        jTextArea.setText("************Mellsan Cafe************** \n"
                + "Nama           : " + nma + "\n"
                + "Alamat         : " + almt + "\n"
                + "No Telp        : " + hp + "\n"
                + "Purchase Id : " + purchaseId + "\n"
                + "**************************************** \n\n"
                + "Item \t\t" + "Harga" + "\n\n");
    }

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
            java.util.logging.Logger.getLogger(Menuscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AlmondChip;
    private javax.swing.JCheckBox Chocolate;
    private javax.swing.JCheckBox ChocolateCake;
    private javax.swing.JCheckBox GreenTea;
    private javax.swing.JCheckBox HazelnutChruncy;
    private javax.swing.JButton Insert;
    private javax.swing.JCheckBox RedVelvetCake;
    private javax.swing.JCheckBox Strawbery;
    private javax.swing.JCheckBox StrawberyCake;
    private javax.swing.JCheckBox TiramisuCake;
    private javax.swing.JButton Total;
    private javax.swing.JCheckBox Vanila;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cetak;
    private javax.swing.JCheckBox iChocolate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JSpinner nAlmondChip;
    private javax.swing.JSpinner nChocolate;
    private javax.swing.JSpinner nGreenTea;
    private javax.swing.JSpinner nHazelnutChruncy;
    private javax.swing.JSpinner nStrawberry;
    private javax.swing.JSpinner nVanila;
    private javax.swing.JTextField nama;
    private javax.swing.JSpinner ncoklatcake;
    private javax.swing.JSpinner niChocolate;
    private javax.swing.JTextField nohp;
    private javax.swing.JSpinner nredvelvetcake;
    private javax.swing.JSpinner nstrawberycake;
    private javax.swing.JSpinner ntiramisucake;
    // End of variables declaration//GEN-END:variables
}
