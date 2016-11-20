package cinemalib;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Linguagem de Programação 1 - Projeto Final
 * @author Alielson, Fábio Melo, Gabriel, Yuri Felix
 * TelaCadastro.java - Classe da Interface Gráfica de Cadastro
 */

public class TelaCadastro extends javax.swing.JFrame {
        public static String nomedoarquivo = "meusfilmes";
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genero = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        labelCidadeProducao = new javax.swing.JLabel();
        labelEstadoProducao = new javax.swing.JLabel();
        labelLancamento = new javax.swing.JLabel();
        anoLancamento = new javax.swing.JTextField();
        labelAnoLancamento = new javax.swing.JLabel();
        labelPaisLancamento = new javax.swing.JLabel();
        paisLancamento = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        labelRoteiro = new javax.swing.JLabel();
        botaoRestaurar = new javax.swing.JButton();
        labelPremios = new javax.swing.JLabel();
        premios = new javax.swing.JTextField();
        labelMaterialOriginal = new javax.swing.JLabel();
        materialOriginal = new javax.swing.JTextField();
        painelCategorias = new javax.swing.JPanel();
        labelCategorias = new javax.swing.JLabel();
        buttonAdicionarCategoria = new javax.swing.JButton();
        ButtonLimparCategorias = new javax.swing.JButton();
        labelCadastroFilmes = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        labelProducao = new javax.swing.JLabel();
        anoProducao = new javax.swing.JTextField();
        paisProducao = new javax.swing.JTextField();
        estadoProducao = new javax.swing.JTextField();
        cidadeProducao = new javax.swing.JTextField();
        labelAnoProducao = new javax.swing.JLabel();
        labelPaisProducao = new javax.swing.JLabel();
        roteiro = new javax.swing.JTextField();
        sinopse = new javax.swing.JTextField();
        labelSinopse = new javax.swing.JLabel();
        painelElenco = new javax.swing.JPanel();
        labelElenco = new javax.swing.JLabel();
        ButtonAdicionarElenco = new javax.swing.JButton();
        ButtonLimparElenco = new javax.swing.JButton();
        labelDiretor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomeDiretor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        registroDiretor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

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

        labelRoteiro.setText("Roteiro:");

        botaoRestaurar.setText("RESTAURAR");
        botaoRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRestaurarActionPerformed(evt);
            }
        });

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

        labelCadastroFilmes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCadastroFilmes.setText("Cadastro de Filmes");

        labelNome.setText("Nome do Filme");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        labelProducao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelProducao.setText("Produção:");

        labelAnoProducao.setText("Ano:");

        labelPaisProducao.setText("País:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelDiretor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDiretor.setText("Diretor");

        jLabel1.setText("Nome:");

        jLabel2.setText("Registro Artistico:");

        registroDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroDiretorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(roteiro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(premios, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelAnoLancamento)
                                                .addComponent(labelProducao)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(anoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelLancamento, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(labelNome)
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelSinopse)
                                                .addComponent(labelDiretor)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelPaisLancamento)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(paisProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(127, 127, 127)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(labelEstadoProducao)
                                                                .addComponent(estadoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(anoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(paisLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(164, 164, 164)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(labelAnoProducao)
                                                                .addGap(64, 64, 64)
                                                                .addComponent(labelPaisProducao))
                                                            .addComponent(labelRoteiro))
                                                        .addGap(95, 95, 95)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(labelCidadeProducao)
                                                            .addComponent(cidadeProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(labelPremios))))))
                                        .addGap(39, 39, 39))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomeDiretor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(registroDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 3, Short.MAX_VALUE)
                                        .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(painelElenco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelMaterialOriginal)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(materialOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoRestaurar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGenero)
                            .addComponent(labelCadastroFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSinopse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinopse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRoteiro)
                            .addComponent(labelPremios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(premios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelProducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAnoProducao)
                            .addComponent(labelPaisProducao)
                            .addComponent(labelCidadeProducao)
                            .addComponent(labelEstadoProducao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paisProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiretor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registroDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelElenco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero)
                    .addComponent(labelMaterialOriginal))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRestaurar)
                    .addComponent(botaoSalvar)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        
        Filme salvarfilme = new Filme(nome.getText(),materialOriginal.getText());
        Serializador s = new Serializador();
        Deserializador d = new Deserializador();
        List<Filme> listaFilmes = new ArrayList(); 
        
        try {
           
            listaFilmes = (ArrayList<Filme>) d.deserializar(nomedoarquivo);
            listaFilmes.add(salvarfilme);
            s.serializar(nomedoarquivo, listaFilmes);
            dispose();
        } catch (Exception ex) {
            System.err.println("Falha ao Salvar! - " +
            ex.toString());
        }
        
       
        
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void anoLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoLancamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoLancamentoActionPerformed

    private void materialOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialOriginalActionPerformed

    private void buttonAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarCategoriaActionPerformed

    private void ButtonLimparCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLimparCategoriasActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void ButtonAdicionarElencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarElencoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAdicionarElencoActionPerformed

    private void ButtonLimparElencoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparElencoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLimparElencoActionPerformed

    private void registroDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroDiretorActionPerformed

    private void botaoRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRestaurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRestaurarActionPerformed

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
                TelaCadastro tc = new TelaCadastro() ;
                tc.setVisible(true);
            }
        });
        
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdicionarElenco;
    private javax.swing.JButton ButtonLimparCategorias;
    private javax.swing.JButton ButtonLimparElenco;
    private javax.swing.JTextField anoLancamento;
    private javax.swing.JTextField anoProducao;
    private javax.swing.JButton botaoRestaurar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton buttonAdicionarCategoria;
    private javax.swing.JTextField cidadeProducao;
    private javax.swing.JTextField estadoProducao;
    private javax.swing.JTextField genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAnoLancamento;
    private javax.swing.JLabel labelAnoProducao;
    private javax.swing.JLabel labelCadastroFilmes;
    private javax.swing.JLabel labelCategorias;
    private javax.swing.JLabel labelCidadeProducao;
    private javax.swing.JLabel labelDiretor;
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
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomeDiretor;
    private javax.swing.JPanel painelCategorias;
    private javax.swing.JPanel painelElenco;
    private javax.swing.JTextField paisLancamento;
    private javax.swing.JTextField paisProducao;
    private javax.swing.JTextField premios;
    private javax.swing.JTextField registroDiretor;
    private javax.swing.JTextField roteiro;
    private javax.swing.JTextField sinopse;
    // End of variables declaration//GEN-END:variables
}
