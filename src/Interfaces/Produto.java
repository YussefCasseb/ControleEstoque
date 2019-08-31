package Interfaces;

import DAO.ProdutoDAO;
import Model.ProdutoTableModel;
import Objetos.OProduto;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.log4j.Logger;

public class Produto extends javax.swing.JInternalFrame {
    
    ProdutoTableModel modelo = new ProdutoTableModel();
    static Logger logger = Logger.getLogger("file");
    String path = "";

    public Produto() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	}catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Erro: " +e);
	}
        
        initComponents();
        
        jTNome.requestFocus();
        
        modelo.RecarregaTabela();
        jTProdutos.setModel(modelo);
        
        jLNome.setVisible(false);
        jLImg.setVisible(false);
        jLQtde.setVisible(false);
        jLFornec.setVisible(false);
        jLValor.setVisible(false);
        jLNomeB.setVisible(false);
        
    }
    
    public void LimpaCampos(){
        jTNome.setText("");
        jBImagem.setText("Selecione uma Imagem");
        jTQtde.setText("");
        jTFornec.setText("");
        jTValor.setText("");
        jTBusca.setText("");
        jBPrint.setIcon(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTNome = new javax.swing.JTextField();
        jTValor = new javax.swing.JTextField();
        jBCad = new javax.swing.JButton();
        jBAlt = new javax.swing.JButton();
        jBExc = new javax.swing.JButton();
        jTBusca = new javax.swing.JTextField();
        jBBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jBListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jLNomeB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBImagem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTQtde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFornec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLImg = new javax.swing.JLabel();
        jLFornec = new javax.swing.JLabel();
        jLQtde = new javax.swing.JLabel();
        jBPrint = new javax.swing.JButton();

        setClosable(true);
        setTitle("Produtos");
        setPreferredSize(new java.awt.Dimension(500, 500));

        jTNome.setToolTipText("");

        jBCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-icon.png"))); // NOI18N
        jBCad.setText("Cadastrar");
        jBCad.setContentAreaFilled(false);
        jBCad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadActionPerformed(evt);
            }
        });

        jBAlt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit-icon.png"))); // NOI18N
        jBAlt.setText("Alterar");
        jBAlt.setContentAreaFilled(false);
        jBAlt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAlt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltActionPerformed(evt);
            }
        });

        jBExc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete-icon.png"))); // NOI18N
        jBExc.setText("Excluir");
        jBExc.setContentAreaFilled(false);
        jBExc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcActionPerformed(evt);
            }
        });

        jBBusca.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Search-icon.png"))); // NOI18N
        jBBusca.setText("Buscar");
        jBBusca.setContentAreaFilled(false);
        jBBusca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBBusca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });

        jTProdutos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jBListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Bulleted-List-icon.png"))); // NOI18N
        jBListar.setText("Listar Tudo");
        jBListar.setContentAreaFilled(false);
        jBListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Produto:");

        jLabel3.setText("Buscar Produto:");

        jLNome.setForeground(new java.awt.Color(255, 0, 0));
        jLNome.setText("Nome Obrigatório");

        jLValor.setForeground(new java.awt.Color(255, 0, 0));
        jLValor.setText("Valor Obrigatório");

        jLNomeB.setForeground(new java.awt.Color(255, 0, 0));
        jLNomeB.setText("Nome Obrigatório");

        jLabel4.setText("Imagem:");

        jBImagem.setText("Selecione uma Imagem");
        jBImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImagemActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade:");

        jLabel6.setText("Fornecedor:");

        jLabel7.setText("Valor:");

        jLImg.setForeground(new java.awt.Color(255, 0, 0));
        jLImg.setText("Imagem Obrigatória");

        jLFornec.setForeground(new java.awt.Color(255, 0, 0));
        jLFornec.setText("Fornecedor Obrigatório");

        jLQtde.setForeground(new java.awt.Color(255, 0, 0));
        jLQtde.setText("Quantidade Obrigatória");

        jBPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBPrint.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBListar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLNomeB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBImagem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLImg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLNome))
                                    .addComponent(jBPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTQtde)
                                            .addComponent(jTFornec, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLValor)
                                                    .addComponent(jLFornec, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLQtde))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jBCad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBAlt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBExc)))))
                        .addContainerGap())))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQtde))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFornec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFornec))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLValor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCad)
                            .addComponent(jBAlt)
                            .addComponent(jBExc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jBImagem)
                            .addComponent(jLImg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLNomeB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBusca)
                    .addComponent(jBListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadActionPerformed
        OProduto p = new OProduto();
        ProdutoDAO pdao = new ProdutoDAO();
        if(jTNome.getText().isEmpty()){
            jLNome.setVisible(true);
            jLImg.setVisible(false);
            jLQtde.setVisible(false);
            jLFornec.setVisible(false);
            jLValor.setVisible(false);
            jTNome.requestFocus();
        }else if(jBImagem.getText().equals("Selecione uma Imagem")){
            jLImg.setVisible(true);
            jLNome.setVisible(false);
            jLQtde.setVisible(false);
            jLFornec.setVisible(false);
            jLValor.setVisible(false);
        }else if(jTQtde.getText().isEmpty()){
            jLQtde.setVisible(true);
            jLNome.setVisible(false);
            jLImg.setVisible(false);
            jLFornec.setVisible(false);
            jLValor.setVisible(false);
            jTQtde.requestFocus();
        }else if(jTFornec.getText().isEmpty()){
            jLFornec.setVisible(true);
            jLNome.setVisible(false);
            jLImg.setVisible(false);
            jLQtde.setVisible(false);
            jLValor.setVisible(false);
            jTFornec.requestFocus();
        }else if(jTValor.getText().isEmpty()){
            jLValor.setVisible(true);
            jLNome.setVisible(false);
            jLImg.setVisible(false);
            jLQtde.setVisible(false);
            jLFornec.setVisible(false);
            jTValor.requestFocus();
        }else{
            try{
               byte[] byteArray = null;
                try {
                    BufferedImage imagem = ImageIO.read(new File(path));
		    ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
                    ImageIO.write((BufferedImage)imagem, "jpg", bytesImg);//seta a imagem para bytesImg
                    bytesImg.flush();//limpa a variável
                    byteArray = bytesImg.toByteArray();//Converte ByteArrayOutputStream para byte[] 
                    bytesImg.close();//fecha a conversão
                } catch (IOException ex) {
                    logger.error(ex);
                }
                p.setNome(jTNome.getText());
                p.setImg(byteArray);
                p.setQtde(Integer.parseInt(jTQtde.getText()));
                p.setFornecedor(jTFornec.getText());
                p.setValor(Double.parseDouble(jTValor.getText().replace(",", ".")));
                pdao.Create(p);
                modelo.RecarregaTabela();
                LimpaCampos();
                jLValor.setVisible(false);
                jLNome.setVisible(false);
                jLImg.setVisible(false);
                jLQtde.setVisible(false);
                jLFornec.setVisible(false);
                jLValor.setVisible(false);
                if(ProdutoDAO.alert.equals("Falha ao Inserir!")){
                    JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Atenção",JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Sucesso",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException e){
                jLValor.setVisible(true);
                jLNome.setVisible(false);
                jLImg.setVisible(false);
                jLQtde.setVisible(false);
                jLFornec.setVisible(false);
            }
        }
    }//GEN-LAST:event_jBCadActionPerformed

    private void jBAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltActionPerformed
        ProdutoDAO pdao = new ProdutoDAO();
        OProduto p = new OProduto();
        
        if(jTProdutos.getSelectedRow() != -1){
            if(jTNome.getText().isEmpty()){
                jLNome.setVisible(true);
                jLImg.setVisible(false);
                jLQtde.setVisible(false);
                jLFornec.setVisible(false);
                jLValor.setVisible(false);
                jTNome.requestFocus();
            }else if(jBImagem.getText().equals("Selecione uma Imagem")){
                jLImg.setVisible(true);
                jLNome.setVisible(false);
                jLQtde.setVisible(false);
                jLFornec.setVisible(false);
                jLValor.setVisible(false);
            }else if(jTQtde.getText().isEmpty()){
                jLQtde.setVisible(true);
                jLNome.setVisible(false);
                jLImg.setVisible(false);
                jLFornec.setVisible(false);
                jLValor.setVisible(false);
                jTQtde.requestFocus();
            }else if(jTFornec.getText().isEmpty()){
                jLFornec.setVisible(true);
                jLNome.setVisible(false);
                jLImg.setVisible(false);
                jLQtde.setVisible(false);
                jLValor.setVisible(false);
                jTFornec.requestFocus();
            }else if(jTValor.getText().isEmpty()){
                jLValor.setVisible(true);
                jLNome.setVisible(false);
                jLImg.setVisible(false);
                jLQtde.setVisible(false);
                jLFornec.setVisible(false);
                jTValor.requestFocus();
            }else{
                try{
                    byte[] byteArray = null;
                     try {
                        BufferedImage imagem = ImageIO.read(new File(path));
                        ByteArrayOutputStream bytesImg = new ByteArrayOutputStream();
                        ImageIO.write((BufferedImage)imagem, "jpg", bytesImg);//seta a imagem para bytesImg
                        bytesImg.flush();//limpa a variável
                        byteArray = bytesImg.toByteArray();//Converte ByteArrayOutputStream para byte[] 
                        bytesImg.close();//fecha a conversão
                     } catch (IOException ex) {
                        logger.error(ex);
                     }
                    modelo.setValueAt(jTNome.getText(), jTProdutos.getSelectedRow(), 0);
                    p.setImg(byteArray);
                    modelo.setValueAt(jTQtde.getText(), jTProdutos.getSelectedRow(), 2);
                    modelo.setValueAt(jTFornec.getText(), jTProdutos.getSelectedRow(), 3);
                    modelo.setValueAt(jTValor.getText().replace(",", "."), jTProdutos.getSelectedRow(), 4);
                    
                    p = modelo.PegaDadosLinha(jTProdutos.getSelectedRow());
                    pdao.Update(p);
                    modelo.RecarregaTabela();
                    LimpaCampos();
                    jLNome.setVisible(false);
                    jLImg.setVisible(false);
                    jLQtde.setVisible(false);
                    jLFornec.setVisible(false);
                    jLValor.setVisible(false);
                    if(ProdutoDAO.alert.equals("Falha ao Atualizar!")){
                        JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Atenção",JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Sucesso",JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(NumberFormatException e){
                    jLValor.setVisible(true);
                    jLNome.setVisible(false);
                    jLImg.setVisible(false);
                    jLQtde.setVisible(false);
                    jLFornec.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_jBAltActionPerformed

    private void jBExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcActionPerformed
        ProdutoDAO pdao = new ProdutoDAO();
        
        if(jTProdutos.getSelectedRow() != -1){
            pdao.Delete(modelo.PegaDadosLinha(jTProdutos.getSelectedRow()).getCod_prod());
            modelo.RecarregaTabela();
            LimpaCampos();
            if(ProdutoDAO.alert.equals("Falha ao Excluir!")){
                JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Atenção",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, ProdutoDAO.alert,"Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBExcActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        jTNome.setText(String.valueOf(modelo.getValueAt(jTProdutos.getSelectedRow(), 0)));
        jBImagem.setText(String.valueOf(modelo.getValueAt(jTProdutos.getSelectedRow(), 1)));
        jTQtde.setText(String.valueOf(modelo.getValueAt(jTProdutos.getSelectedRow(), 2)));
        jTFornec.setText(String.valueOf(modelo.getValueAt(jTProdutos.getSelectedRow(), 3)));
        jTValor.setText(String.valueOf(modelo.getValueAt(jTProdutos.getSelectedRow(), 4)));
        BufferedImage img = null;
        try {
            img = ImageIO.read(new ByteArrayInputStream(modelo.PegaDadosLinha(jTProdutos.getSelectedRow()).getImg()));
            ImageIcon background = new ImageIcon();
            background.setImage(img.getScaledInstance(170, 140, 100));
            jBPrint.setIcon(background);
	} catch (IOException e) {
            logger.error(e);
	}
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        if(jTBusca.getText().isEmpty()){
            jLNomeB.setVisible(true);
        }else{
            modelo.Search(jTBusca.getText());
            LimpaCampos();
            jLNomeB.setVisible(false);
        }
    }//GEN-LAST:event_jBBuscaActionPerformed

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        modelo.RecarregaTabela();
        LimpaCampos();
    }//GEN-LAST:event_jBListarActionPerformed

    private void jBImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImagemActionPerformed
        String userhome = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userhome + "\\Desktop");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                path = chooser.getSelectedFile().getAbsolutePath();
                jBImagem.setText(chooser.getSelectedFile().getName());
                ImageIcon background = new ImageIcon(path);
                background.setImage(background.getImage().getScaledInstance(170, 140, 100));
                jBPrint.setIcon(background);
            }
    }//GEN-LAST:event_jBImagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlt;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBCad;
    private javax.swing.JButton jBExc;
    private javax.swing.JButton jBImagem;
    private javax.swing.JButton jBListar;
    private javax.swing.JButton jBPrint;
    private javax.swing.JLabel jLFornec;
    private javax.swing.JLabel jLImg;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNomeB;
    private javax.swing.JLabel jLQtde;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTBusca;
    private javax.swing.JTextField jTFornec;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jTQtde;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables
}
