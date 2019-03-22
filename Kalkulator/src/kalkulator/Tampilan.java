package kalkulator;

public class Tampilan extends javax.swing.JFrame {
    private double num, num2 = 0, ans;
    private int cal;
    private String operation;
    
    public Tampilan() {
        initComponents();
        show.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        bShow = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        akar = new javax.swing.JLabel();
        satuperx = new javax.swing.JLabel();
        persen = new javax.swing.JLabel();
        xkuadrat = new javax.swing.JLabel();
        ce = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        bagi = new javax.swing.JLabel();
        tujuh = new javax.swing.JLabel();
        delapan = new javax.swing.JLabel();
        sembilan = new javax.swing.JLabel();
        kali = new javax.swing.JLabel();
        empat = new javax.swing.JLabel();
        lima = new javax.swing.JLabel();
        enam = new javax.swing.JLabel();
        kurang = new javax.swing.JLabel();
        satu = new javax.swing.JLabel();
        dua = new javax.swing.JLabel();
        tiga = new javax.swing.JLabel();
        tambah = new javax.swing.JLabel();
        kuranglebih = new javax.swing.JLabel();
        nol = new javax.swing.JLabel();
        koma = new javax.swing.JLabel();
        samadengan = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        show.setBackground(new java.awt.Color(0, 0, 0));
        show.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        show.setForeground(new java.awt.Color(0, 0, 0));
        show.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        show.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bShow.setBackground(new java.awt.Color(0, 0, 0));
        bShow.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        bShow.setForeground(new java.awt.Color(0, 0, 0));
        bShow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bShow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bShow, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        akar.setBackground(new java.awt.Color(0, 255, 204));
        akar.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        akar.setForeground(new java.awt.Color(255, 255, 255));
        akar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        akar.setText("√");
        akar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        akar.setPreferredSize(new java.awt.Dimension(90, 50));
        akar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                akarMouseClicked(evt);
            }
        });

        satuperx.setBackground(new java.awt.Color(0, 255, 204));
        satuperx.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        satuperx.setForeground(new java.awt.Color(255, 255, 255));
        satuperx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        satuperx.setText("1/x");
        satuperx.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        satuperx.setPreferredSize(new java.awt.Dimension(90, 50));
        satuperx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satuperxMouseClicked(evt);
            }
        });

        persen.setBackground(new java.awt.Color(0, 255, 204));
        persen.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        persen.setText("%");
        persen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        persen.setPreferredSize(new java.awt.Dimension(90, 50));
        persen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persenMouseClicked(evt);
            }
        });

        xkuadrat.setBackground(new java.awt.Color(0, 255, 204));
        xkuadrat.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        xkuadrat.setForeground(new java.awt.Color(255, 255, 255));
        xkuadrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xkuadrat.setText("x^2");
        xkuadrat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        xkuadrat.setPreferredSize(new java.awt.Dimension(90, 50));
        xkuadrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xkuadratMouseClicked(evt);
            }
        });

        ce.setBackground(new java.awt.Color(255, 51, 51));
        ce.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        ce.setForeground(new java.awt.Color(255, 255, 255));
        ce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ce.setText("CE");
        ce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ce.setPreferredSize(new java.awt.Dimension(90, 50));
        ce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceMouseClicked(evt);
            }
        });

        c.setBackground(new java.awt.Color(255, 51, 51));
        c.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("C");
        c.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c.setPreferredSize(new java.awt.Dimension(90, 50));
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("<x|");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setPreferredSize(new java.awt.Dimension(90, 50));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        bagi.setBackground(new java.awt.Color(255, 255, 0));
        bagi.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        bagi.setForeground(new java.awt.Color(255, 255, 255));
        bagi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bagi.setText("÷");
        bagi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bagi.setPreferredSize(new java.awt.Dimension(90, 50));
        bagi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bagiMouseClicked(evt);
            }
        });

        tujuh.setBackground(new java.awt.Color(255, 51, 255));
        tujuh.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        tujuh.setForeground(new java.awt.Color(255, 255, 255));
        tujuh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tujuh.setText("7");
        tujuh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tujuh.setPreferredSize(new java.awt.Dimension(90, 50));
        tujuh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tujuhMouseClicked(evt);
            }
        });

        delapan.setBackground(new java.awt.Color(255, 51, 255));
        delapan.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        delapan.setForeground(new java.awt.Color(255, 255, 255));
        delapan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delapan.setText("8");
        delapan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delapan.setPreferredSize(new java.awt.Dimension(90, 50));
        delapan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delapanMouseClicked(evt);
            }
        });

        sembilan.setBackground(new java.awt.Color(255, 51, 255));
        sembilan.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        sembilan.setForeground(new java.awt.Color(255, 255, 255));
        sembilan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sembilan.setText("9");
        sembilan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sembilan.setPreferredSize(new java.awt.Dimension(90, 50));
        sembilan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sembilanMouseClicked(evt);
            }
        });

        kali.setBackground(new java.awt.Color(255, 255, 0));
        kali.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        kali.setForeground(new java.awt.Color(255, 255, 255));
        kali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kali.setText("×");
        kali.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kali.setPreferredSize(new java.awt.Dimension(90, 50));
        kali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaliMouseClicked(evt);
            }
        });

        empat.setBackground(new java.awt.Color(255, 51, 255));
        empat.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        empat.setForeground(new java.awt.Color(255, 255, 255));
        empat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empat.setText("4");
        empat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empat.setPreferredSize(new java.awt.Dimension(90, 50));
        empat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empatMouseClicked(evt);
            }
        });

        lima.setBackground(new java.awt.Color(255, 51, 255));
        lima.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lima.setForeground(new java.awt.Color(255, 255, 255));
        lima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lima.setText("5");
        lima.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lima.setPreferredSize(new java.awt.Dimension(90, 50));
        lima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limaMouseClicked(evt);
            }
        });

        enam.setBackground(new java.awt.Color(255, 51, 255));
        enam.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        enam.setForeground(new java.awt.Color(255, 255, 255));
        enam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enam.setText("6");
        enam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enam.setPreferredSize(new java.awt.Dimension(90, 50));
        enam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enamMouseClicked(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(255, 255, 0));
        kurang.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        kurang.setForeground(new java.awt.Color(255, 255, 255));
        kurang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kurang.setText("-");
        kurang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kurang.setPreferredSize(new java.awt.Dimension(90, 50));
        kurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kurangMouseClicked(evt);
            }
        });

        satu.setBackground(new java.awt.Color(255, 51, 255));
        satu.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        satu.setForeground(new java.awt.Color(255, 255, 255));
        satu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        satu.setText("1");
        satu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        satu.setPreferredSize(new java.awt.Dimension(90, 50));
        satu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satuMouseClicked(evt);
            }
        });

        dua.setBackground(new java.awt.Color(255, 51, 255));
        dua.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        dua.setForeground(new java.awt.Color(255, 255, 255));
        dua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dua.setText("2");
        dua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dua.setPreferredSize(new java.awt.Dimension(90, 50));
        dua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duaMouseClicked(evt);
            }
        });

        tiga.setBackground(new java.awt.Color(255, 51, 255));
        tiga.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        tiga.setForeground(new java.awt.Color(255, 255, 255));
        tiga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiga.setText("3");
        tiga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tiga.setPreferredSize(new java.awt.Dimension(90, 50));
        tiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tigaMouseClicked(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(255, 255, 0));
        tambah.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambah.setText("+");
        tambah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tambah.setPreferredSize(new java.awt.Dimension(90, 50));
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
        });

        kuranglebih.setBackground(new java.awt.Color(255, 255, 0));
        kuranglebih.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        kuranglebih.setForeground(new java.awt.Color(255, 255, 255));
        kuranglebih.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kuranglebih.setText("±");
        kuranglebih.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kuranglebih.setPreferredSize(new java.awt.Dimension(90, 50));
        kuranglebih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kuranglebihMouseClicked(evt);
            }
        });

        nol.setBackground(new java.awt.Color(255, 51, 255));
        nol.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        nol.setForeground(new java.awt.Color(255, 255, 255));
        nol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nol.setText("0");
        nol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nol.setPreferredSize(new java.awt.Dimension(90, 50));
        nol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nolMouseClicked(evt);
            }
        });

        koma.setBackground(new java.awt.Color(255, 255, 0));
        koma.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        koma.setForeground(new java.awt.Color(255, 255, 255));
        koma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        koma.setText(".");
        koma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        koma.setPreferredSize(new java.awt.Dimension(90, 50));
        koma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                komaMouseClicked(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(0, 255, 0));
        samadengan.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        samadengan.setForeground(new java.awt.Color(255, 255, 255));
        samadengan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        samadengan.setText("=");
        samadengan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        samadengan.setPreferredSize(new java.awt.Dimension(90, 50));
        samadengan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samadenganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xkuadrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(satuperx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(kuranglebih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xkuadrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuperx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuranglebih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        exit.setText("Exit");
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nolMouseClicked
        show.setText(show.getText()+"0");
    }//GEN-LAST:event_nolMouseClicked

    private void satuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satuMouseClicked
        show.setText(show.getText()+"1.0");
    }//GEN-LAST:event_satuMouseClicked

    private void duaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duaMouseClicked
        show.setText(show.getText()+"2.0");
    }//GEN-LAST:event_duaMouseClicked

    private void tigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tigaMouseClicked
        show.setText(show.getText()+"3.0");
    }//GEN-LAST:event_tigaMouseClicked

    private void empatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empatMouseClicked
        show.setText(show.getText()+"4.0");
    }//GEN-LAST:event_empatMouseClicked

    private void limaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limaMouseClicked
        show.setText(show.getText()+"5.0");
    }//GEN-LAST:event_limaMouseClicked

    private void enamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enamMouseClicked
        show.setText(show.getText()+"6.0");
    }//GEN-LAST:event_enamMouseClicked

    private void tujuhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tujuhMouseClicked
        show.setText(show.getText()+"7.0");
    }//GEN-LAST:event_tujuhMouseClicked

    private void delapanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delapanMouseClicked
        show.setText(show.getText()+"8.0");
    }//GEN-LAST:event_delapanMouseClicked

    private void sembilanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sembilanMouseClicked
        show.setText(show.getText()+"9.0");
    }//GEN-LAST:event_sembilanMouseClicked

    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
        num = Double.parseDouble(show.getText());
        cal = 1;
        show.setText("");
        bShow.setText(num + "+");
        operation = "+";
    }//GEN-LAST:event_tambahMouseClicked

    private void kurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseClicked
        num = Double.parseDouble(show.getText());
        cal = 2;
        show.setText("");
        bShow.setText(num + "-");
        operation = "-";
    }//GEN-LAST:event_kurangMouseClicked

    private void kaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseClicked
        num = Double.parseDouble(show.getText());
        cal = 3;
        show.setText("");
        bShow.setText(num + "×");
        operation = "*";
    }//GEN-LAST:event_kaliMouseClicked

    private void bagiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMouseClicked
        num = Double.parseDouble(show.getText());
        cal = 4;
        show.setText("");
        bShow.setText(num + "÷");
        operation = "/";
    }//GEN-LAST:event_bagiMouseClicked

    private void samadenganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMouseClicked
        
        aritmatik();
        bShow.setText("");
        operation = "=";
    }//GEN-LAST:event_samadenganMouseClicked

    private void komaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komaMouseClicked
        if(!show.getText().contains(".")){
            show.setText(show.getText() + koma.getText());
        }
//        show.setText(show.getText()+",");
    }//GEN-LAST:event_komaMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        show.setText("");
    }//GEN-LAST:event_cMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int length = show.getText().length();
        int number = show.getText().length()-1;
        String hDelete;
        if(length > 0){
            StringBuilder delete = new StringBuilder(show.getText());
            delete.deleteCharAt(number);
            hDelete = delete.toString();
            show.setText(hDelete);
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void kuranglebihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kuranglebihMouseClicked
        double ops = Double.parseDouble(String.valueOf(show.getText()));
        ops = ops * (-1);
        show.setText(String.valueOf(ops));
    }//GEN-LAST:event_kuranglebihMouseClicked

    private void akarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akarMouseClicked
        double ops = Double.parseDouble(String.valueOf(show.getText()));
        ops = Math.sqrt(ops);
        show.setText(String.valueOf(ops));
    }//GEN-LAST:event_akarMouseClicked

    private void xkuadratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xkuadratMouseClicked
        double ops = Double.parseDouble(String.valueOf(show.getText()));
        ops = ops * ops;
        show.setText(String.valueOf(ops));
    }//GEN-LAST:event_xkuadratMouseClicked

    private void satuperxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satuperxMouseClicked
        double ops = Double.parseDouble(String.valueOf(show.getText()));
        ops = 1 / ops;
        show.setText(String.valueOf(ops));
    }//GEN-LAST:event_satuperxMouseClicked

    private void persenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_persenMouseClicked
        double ops = Double.parseDouble(String.valueOf(show.getText()));
        ops = ops / 100;
        show.setText(String.valueOf(ops));
    }//GEN-LAST:event_persenMouseClicked

    private void ceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceMouseClicked
        show.setText("");
    }//GEN-LAST:event_ceMouseClicked
    
    private void aritmatik(){
        switch(cal){
            case 1:
                if(operation.equals("+")){
                    num2 = Double.parseDouble(show.getText());
                    ans = num + num2;
                    show.setText(Double.toString(ans));
                }
                
                if(operation.equals("=")){
                    ans = ans + num2;
                    show.setText(Double.toString(ans));
                }
                break;
            case 2:
                if(operation.equals("-")){
                    num2 = Double.parseDouble(show.getText());
                    ans = num - num2;
                    show.setText(Double.toString(ans));
                }
                
                if(operation.equals("=")){
                    ans = ans - num2;
                    show.setText(Double.toString(ans));
                }
                break;
            case 3:
                if(operation.equals("*")){
                    num2 = Double.parseDouble(show.getText());
                    ans = num * num2;
                    show.setText(Double.toString(ans));
                }
                
                if(operation.equals("=")){
                    ans = ans * num2;
                    show.setText(Double.toString(ans));
                }
                break;
            case 4:
                if(operation.equals("/")){
                    num2 = Double.parseDouble(show.getText());
                    ans = num / num2;
                    show.setText(Double.toString(ans));
                }
                
                if(operation.equals("=")){
                    ans = ans / num2;
                    show.setText(Double.toString(ans));
                }
                break;
        }
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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel akar;
    private javax.swing.JLabel bShow;
    private javax.swing.JLabel bagi;
    private javax.swing.JLabel c;
    private javax.swing.JLabel ce;
    private javax.swing.JLabel delapan;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel dua;
    private javax.swing.JLabel empat;
    private javax.swing.JLabel enam;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kali;
    private javax.swing.JLabel koma;
    private javax.swing.JLabel kurang;
    private javax.swing.JLabel kuranglebih;
    private javax.swing.JLabel lima;
    private javax.swing.JLabel nol;
    private javax.swing.JLabel persen;
    private javax.swing.JLabel samadengan;
    private javax.swing.JLabel satu;
    private javax.swing.JLabel satuperx;
    private javax.swing.JLabel sembilan;
    private javax.swing.JLabel show;
    private javax.swing.JLabel tambah;
    private javax.swing.JLabel tiga;
    private javax.swing.JLabel tujuh;
    private javax.swing.JLabel xkuadrat;
    // End of variables declaration//GEN-END:variables
}
