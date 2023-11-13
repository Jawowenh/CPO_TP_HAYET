/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author owenh
 */
public class CelluleGraphique extends JButton {
 int largeur; // largeur en pixel de la cellule
 int hauteur; // hauteur en pixel de la cellule
 CelluleLumineuses celluleLumineuseAssociee;
 // constructeur (appelé depuis FenetrePrincipale)
 public CelluleGraphique(CelluleLumineuses celluleLumineuseAssociee, int largeur,int hauteur) {
 this.largeur = largeur;
 this.hauteur = hauteur;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 // Methode gérant le dessin de la cellule
 @Override
  protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.getEtat() == 0) {
 g.setColor(Color.red);
 } 
 if (celluleLumineuseAssociee.getEtat() == 1) {
 g.setColor(Color.white);
 }
 if( celluleLumineuseAssociee.getEtat()== 2 ){
     g.setColor(Color.blue);
  }
 g.fillOval(2, 2, w - 4, h - 4);
 }
/*
   protected void paintComponent(Graphics g) {
 int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.estEteint()== true) {
     g.setColor(Color.red);
 } else{ 
     g.setColor(Color.blue);
 }
if (celluleLumineuseAssociee.getEtat()== 2) {
     g.setColor(Color.magenta);
 g.fillOval(2, 2, w - 4, h - 4);
 }
*/
   }
