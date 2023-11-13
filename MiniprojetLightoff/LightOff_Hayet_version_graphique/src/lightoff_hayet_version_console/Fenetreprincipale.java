/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_hayet_version_console;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author owenh
 */
public class Fenetreprincipale extends javax.swing.JFrame {
    GrilledeJeu grille;
    int nbCoups;
    int i;
    int j;
    public void initialiserPartie() {
   grille.eteindreToutesLesCellules();
   grille.melangerMatriceAleatoirement(10);

    }
 
  
   public void Victory(){
       if (grille.cellulesToutesEteintes()== true ){
           FenetreVictoire f = new FenetreVictoire() ;
         f.setVisible(true) ;
   }}


    /**
     * Creates new form Fenetreprincipale
     */
    public Fenetreprincipale() {
        initComponents();
       getContentPane().setBackground(new Color(0,0,0));
       

    int nbColonnes = 10;
    int nbLignes = 10;
grille = new GrilledeJeu(nbLignes, nbColonnes);
    getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70,nbColonnes*40, nbLignes*40));
this.pack();
this.revalidate();

PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
 getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1* 40, nbLignes * 40));
 this.pack();
 this.revalidate();
 for (i = 0; i < nbLignes; i++) {
 JButton bouton_ligne = new JButton();
 ActionListener ecouteurClick = new ActionListener() {
 final int j = i;
         
 @Override
 public void actionPerformed(ActionEvent e) {
 grille.activerLigneDeCellules(j);
repaint();
 }
 };
 bouton_ligne.addActionListener(ecouteurClick);
 PanneauBoutonsVerticaux.add(bouton_ligne);

 }
 PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
 getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, nbColonnes * 40, 1 * 40));
 this.pack();
 this.revalidate();
 for (j = 0; j < nbColonnes; j++) {
 JButton bouton_colonne = new JButton();
 ActionListener ecouteurClick = new ActionListener() {
 final int i = j;
         
 @Override
 public void actionPerformed(ActionEvent e) {
 grille.activerColonneDeCellules(i);
repaint();
 }
 };
 bouton_colonne.addActionListener(ecouteurClick);
 PanneauBoutonsHorizontaux.add(bouton_colonne);

 }
   PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
    for (int i=0; i < nbLignes; i++) {
    for (int j=0; j < nbColonnes; j++ ) {
    CelluleGraphique bouton_cellule = new CelluleGraphique( this.grille.matriceCellules[i][j], 36,36);
    PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
 }
}
    Panneaudifficulte.add(Easy);
       Panneaudifficulte.add(Normal);
          Panneaudifficulte.add(Hardcore);
    Easy.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
   int nbLignes = 4 ;
   int nbColonnes = 4;
   grille = new GrilledeJeu(nbLignes,nbColonnes );
               initialiserPartie();
 }
        });
    Normal.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
   int nbLignes = 6 ;
   int nbColonnes = 6;
   grille = new GrilledeJeu(nbLignes,nbColonnes );
               initialiserPartie();
 }
        });
          Hardcore.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
   int nbLignes = 10 ;
   int nbColonnes = 10;
   grille = new GrilledeJeu(nbLignes,nbColonnes );
       initialiserPartie();

            }
        });  
    initialiserPartie();
    
    int nbCoups; 
 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        Panneaudifficulte = new javax.swing.JPanel();
        Easy = new javax.swing.JButton();
        Normal = new javax.swing.JButton();
        Hardcore = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 204));
        PanneauGrille.setForeground(new java.awt.Color(102, 51, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(550, 550));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 500, 500));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 500, 40));

        Panneaudifficulte.setBackground(new java.awt.Color(102, 255, 255));

        Easy.setBackground(new java.awt.Color(153, 255, 153));
        Easy.setText("Easy");

        Normal.setBackground(new java.awt.Color(153, 153, 255));
        Normal.setText("Medium");

        Hardcore.setBackground(new java.awt.Color(255, 51, 51));
        Hardcore.setText("Hardcore");

        javax.swing.GroupLayout PanneaudifficulteLayout = new javax.swing.GroupLayout(Panneaudifficulte);
        Panneaudifficulte.setLayout(PanneaudifficulteLayout);
        PanneaudifficulteLayout.setHorizontalGroup(
            PanneaudifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneaudifficulteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Easy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Normal)
                .addGap(18, 18, 18)
                .addComponent(Hardcore)
                .addContainerGap())
        );
        PanneaudifficulteLayout.setVerticalGroup(
            PanneaudifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneaudifficulteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanneaudifficulteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Easy)
                    .addComponent(Normal)
                    .addComponent(Hardcore))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(Panneaudifficulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 280, -1));

        jButton1.setText("DiaM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 60, -1));

        jButton2.setText("DiaD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.grille.activerDiagonaleMontante();
 repaint();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
this.grille.activerDiagonaleDescendante();
 repaint();  
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


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
            java.util.logging.Logger.getLogger(Fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetreprincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetreprincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Easy;
    private javax.swing.JButton Hardcore;
    private javax.swing.JButton Normal;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel Panneaudifficulte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
