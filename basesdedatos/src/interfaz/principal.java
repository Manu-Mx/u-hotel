/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import com.mysql.jdbc.Connection;
import static interfaz.grafico.PASSWORD;
import static interfaz.grafico.URL;
import static interfaz.grafico.USERNAME;
import static interfaz.grafico.getConnection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
 
import java.awt.Color;

/**
 *
 * @author Manuel4612
 */
public class principal extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/proyecto";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    
    public String num_tar;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setTitle("Principal");
        setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(255,255,255,100));
        reservarPanel.setBackground(new Color(255,255,255,100));
        jPanel1.setBackground(new Color(255,255,255,100));
        cabeceraField.setBackground(new Color(255,255,255,100));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabeceraField = new javax.swing.JPanel();
        bienvenidoLabel = new javax.swing.JLabel();
        reservarButton = new javax.swing.JButton();
        nombreField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        preguntaLabel = new javax.swing.JLabel();
        reservarPanel = new javax.swing.JPanel();
        destinoLabel = new javax.swing.JLabel();
        entradaLabel = new javax.swing.JLabel();
        salidaLabel = new javax.swing.JLabel();
        fechaEntField = new javax.swing.JFormattedTextField();
        fechaSalField = new javax.swing.JFormattedTextField();
        obligatorioLabel = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        destinoCmbx = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        selectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviciosTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nombreField1 = new javax.swing.JTextField();
        infoField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        ciudadField = new javax.swing.JTextField();
        ubiLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 560));
        getContentPane().setLayout(null);

        cabeceraField.setBackground(new java.awt.Color(153, 204, 255));

        bienvenidoLabel.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        bienvenidoLabel.setText("Bienvenido:");

        reservarButton.setText("RESERVACIONES");
        reservarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarButtonActionPerformed(evt);
            }
        });

        nombreField.setEditable(false);

        javax.swing.GroupLayout cabeceraFieldLayout = new javax.swing.GroupLayout(cabeceraField);
        cabeceraField.setLayout(cabeceraFieldLayout);
        cabeceraFieldLayout.setHorizontalGroup(
            cabeceraFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenidoLabel)
                .addGap(18, 18, 18)
                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(reservarButton)
                .addGap(22, 22, 22))
        );
        cabeceraFieldLayout.setVerticalGroup(
            cabeceraFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabeceraFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bienvenidoLabel)
                    .addComponent(reservarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreField))
                .addContainerGap())
        );

        getContentPane().add(cabeceraField);
        cabeceraField.setBounds(0, 0, 650, 61);

        preguntaLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        preguntaLabel.setText("¿Buscas una habitacion?");

        destinoLabel.setText("Destino*:");

        entradaLabel.setText("Entrada");

        salidaLabel.setText("Salida");

        fechaSalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaSalFieldActionPerformed(evt);
            }
        });

        obligatorioLabel.setText("*  Campos Obligatorios");

        buscarButton.setText("Buscar...");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        destinoCmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja California del Sur", "CAMPECHE", "Ciudad de Mexico", "Guerrero", "Guanajuato", "Jalisco", "Michoacan", "Nuevo Leon", "Oaxaca", "Puebla", "Quintana Roo", "Tamaulipas", "Veracruz", "Yucatan" }));

        javax.swing.GroupLayout reservarPanelLayout = new javax.swing.GroupLayout(reservarPanel);
        reservarPanel.setLayout(reservarPanelLayout);
        reservarPanelLayout.setHorizontalGroup(
            reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(reservarPanelLayout.createSequentialGroup()
                        .addComponent(destinoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entradaLabel)
                        .addGap(62, 62, 62))
                    .addGroup(reservarPanelLayout.createSequentialGroup()
                        .addGroup(reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obligatorioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(reservarPanelLayout.createSequentialGroup()
                                .addComponent(destinoCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fechaEntField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)))
                .addGroup(reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservarPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(salidaLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(reservarPanelLayout.createSequentialGroup()
                        .addComponent(fechaSalField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarButton)
                        .addGap(18, 18, 18))))
        );
        reservarPanelLayout.setVerticalGroup(
            reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoLabel)
                    .addComponent(entradaLabel)
                    .addComponent(salidaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaEntField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaSalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton)
                    .addComponent(destinoCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(obligatorioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        selectButton.setText("Seleccionar");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        serviciosTxt.setEditable(false);
        serviciosTxt.setColumns(20);
        serviciosTxt.setRows(5);
        jScrollPane1.setViewportView(serviciosTxt);

        jLabel1.setText("Servicios:");

        nombreField1.setEditable(false);
        nombreField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreField1ActionPerformed(evt);
            }
        });

        infoField.setEditable(false);

        correoField.setEditable(false);

        ciudadField.setEditable(false);
        ciudadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadFieldActionPerformed(evt);
            }
        });

        ubiLabel.setText("Ubicacion");

        telLabel.setText("Correo:");

        infoLabel.setText("Estrellas:");

        nombreLabel.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telLabel)
                            .addComponent(ubiLabel)
                            .addComponent(infoLabel))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(correoField)
                            .addComponent(ciudadField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addGap(50, 50, 50)
                        .addComponent(nombreField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(nombreField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoLabel)
                            .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telLabel)
                            .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubiLabel)
                            .addComponent(ciudadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(reservarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 70, 620, 370);

        salirButton.setText("SALIR");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salirButton);
        salirButton.setBounds(540, 490, 80, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setId(String id) {
        num_tar = id;
    }

    private void reservarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarButtonActionPerformed
        
        
        reservar res = new reservar();
        res.setVisible(true);
        dispose();
        dispose();

    }//GEN-LAST:event_reservarButtonActionPerformed

    private void fechaSalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaSalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaSalFieldActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        // TODO add your handling code here:
        grafico graf = new grafico();        //mandamos a llamr a la ventana de Login(GRAFICO)
        graf.setVisible(true);               //Para decir que es correcto
        dispose();                          //cerrar la ventana actual


    }//GEN-LAST:event_salirButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        String edo = destinoCmbx.getToolTipText();
        
        nombreField.setText(num_tar);
        
        try
        {
            Connection con = null;
            con = getConnection();
            
            PreparedStatement ps;
            ResultSet res;
            
            /*String cadena = "Select h.nombre, h.correo, h.servicios, h.estrellas, l.ciudad"
                    + "from hotel h, lugar l where h.id_lugar = l.id;";*/
            
            String cadena = "Select h.nombre, h.correo, h.servicios, h.estrellas, l.ciudad from hotel h, lugar l where h.id_lugar = l.id and h.id = 010";
            
            ps = con.prepareStatement(cadena);
            res = ps.executeQuery();
            
            if(res.next())
            {
                nombreField1.setText(res.getString("nombre"));
                correoField.setText(res.getString("correo"));
                serviciosTxt.setText(res.getString("servicios"));
                infoField.setText(res.getString("estrellas"));
                ciudadField.setText(res.getString("ciudad"));
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay hoteles disponibles");
            }
            
            con.close();
            
        }catch(Exception e)
        {
            System.out.println("Hubo un problema"+e);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    public static Connection getConnection()
    {
        Connection con = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            /*if(con != null)
            {
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            }*/
        }
        catch (Exception e)
        {
            System.out.println("Hubo un problema: "+e);
        }
        return con;
    }
    
    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed

        habitacion hab = new habitacion();

        hab.setVisible(true);

    }//GEN-LAST:event_selectButtonActionPerformed

    private void nombreField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreField1ActionPerformed

    private void ciudadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadFieldActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoLabel;
    private javax.swing.JButton buscarButton;
    private javax.swing.JPanel cabeceraField;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JTextField correoField;
    private javax.swing.JComboBox<String> destinoCmbx;
    private javax.swing.JLabel destinoLabel;
    private javax.swing.JLabel entradaLabel;
    private javax.swing.JFormattedTextField fechaEntField;
    private javax.swing.JFormattedTextField fechaSalField;
    private javax.swing.JTextField infoField;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField nombreField1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel obligatorioLabel;
    private javax.swing.JLabel preguntaLabel;
    private javax.swing.JButton reservarButton;
    private javax.swing.JPanel reservarPanel;
    private javax.swing.JLabel salidaLabel;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton selectButton;
    private javax.swing.JTextArea serviciosTxt;
    private javax.swing.JLabel telLabel;
    private javax.swing.JLabel ubiLabel;
    // End of variables declaration//GEN-END:variables
}
