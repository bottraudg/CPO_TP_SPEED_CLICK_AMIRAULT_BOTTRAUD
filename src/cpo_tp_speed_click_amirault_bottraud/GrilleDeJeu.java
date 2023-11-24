/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_tp_speed_click_amirault_bottraud;

/**
 *
 * @author guilenebottraud
 */
public class GrilleDeJeu {
    private int nbLignes;
    private int nbColonne;
    
    public void EteindreToutesLesCellules (){
        for (int i =0; i<nbLignes ; i++){
            for (int j=0; j<nbColonne; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    public void ActiverUneCellule(){
        for (int i=0; i<nbLignes ; i++){
            for (int j=0; j<nbColonne; j++){
                matriceCellules[i][j].allumerCellule()
            }
        }
    }
    
}
