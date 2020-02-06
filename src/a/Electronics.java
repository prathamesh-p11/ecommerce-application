package a;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathamesh
 */
public class Electronics extends javax.swing.JFrame {

    /**
     * Creates new form Electronics
     */
    public Electronics() 
    {
        initComponents();
                        this.setLocationRelativeTo(null);

                        
                        
                        
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regnerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jL_Close1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jL_Minimizze1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Buy_asus = new javax.swing.JButton();
        Buy_HP = new javax.swing.JButton();
        Buy_lenovo = new javax.swing.JButton();
        Buy_OnePlus = new javax.swing.JButton();
        Buy_GooglePix = new javax.swing.JButton();
        Buy_razer = new javax.swing.JButton();
        GooglePix_price = new javax.swing.JLabel();
        jL_Razer = new javax.swing.JLabel();
        jL_Lenovo = new javax.swing.JLabel();
        jL_OnePlus = new javax.swing.JLabel();
        jL_GooglePix = new javax.swing.JLabel();
        jL_HP = new javax.swing.JLabel();
        p_id8 = new javax.swing.JLabel();
        p_id9 = new javax.swing.JLabel();
        p_id10 = new javax.swing.JLabel();
        p_id11 = new javax.swing.JLabel();
        p_id1 = new javax.swing.JLabel();
        p_id2 = new javax.swing.JLabel();
        p_id3 = new javax.swing.JLabel();
        p_id13 = new javax.swing.JLabel();
        p_id14 = new javax.swing.JLabel();
        p_id4 = new javax.swing.JLabel();
        p_id15 = new javax.swing.JLabel();
        p_id12 = new javax.swing.JLabel();
        p_id16 = new javax.swing.JLabel();
        p_id17 = new javax.swing.JLabel();
        jL_Asus = new javax.swing.JLabel();
        p_id21 = new javax.swing.JLabel();
        p_id18 = new javax.swing.JLabel();
        p_id5 = new javax.swing.JLabel();
        p_id6 = new javax.swing.JLabel();
        p_id19 = new javax.swing.JLabel();
        p_id7 = new javax.swing.JLabel();
        p_id20 = new javax.swing.JLabel();
        p_id22 = new javax.swing.JLabel();
        p_id23 = new javax.swing.JLabel();
        p_id24 = new javax.swing.JLabel();
        Asus_Price = new javax.swing.JLabel();
        Lenovo_price = new javax.swing.JLabel();
        OnePlus_Price = new javax.swing.JLabel();
        Hp_price = new javax.swing.JLabel();
        Razer_price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jL_Close1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jL_Close1.setForeground(new java.awt.Color(255, 255, 255));
        jL_Close1.setText("X");
        jL_Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_Close1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KART");

        jL_Minimizze1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jL_Minimizze1.setForeground(new java.awt.Color(255, 255, 255));
        jL_Minimizze1.setText("-");
        jL_Minimizze1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_Minimizze1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_Minimizze1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 931, Short.MAX_VALUE)
                .addComponent(jL_Minimizze1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_Close1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Close1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Minimizze1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\asus.jpg")); // NOI18N
        jLabel8.setText("ABC");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\google-pixelXL.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\HP.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\lenovo.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\oneplus-5.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\prathamesh\\Documents\\NetBeansProjects\\LoginAndReg\\images\\Elec\\razor.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        Buy_asus.setBackground(new java.awt.Color(0, 153, 0));
        Buy_asus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_asus.setText("Buy Now");
        Buy_asus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_asus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_asusMouseClicked(evt);
            }
        });
        Buy_asus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_asusActionPerformed(evt);
            }
        });

        Buy_HP.setBackground(new java.awt.Color(0, 153, 0));
        Buy_HP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_HP.setText("Buy Now");
        Buy_HP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_HP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_HPMouseClicked(evt);
            }
        });

        Buy_lenovo.setBackground(new java.awt.Color(0, 153, 0));
        Buy_lenovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_lenovo.setText("Buy Now");
        Buy_lenovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_lenovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_lenovoMouseClicked(evt);
            }
        });
        Buy_lenovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_lenovoActionPerformed(evt);
            }
        });

        Buy_OnePlus.setBackground(new java.awt.Color(0, 153, 0));
        Buy_OnePlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_OnePlus.setText("Buy Now");
        Buy_OnePlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_OnePlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_OnePlusMouseClicked(evt);
            }
        });

        Buy_GooglePix.setBackground(new java.awt.Color(0, 153, 0));
        Buy_GooglePix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_GooglePix.setText("Buy Now");
        Buy_GooglePix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_GooglePix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_GooglePixMouseClicked(evt);
            }
        });

        Buy_razer.setBackground(new java.awt.Color(0, 153, 0));
        Buy_razer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy_razer.setText("Buy Now");
        Buy_razer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buy_razer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_razerMouseClicked(evt);
            }
        });
        Buy_razer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_razerActionPerformed(evt);
            }
        });

        GooglePix_price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        GooglePix_price.setForeground(new java.awt.Color(204, 204, 204));
        GooglePix_price.setText("44,000");
        GooglePix_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GooglePix_priceMouseClicked(evt);
            }
        });

        jL_Razer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_Razer.setForeground(new java.awt.Color(204, 204, 204));
        jL_Razer.setText("Razer Blade Stealth");
        jL_Razer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_RazerMouseClicked(evt);
            }
        });

        jL_Lenovo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_Lenovo.setForeground(new java.awt.Color(204, 204, 204));
        jL_Lenovo.setText("Lenovo Y700 Gaming Laptop");
        jL_Lenovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_LenovoMouseClicked(evt);
            }
        });

        jL_OnePlus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_OnePlus.setForeground(new java.awt.Color(204, 204, 204));
        jL_OnePlus.setText("One Plus5");
        jL_OnePlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_OnePlusMouseClicked(evt);
            }
        });

        jL_GooglePix.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_GooglePix.setForeground(new java.awt.Color(204, 204, 204));
        jL_GooglePix.setText("Google Pixel XL (Quite Black, 32 GB)  ");
        jL_GooglePix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_GooglePixMouseClicked(evt);
            }
        });

        jL_HP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_HP.setForeground(new java.awt.Color(204, 204, 204));
        jL_HP.setText("HP Pavillion 15");
        jL_HP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_HPMouseClicked(evt);
            }
        });

        p_id8.setForeground(new java.awt.Color(204, 204, 204));
        p_id8.setText("Full HD Optic AMOLED (5.5')Capacitive Touchscreen ");

        p_id9.setForeground(new java.awt.Color(204, 204, 204));
        p_id9.setText("Intel HM175  i7-7500U");

        p_id10.setForeground(new java.awt.Color(204, 204, 204));
        p_id10.setText("    15.6 inch UHD Display,GTX 960M 4GB");

        p_id11.setForeground(new java.awt.Color(204, 204, 204));
        p_id11.setText("4 GB RAM | 32 GB ROM | 3450 mAh Battery ");

        p_id1.setForeground(new java.awt.Color(204, 204, 204));
        p_id1.setText("Intel Core i5 Processor (6th Gen)  ");

        p_id2.setForeground(new java.awt.Color(204, 204, 204));
        p_id2.setText("14 inch 16:9, 1920x1080 pixel 157 PPI");

        p_id3.setForeground(new java.awt.Color(204, 204, 204));
        p_id3.setText("4 GB DDR4 RAM 64 bit Windows 10");

        p_id13.setForeground(new java.awt.Color(204, 204, 204));
        p_id13.setText("Qualcomm Snapdragon 821 64-bit Processor ");

        p_id14.setForeground(new java.awt.Color(204, 204, 204));
        p_id14.setText("12.3MP Rear Camera | 8MP Front Camera ");

        p_id4.setForeground(new java.awt.Color(204, 204, 204));
        p_id4.setText("1 TB HDD 15.6 inch Display ");

        p_id15.setForeground(new java.awt.Color(204, 204, 204));
        p_id15.setText("5.5 inch Quad HD Display ");

        p_id12.setForeground(new java.awt.Color(204, 204, 204));
        p_id12.setText("    Intel Core i7 Processor (6th Gen) ");

        p_id16.setForeground(new java.awt.Color(204, 204, 204));
        p_id16.setText(" 16 GB DDR4 RAM ");

        p_id17.setForeground(new java.awt.Color(204, 204, 204));
        p_id17.setText("    1 TB HDD/128 GB SSD");

        jL_Asus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jL_Asus.setForeground(new java.awt.Color(204, 204, 204));
        jL_Asus.setText("Asus UX305");
        jL_Asus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_AsusMouseClicked(evt);
            }
        });

        p_id21.setForeground(new java.awt.Color(204, 204, 204));
        p_id21.setText("1 TB HDD/Windows 10 Home");

        p_id18.setForeground(new java.awt.Color(204, 204, 204));
        p_id18.setText("Pixel Density (PPI) 401 ");

        p_id5.setForeground(new java.awt.Color(204, 204, 204));
        p_id5.setText("4 GB DDR4 RAM,GT 940MX 2GB");

        p_id6.setForeground(new java.awt.Color(204, 204, 204));
        p_id6.setText("15.6 inch Display ");

        p_id19.setForeground(new java.awt.Color(204, 204, 204));
        p_id19.setText("HP 15 Core i5 7th Gen");

        p_id7.setForeground(new java.awt.Color(204, 204, 204));
        p_id7.setText("Corning Gorilla Glass  ");

        p_id20.setForeground(new java.awt.Color(204, 204, 204));
        p_id20.setText("screen resolution (in pixels) 1080 x 2080 ");

        p_id22.setForeground(new java.awt.Color(204, 204, 204));
        p_id22.setText("Samsung SSD, 256 GB  ");

        p_id23.setForeground(new java.awt.Color(204, 204, 204));
        p_id23.setText("Memory 16278 MB  , DDR4 Dual-Channel ");

        p_id24.setForeground(new java.awt.Color(204, 204, 204));
        p_id24.setText("4 GB DDR4 RAM,GT 940MX 2GB");

        Asus_Price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Asus_Price.setForeground(new java.awt.Color(204, 204, 204));
        Asus_Price.setText("38,400");
        Asus_Price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Asus_PriceMouseClicked(evt);
            }
        });

        Lenovo_price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Lenovo_price.setForeground(new java.awt.Color(204, 204, 204));
        Lenovo_price.setText("1,08,000");
        Lenovo_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lenovo_priceMouseClicked(evt);
            }
        });

        OnePlus_Price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OnePlus_Price.setForeground(new java.awt.Color(204, 204, 204));
        OnePlus_Price.setText("37,000");
        OnePlus_Price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnePlus_PriceMouseClicked(evt);
            }
        });

        Hp_price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Hp_price.setForeground(new java.awt.Color(204, 204, 204));
        Hp_price.setText("53,800");
        Hp_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hp_priceMouseClicked(evt);
            }
        });

        Razer_price.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Razer_price.setForeground(new java.awt.Color(204, 204, 204));
        Razer_price.setText("1,21,000");
        Razer_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Razer_priceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Buy_HP))
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_id21)
                            .addComponent(p_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_id6)
                            .addComponent(p_id19)
                            .addComponent(Hp_price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Buy_OnePlus)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Buy_asus))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(p_id1)
                                                    .addComponent(p_id3)
                                                    .addComponent(p_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id24, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jL_OnePlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(OnePlus_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(314, 354, Short.MAX_VALUE))
                                            .addComponent(p_id8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(p_id18)
                                                    .addComponent(p_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id20))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jL_Asus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Asus_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(350, 350, 350)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jL_GooglePix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GooglePix_price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Buy_GooglePix)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jL_Lenovo)
                                        .addGap(35, 35, 35)
                                        .addComponent(Lenovo_price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jL_Razer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Buy_razer)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Buy_lenovo))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(p_id11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id15, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id12, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id17, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id22, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p_id9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(p_id10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(Razer_price, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(p_id16, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GooglePix_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_GooglePix, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Asus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asus_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buy_asus))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p_id11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buy_GooglePix)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jL_HP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hp_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lenovo_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jL_Lenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p_id12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(p_id16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buy_lenovo))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(p_id19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p_id6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buy_HP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_OnePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Razer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OnePlus_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Razer_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(p_id8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p_id20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buy_OnePlus))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buy_razer))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(p_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_id22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_id23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.getAccessibleContext().setAccessibleName("p_id");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_Close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_Close1MouseClicked
        this.dispose();
        AfterLogin af=new AfterLogin(a.LoginForm.pass_uname);
        af.setVisible(true);
        
        
       //AfterLogin cons=new AfterLogin(a.LoginForm.n);
        //cons.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jL_Close1MouseClicked

    private void jL_Minimizze1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_Minimizze1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jL_Minimizze1MouseClicked

    private void Buy_asusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_asusMouseClicked
        // TODO add your handling code here:

        String pass_pname=jL_Asus.getText();
        String pass_pprice=GooglePix_price.getText();
        
        Purchase p=new Purchase(pass_pname,pass_pprice);
      p.setVisible(true);
      p.pack();
      p.setLocationRelativeTo(null);   
    }//GEN-LAST:event_Buy_asusMouseClicked

    private void Buy_HPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_HPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_HPMouseClicked
                
    private void Buy_lenovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_lenovoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_lenovoMouseClicked

    private void Buy_OnePlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_OnePlusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_OnePlusMouseClicked

    private void Buy_GooglePixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_GooglePixMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_GooglePixMouseClicked

    private void Buy_razerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_razerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_razerMouseClicked

    private void Buy_asusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_asusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_asusActionPerformed

    private void GooglePix_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GooglePix_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GooglePix_priceMouseClicked

    private void jL_RazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_RazerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_RazerMouseClicked

    private void jL_LenovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_LenovoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_LenovoMouseClicked

    private void jL_OnePlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_OnePlusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_OnePlusMouseClicked

    private void jL_GooglePixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_GooglePixMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_GooglePixMouseClicked

    private void jL_HPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_HPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_HPMouseClicked

    private void Buy_lenovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_lenovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_lenovoActionPerformed

    private void Buy_razerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy_razerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buy_razerActionPerformed

    private void jL_AsusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_AsusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_AsusMouseClicked

    private void Asus_PriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asus_PriceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Asus_PriceMouseClicked

    private void Lenovo_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lenovo_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Lenovo_priceMouseClicked

    private void OnePlus_PriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnePlus_PriceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OnePlus_PriceMouseClicked

    private void Hp_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hp_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hp_priceMouseClicked

    private void Razer_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Razer_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Razer_priceMouseClicked

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
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new Electronics().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asus_Price;
    private javax.swing.JButton Buy_GooglePix;
    private javax.swing.JButton Buy_HP;
    private javax.swing.JButton Buy_OnePlus;
    private javax.swing.JButton Buy_asus;
    private javax.swing.JButton Buy_lenovo;
    private javax.swing.JButton Buy_razer;
    private javax.swing.JLabel GooglePix_price;
    private javax.swing.JLabel Hp_price;
    private javax.swing.JLabel Lenovo_price;
    private javax.swing.JLabel OnePlus_Price;
    private javax.swing.JLabel Razer_price;
    private javax.swing.JLabel jL_Asus;
    private javax.swing.JLabel jL_Close1;
    private javax.swing.JLabel jL_GooglePix;
    private javax.swing.JLabel jL_HP;
    private javax.swing.JLabel jL_Lenovo;
    private javax.swing.JLabel jL_Minimizze1;
    private javax.swing.JLabel jL_OnePlus;
    private javax.swing.JLabel jL_Razer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel p_id1;
    private javax.swing.JLabel p_id10;
    private javax.swing.JLabel p_id11;
    private javax.swing.JLabel p_id12;
    private javax.swing.JLabel p_id13;
    private javax.swing.JLabel p_id14;
    private javax.swing.JLabel p_id15;
    private javax.swing.JLabel p_id16;
    private javax.swing.JLabel p_id17;
    private javax.swing.JLabel p_id18;
    private javax.swing.JLabel p_id19;
    private javax.swing.JLabel p_id2;
    private javax.swing.JLabel p_id20;
    private javax.swing.JLabel p_id21;
    private javax.swing.JLabel p_id22;
    private javax.swing.JLabel p_id23;
    private javax.swing.JLabel p_id24;
    private javax.swing.JLabel p_id3;
    private javax.swing.JLabel p_id4;
    private javax.swing.JLabel p_id5;
    private javax.swing.JLabel p_id6;
    private javax.swing.JLabel p_id7;
    private javax.swing.JLabel p_id8;
    private javax.swing.JLabel p_id9;
    // End of variables declaration//GEN-END:variables
}
