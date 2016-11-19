/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemalib;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabs
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        labelCadastroFilmes = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        nomeFIlme = new javax.swing.JTextField();
        labelProducao = new javax.swing.JLabel();
        anoProducao = new javax.swing.JTextField();
        paisProducao = new javax.swing.JTextField();
        estadoProducao = new javax.swing.JTextField();
        cidadeProducao = new javax.swing.JTextField();
        labelAnoProducao = new javax.swing.JLabel();
        labelPaisProducao = new javax.swing.JLabel();
        labelCidadeProducao = new javax.swing.JLabel();
        labelEstadoProducao = new javax.swing.JLabel();
        labelLancamento = new javax.swing.JLabel();
        anoLancamento = new javax.swing.JTextField();
        labelAnoLancamento = new javax.swing.JLabel();
        labelPaisLancamento = new javax.swing.JLabel();
        paisLancamento = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        labelDirecao = new javax.swing.JLabel();
        labelRoteiro = new javax.swing.JLabel();
        direcao = new javax.swing.JTextField();
        roteiro = new javax.swing.JTextField();
        sinopse = new javax.swing.JTextField();
        labelSinopse = new javax.swing.JLabel();
        painelElenco = new javax.swing.JPanel();
        labelElenco = new javax.swing.JLabel();
        ButtonAdicionarElenco = new javax.swing.JButton();
        ButtonLimparElenco = new javax.swing.JButton();
        genero = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoRestaurar = new javax.swing.JButton();
        labelPremios = new javax.swing.JLabel();
        premios = new javax.swing.JTextField();
        labelMaterialOriginal = new javax.swing.JLabel();
        materialOriginal = new javax.swing.JTextField();
        painelCategorias = new javax.swing.JPanel();
        labelCategorias = new javax.swing.JLabel();
        buttonAdicionarCategoria = new javax.swing.JButton();
        ButtonLimparCategorias = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCadastroFilmes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCadastroFilmes.setText("Cadastro de Filmes");

        labelNome.setText("Nome do Filme");

        nomeFIlme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFIlmeActionPerformed(evt);
            }
        });

        labelProducao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelProducao.setText("Produção:");

        labelAnoProducao.setText("Ano:");

        labelPaisProducao.setText("País:");

        labelCidadeProducao.setText("Cidade:");

        labelEstadoProducao.setText("Estado:");

        labelLancamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLancamento.setText("Lançamento:");

        anoLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoLancamentoActionPerformed(evt);
            }
        });

        labelAnoLancamento.setText("Ano:");

        labelPaisLancamento.setText("País:");

        labelGenero.setText("Gênero:");

        labelDirecao.setText("Direção:");

        labelRoteiro.setText("Roteiro:");

        labelSinopse.setText("Sinopse");

        labelElenco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelElenco.setText("Elenco");

        ButtonAdicionarElenco.setText("ADICIONAR");
        ButtonAdicionarElenco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdicionarElencoActionPerformed(evt);
            }
        });

        ButtonLimparElenco.setText("LIMPAR");
        ButtonLimparElenco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparElencoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelElencoLayout = new javax.swing.GroupLayout(painelElenco);
        painelElenco.setLayout(painelElencoLayout);
        painelElencoLayout.setHorizontalGroup(
            painelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelElencoLayout.createSequentialGroup()
                        .addComponent(labelElenco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAdicionarElenco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelElencoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonLimparElenco)))
                .addContainerGap())
        );
        painelElencoLayout.setVerticalGroup(
            painelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAdicionarElenco)
                    .addComponent(labelElenco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLimparElenco)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoRestaurar.setText("RESTAURAR");

        labelPremios.setText("Prêmios");

        labelMaterialOriginal.setText("Material Original");

        materialOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialOriginalActionPerformed(evt);
            }
        });

        labelCategorias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCategorias.setText("Categorias");

        buttonAdicionarCategoria.setText("ADICIONAR");
        buttonAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarCategoriaActionPerformed(evt);
            }
        });

        ButtonLimparCategorias.setText("LIMPAR");
        ButtonLimparCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addComponent(labelCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(buttonAdicionarCategoria))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonLimparCategorias)))
                .addContainerGap())
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategorias)
                    .addComponent(buttonAdicionarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLimparCategorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCadastroFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paisLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelAnoLancamento)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelProducao)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelAnoProducao)
                                            .addGap(64, 64, 64)
                                            .addComponent(labelPaisProducao)
                                            .addGap(95, 95, 95)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelCidadeProducao)
                                                .addComponent(cidadeProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelEstadoProducao)
                                        .addComponent(estadoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(direcao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(roteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelDirecao)
                                                        .addGap(102, 102, 102)
                                                        .addComponent(labelRoteiro)
                                                        .addGap(16, 16, 16))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelPaisLancamento)
                                                        .addComponent(paisProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(81, 81, 81)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPremios)
                                            .addComponent(premios, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelGenero))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelMaterialOriginal)
                                            .addGap(139, 139, 139))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(materialOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(anoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelLancamento, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(labelNome)
                            .addComponent(nomeFIlme, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSinopse))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelElenco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRestaurar)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeFIlme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSinopse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDirecao)
                            .addComponent(labelRoteiro)
                            .addComponent(labelPremios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(premios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAnoProducao)
                            .addComponent(labelPaisProducao)
                            .addComponent(labelCidadeProducao)
                            .addComponent(labelEstadoProducao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadoProducao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(anoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(paisProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cidadeProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLancamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(painelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAnoLancamento)
                            .addComponent(labelPaisLancamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paisLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGenero)
                            .addComponent(labelMaterialOriginal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(materialOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelElenco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRestaurar)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void nomeFIlmeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void anoLancamentoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void materialOriginalActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void buttonAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        if(iCategorias<10){
            String categoriaadd = JOptionPane.showInputDialog("Digite o nome da Categoria:");
            categorias[iCategorias]=categoriaadd;
            iCategorias++;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Não é possivel adicionar mais categorias.");
        }
    }                                                        

    private void ButtonAdicionarElencoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        if(iElencos<10){
            String elencosAdd = JOptionPane.showInputDialog("Digite o nome do ator:");
            elencos[iElencos]=elencosAdd;
            iElencos++;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Não é possivel adicionar mais atores.");
        }

    }                                                     

    private void ButtonLimparElencoActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        Arrays.fill( elencos, null);
        JOptionPane.showMessageDialog(rootPane, "Elenco excluido.");
    }                                                  

    private void ButtonLimparCategoriasActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        Arrays.fill( categorias, null);
        JOptionPane.showMessageDialog(rootPane, "categorias excluidas.");
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
        
        
        
        
        
        
        
        
    }
    private int iElencos = 0;
    private String[] elencos = new String[10];
    private int iCategorias = 0;
    private String[] categorias = new String[10];
    // Variables declaration - do not modify                     
    private javax.swing.JButton ButtonAdicionarElenco;
    private javax.swing.JButton ButtonLimparCategorias;
    private javax.swing.JButton ButtonLimparElenco;
    private javax.swing.JTextField anoLancamento;
    private javax.swing.JTextField anoProducao;
    private javax.swing.JButton botaoRestaurar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton buttonAdicionarCategoria;
    private javax.swing.JTextField cidadeProducao;
    private javax.swing.JTextField direcao;
    private javax.swing.JTextField estadoProducao;
    private javax.swing.JTextField genero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAnoLancamento;
    private javax.swing.JLabel labelAnoProducao;
    private javax.swing.JLabel labelCadastroFilmes;
    private javax.swing.JLabel labelCategorias;
    private javax.swing.JLabel labelCidadeProducao;
    private javax.swing.JLabel labelDirecao;
    private javax.swing.JLabel labelElenco;
    private javax.swing.JLabel labelEstadoProducao;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelLancamento;
    private javax.swing.JLabel labelMaterialOriginal;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPaisLancamento;
    private javax.swing.JLabel labelPaisProducao;
    private javax.swing.JLabel labelPremios;
    private javax.swing.JLabel labelProducao;
    private javax.swing.JLabel labelRoteiro;
    private javax.swing.JLabel labelSinopse;
    private javax.swing.JTextField materialOriginal;
    private javax.swing.JTextField nomeFIlme;
    private javax.swing.JPanel painelCategorias;
    private javax.swing.JPanel painelElenco;
    private javax.swing.JTextField paisLancamento;
    private javax.swing.JTextField paisProducao;
    private javax.swing.JTextField premios;
    private javax.swing.JTextField roteiro;
    private javax.swing.JTextField sinopse;
    // End of variables declaration                   
}
