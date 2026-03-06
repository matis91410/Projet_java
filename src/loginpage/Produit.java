/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage;

/**
 *
 * @author tisma
 */
public class Produit {
    
    private String nom_produit;
    private String description;
    private Integer prix;
    private String stock;
    
    public Produit(String nom_produit, String description, Integer prix, String stock){
    
    this.nom_produit = nom_produit;
    this.description = description;
    this.prix = prix;
    this.stock = stock;
 }
    public String getnom_produit(){
        return this.nom_produit;
    }
    
    public String getdescription(){
        return this.description;
    }
    
    public String getstock(){
        return this.stock;
    }
    
    public Integer getprix(){
        return this.prix;
    }
    
    
}


