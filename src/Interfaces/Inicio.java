package Interfaces;

import java.awt.image.BufferedImage;
import org.apache.log4j.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Inicio extends javax.swing.JFrame {
    
    static Logger logger = Logger.getLogger("file");
    private BufferedImage imagem;
    
    public Inicio() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Erro: " +e);
	}
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        /*String userhome = System.getProperty("user.home");
        try {
            imagem = ImageIO.read(new File(userhome + "\\Desktop\\ProjetoIntegrador\\fpreto2.jpg"));
        } catch (Exception e) {
            logger.error(e);
        }*/
        jDesktopPane = new javax.swing.JDesktopPane(){

            /*public void paintComponent(Graphics g){
                g.drawImage(imagem, 0, 0, this.getWidth(), this.getHeight(), this);
            }*/

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMProd = new javax.swing.JMenu();
        jMRela = new javax.swing.JMenu();
        jMMesa = new javax.swing.JMenu();
        jMSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão & Vendas");

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jMProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Product-icon.png"))); // NOI18N
        jMProd.setText("Produtos");
        jMProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMProdMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMProd);

        jMRela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale-icon.png"))); // NOI18N
        jMRela.setText("Vendas");
        jMRela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMRela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMRela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMRelaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMRela);

        jMMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mimetype-vcalendar-icon.png"))); // NOI18N
        jMMesa.setText("Histórico");
        jMMesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMMesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMMesaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMMesa);

        jMSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit-icon.png"))); // NOI18N
        jMSair.setText("Sair");
        jMSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMProdMouseClicked
        Produto prod = new Produto();
        jDesktopPane.add(prod);
        prod.setSize(750, 700);
        prod.show();
    }//GEN-LAST:event_jMProdMouseClicked

    private void jMRelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMRelaMouseClicked

    }//GEN-LAST:event_jMRelaMouseClicked

    private void jMMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMMesaMouseClicked

    }//GEN-LAST:event_jMMesaMouseClicked

    private void jMSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jMSairMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMMesa;
    private javax.swing.JMenu jMProd;
    private javax.swing.JMenu jMRela;
    private javax.swing.JMenu jMSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
