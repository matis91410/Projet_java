/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage;

/**
 *
 * @author tisma
 */
public class User {
    
    private String nom;
    private String prenom;
    private String email;
    
    public User(String nom, String prenom, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
    
    public String getnom(){
        return this.nom;
    }
    
    public String getprenom(){
        return this.prenom;
    }
    
    public String getemail(){
        return this.email;
    }
}
