/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage;

/**
 *
 * @author tisma
 */
public class Commande {
    
    public Integer id_commande;
    public String nom;
    public String nom_produit;
    public String date_commande;
    public Integer quantite;
    public String nom_etat;
    public Integer montant_total;
    
    public Commande(Integer id_commande,String nom, String nom_produit,String date_commande, Integer quantite, String nom_etat, Integer montant_total){
        
        this.id_commande=id_commande;
        this.nom=nom;
        this.nom_produit=nom_produit;
        this.date_commande=date_commande;
        this.quantite=quantite;
        this.nom_etat=nom_etat;
        this.montant_total=montant_total;
    }
    
    
    public Integer getid_commande(){
        return this.id_commande;
    }
    
   
    public String getnom(){
        return this.nom;
    }
    
    public String getnom_produit(){
        return this.nom_produit;
    }
    
     public String getdate_commande(){
        return this.date_commande;
    }
    
    public Integer getquantite(){
        return this.quantite;
    }
    
    public String getnom_etat(){
        return this.nom_etat;
    }
    
    public Integer getmontant_total(){
        return this.montant_total;
    }
}
