package View;

import Model.Cls_Calculo;
import Model.Cls_Cliente;

public class Frm_SaidaDados extends javax.swing.JDialog {

    public Frm_SaidaDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        //Inicializar as variáveis
        String modalidade = "";
        int valorMensalidade = 0;
        int valorDesconto = 0;
        int valorComDesconto = 0;
        String nome = Cls_Cliente.getNome();
        int pacote = Cls_Cliente.getPacote();
        //Instaciar a classe de calculo
        Cls_Calculo Obj_Calculo = new Cls_Calculo();
        //Utilizar o Obj_Calculo
        modalidade = Obj_Calculo.calcularModalidade(pacote);
        valorMensalidade = Obj_Calculo.calcularMensalidade(pacote);
        valorDesconto = Obj_Calculo.calcularValorDesconto(pacote);
        valorComDesconto = valorMensalidade - (valorMensalidade * valorDesconto / 100);
        //Exibir os dados
        this.txtNome.setText(nome);
        this.txtPacote.setText(String.valueOf(pacote));
        this.txtModalidade.setText(String.valueOf(modalidade));
        this.txtValorSemDesconto.setText(String.valueOf(valorMensalidade));
        this.txtValorDesconto.setText(String.valueOf(valorDesconto));
        this.txtValorComDesconto.setText(String.valueOf(valorComDesconto));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        txtPacote = new javax.swing.JTextField();
        txtModalidade = new javax.swing.JTextField();
        txtValorComDesconto = new javax.swing.JTextField();
        txtValorSemDesconto = new javax.swing.JTextField();
        txtValorDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 0, 14)); // NOI18N
        jLabel1.setText("Academia");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Pacote:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Modalidade:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Valor sem desconto:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("Valor desconto (%):");

        txtNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Valor com desconto:");

        btnVoltar.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        txtPacote.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPacote.setEnabled(false);

        txtModalidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtModalidade.setEnabled(false);

        txtValorComDesconto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtValorComDesconto.setEnabled(false);

        txtValorSemDesconto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtValorSemDesconto.setEnabled(false);

        txtValorDesconto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtValorDesconto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorComDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValorDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txtValorSemDesconto)
                                    .addComponent(txtPacote, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(txtModalidade)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorSemDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorComDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose(); //Fecha o formulário
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0); //Fecha a aplicação
    }//GEN-LAST:event_btnFecharActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_SaidaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_SaidaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_SaidaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_SaidaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frm_SaidaDados dialog = new Frm_SaidaDados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtModalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPacote;
    private javax.swing.JTextField txtValorComDesconto;
    private javax.swing.JTextField txtValorDesconto;
    private javax.swing.JTextField txtValorSemDesconto;
    // End of variables declaration//GEN-END:variables
}
