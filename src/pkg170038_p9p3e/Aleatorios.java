/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170038_p9p3e;
/**
 *
 * @author 170038
 */
public class Aleatorios extends javax.swing.JFrame {

    private int nrand[] = new int[15]; // Numero que almacenara todos los numeros
                                      // random que se generen
    private int aux[] = new int[15]; // Acumulador para ordenar los numeros
    private int multiplos[] = new int[15]; // Acumulador para multiplos de 3
    
    public Aleatorios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumeros = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrden = new javax.swing.JTextArea();
        btnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMult3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMenor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMayor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIgual = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumeros.setEditable(false);
        txtNumeros.setColumns(20);
        txtNumeros.setRows(5);
        jScrollPane1.setViewportView(txtNumeros);

        txtOrden.setEditable(false);
        txtOrden.setColumns(20);
        txtOrden.setRows(5);
        jScrollPane2.setViewportView(txtOrden);

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Multiplos de 3");

        txtMult3.setEditable(false);
        txtMult3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Menor");

        txtMenor.setEditable(false);
        txtMenor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Mayor");

        txtMayor.setEditable(false);
        txtMayor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Suma");

        txtIgual.setEditable(false);
        txtIgual.setBackground(new java.awt.Color(255, 255, 255));

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIgual)
                                        .addGap(33, 33, 33))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMult3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(txtMult3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        String aux[] = new String[15];
        String aux2[] = new String[15];
        String gen,acum = "";
        int igual = 0;
        
        // Se borran los datos, en caso de volver a presionar el boton
        txtIgual.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtMult3.setText("");
        txtNumeros.setText("");
        txtOrden.setText("");
        
        // Se genran los numeros y se parcean con un arreglo auxiliar tipo string
        for(int i=0;i<15;i++){
            nrand[i] = (int)(Math.random()*(50-10)+10);
            this.aux[i] = nrand[i];
            aux[i] = String.valueOf(nrand[i]);
            acum += "\n"+aux[i];
        }
        
        // Ordena los numeros con metodo burbuja
        for(int i = 0; i < 15 - 1; i++)
        {
            for(int j = 0; j < 15 - 1; j++)
            {
                if (this.aux[j] < this.aux[j + 1])
                {
                    int tmp = this.aux[j+1];
                    this.aux[j+1] = this.aux[j];
                    this.aux[j] = tmp;
                }
            }
        }
        
        // Imprime los numeros generados sin ordenar
        txtNumeros.setText(acum);
        acum = "";
        
        for(int i=0;i<15;i++){
            if(nrand[i] % 3 == 0){
                multiplos[i] = nrand[i];
                aux2[i] = String.valueOf(multiplos[i]);
                acum += aux2[i] + ", ";
            }else{
                aux2[i] = "";
            }
        }
        
        // Imprime los multiplos de 3
        txtMult3.setText(acum);
        acum = "";
        
        
        
        
        // Convierte el numero mayor, menor y el resultado de la suma de ambos a string para despues imprimirlo
        gen = String.valueOf(this.aux[14]);
        txtMenor.setText(gen);
        gen = ""; // Se iguala a null para evitar concatenar con la variable anterior
        gen = String.valueOf(this.aux[0]);
        txtMayor.setText(gen);
        gen = ""; 
        igual = this.aux[0] + this.aux[14];
        gen = String.valueOf(igual);
        txtIgual.setText(gen);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        
        // Imprime de forma no ortodoxa los numeros ordenados
        txtOrden.setText("\n"+aux[14]+"\n"+aux[13]+"\n"+aux[12]+"\n"+aux[11]+"\n"+aux[10]+
                "\n"+aux[9]+"\n"+aux[8]+"\n"+aux[7]+"\n"+aux[6]+"\n"+aux[5]+"\n"+
                aux[4]+"\n"+aux[3]+"\n"+aux[2]+"\n"+aux[1]+"\n"+aux[0]);
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aleatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtIgual;
    private javax.swing.JTextField txtMayor;
    private javax.swing.JTextField txtMenor;
    private javax.swing.JTextField txtMult3;
    private javax.swing.JTextArea txtNumeros;
    private javax.swing.JTextArea txtOrden;
    // End of variables declaration//GEN-END:variables
}
