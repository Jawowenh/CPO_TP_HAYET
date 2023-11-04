/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

/**
  * Classe représentant une cellule lumineuse.
 * Cette classe utilise des constantes pour définir les états possibles de la cellule et une variable pour stocker son état actuel.
 * @author owenh
 */
public class CelluleLumineuses {
    // Constantes pour les états de la cellule
    private static final int ETAT_ETEINTE = 0;
    private static final int ETAT_ALLUMEE = 1;
    private static final int ETAT_CLIGNOTANTE = 2;

    private int etat;

   /**
 * Constructeur de la classe CelluleLumineuses.
 * Initialise une nouvelle cellule en position "Éteinte" lors de sa création.
 */
public CelluleLumineuses() {
    this.etat = ETAT_ETEINTE; // L'état de la cellule est initialisé à "Éteinte" (0) lors de la création.
}

 /**
 * Méthode pour activer la cellule.
 * Cette méthode change l'état de la cellule en suivant un cycle : "Éteinte" -> "Allumée" -> "Clignotante" -> "Éteinte".
 */
public void activerCellule() {
    switch (etat) {
        case ETAT_ETEINTE:
            etat = ETAT_ALLUMEE;
            break;
        case ETAT_ALLUMEE:
            etat = ETAT_CLIGNOTANTE;
            break;
        case ETAT_CLIGNOTANTE:
            etat = ETAT_ETEINTE;
            break;
    }
}

 /**
 * Méthode pour éteindre la cellule.
 * Cette méthode met l'état de la cellule à "Éteinte" (0).
 */
public void eteindreCellule() {
    etat = ETAT_ETEINTE;
}


 /**
 * Méthode pour vérifier si la cellule est éteinte.
 * @return true si la cellule est éteinte, sinon false.
 */
public boolean estEteint() {
    return etat == ETAT_ETEINTE;
}


 /**
 * Méthode pour obtenir l'état actuel de la cellule.
 * @return l'état de la cellule (0 pour éteinte, 1 pour allumée, 2 pour clignotante).
 */
public int getEtat() {
    return etat;
}

/**
 * Redéfinition de la méthode toString pour afficher l'état de la cellule.
 * @return Une chaîne de caractères représentant l'état de la cellule ("X" pour allumée, "*" pour clignotante, "O" pour éteinte).
 */
@Override
public String toString() {
    if (etat == ETAT_ALLUMEE) {
        return "X";
    } else if (etat == ETAT_CLIGNOTANTE) {
        return "*";
    } else {
        return "O";
    }
}
}

