/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author pc01
 */
public class frm_calculadora extends javax.swing.JFrame {
    
    public float num1;
    public float num2;
    public String operador;

    /**
     * Creates new form frm_calculadora
     */
    public frm_calculadora() {
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

        pnl_principal = new javax.swing.JPanel();
        lbl_casilla = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        lbl_operador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_opciones = new javax.swing.JMenu();
        itm_nuevo = new javax.swing.JMenuItem();
        itm_historial = new javax.swing.JMenuItem();
        mn_ayuda = new javax.swing.JMenu();
        itm_ayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        pnl_principal.setBackground(new java.awt.Color(204, 204, 204));

        lbl_casilla.setBackground(new java.awt.Color(255, 255, 255));
        lbl_casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_casilla.setOpaque(true);

        btn_borrar.setText("C");
        btn_borrar.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_siete.setText("7");
        btn_siete.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_cuatro.setText("4");
        btn_cuatro.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_uno.setText("1");
        btn_uno.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_cero.setText("0");
        btn_cero.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        btn_dividir.setText("/");
        btn_dividir.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });

        btn_multiplicar.setText("*");
        btn_multiplicar.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });

        btn_resta.setText("-");
        btn_resta.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_ocho.setText("8");
        btn_ocho.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_nueve.setText("9");
        btn_nueve.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_suma.setText("+");
        btn_suma.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_cinco.setText("5");
        btn_cinco.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_seis.setText("6");
        btn_seis.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_dos.setText("2");
        btn_dos.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_tres.setText("3");
        btn_tres.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        lbl_operador.setBackground(new java.awt.Color(204, 204, 204));
        lbl_operador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_operador.setOpaque(true);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_casilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_principalLayout.createSequentialGroup()
                                        .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbl_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mn_opciones.setText("Opciones");

        itm_nuevo.setText("Nuevo");
        itm_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_nuevoActionPerformed(evt);
            }
        });
        mn_opciones.add(itm_nuevo);

        itm_historial.setText("Historial");
        itm_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_historialActionPerformed(evt);
            }
        });
        mn_opciones.add(itm_historial);

        jMenuBar1.add(mn_opciones);

        mn_ayuda.setText("Ayuda");

        itm_ayuda.setText("Ayuda");
        itm_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_ayudaActionPerformed(evt);
            }
        });
        mn_ayuda.add(itm_ayuda);

        jMenuBar1.add(mn_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
       if(!this.lbl_casilla.getText().contains(".")){
           this.lbl_casilla.setText(this.lbl_casilla.getText() + ".");
       }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"9");
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"0");
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
        this.num2 = Float.parseFloat(this.lbl_casilla.getText());
        this.lbl_operador.setText("");
        
        switch(this.operador){
            case "+" :
                this.lbl_casilla.setText(sincero(this.num1 + this.num2));
                break;
            case "-" : 
                this.lbl_casilla.setText(sincero(this.num1 - this.num2));
                break;
            case "*" : 
                this.lbl_casilla.setText(sincero(this.num1 * this.num2));
                break;
            case "/" : if(this.num2==0){this.lbl_casilla.setText("NoSeDivideEntreCero");}
            else{
                this.lbl_casilla.setText(sincero(this.num1 / this.num2));
            }
            break;
        }
        String resultado = this.lbl_casilla.getText();
        this.lbl_operador.setText(this.lbl_operador.getText() + "=");
        guardarHistorial(this.num1 + " " + this.operador + " " + this.num2 + " = " + resultado);
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void guardarHistorial(String operacion){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("historial.txt", true));
            writer.append(operacion);
            writer.newLine();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private void agregarNuevoAlHistorial(){
        try {
            File archivo = new File("historial.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            
            escritor.write("Nuevo\n");
            
            escritor.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"1");
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"2");
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"3");
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"4");
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"5");
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"6");
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"7");
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText(this.lbl_casilla.getText()+"8");
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        this.lbl_casilla.setText("");
        this.lbl_operador.setText("");
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        // TODO add your handling code here:
        this.num1 = Float.parseFloat(this.lbl_casilla.getText());
        this.operador = "+";
        this.lbl_operador.setText("+");
        this.lbl_casilla.setText("");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        // TODO add your handling code here:
        this.num1 = Float.parseFloat(this.lbl_casilla.getText());
        this.operador = "-";
        this.lbl_operador.setText("-");
        this.lbl_casilla.setText("");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        // TODO add your handling code here:
        this.num1 = Float.parseFloat(this.lbl_casilla.getText());
        this.operador = "*";
        this.lbl_operador.setText("*");
        this.lbl_casilla.setText("");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        // TODO add your handling code here:
        this.num1 = Float.parseFloat(this.lbl_casilla.getText());
        this.operador = "/";
        this.lbl_operador.setText("/");
        this.lbl_casilla.setText("");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void itm_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_historialActionPerformed
        // TODO add your handling code here:
        frm_historial frm = new frm_historial();
        frm.setVisible(true);
    }//GEN-LAST:event_itm_historialActionPerformed

    private void itm_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_nuevoActionPerformed
        // TODO add your handling code here:
        agregarNuevoAlHistorial();
        lbl_casilla.setText("");
    }//GEN-LAST:event_itm_nuevoActionPerformed

    private void itm_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_ayudaActionPerformed
        // TODO add your handling code here:
        frm_ayuda frm = new frm_ayuda();
        frm.setVisible(true);
    }//GEN-LAST:event_itm_ayudaActionPerformed

    public String sincero(float resultado){
        String retorno = "";
        retorno = Float.toString(resultado);
        
        if(resultado%1==0){
            retorno = retorno.substring(0, retorno.length()-2);
        }
        return retorno;
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
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JMenuItem itm_ayuda;
    private javax.swing.JMenuItem itm_historial;
    private javax.swing.JMenuItem itm_nuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_casilla;
    private javax.swing.JLabel lbl_operador;
    private javax.swing.JMenu mn_ayuda;
    private javax.swing.JMenu mn_opciones;
    private javax.swing.JPanel pnl_principal;
    // End of variables declaration//GEN-END:variables
}
