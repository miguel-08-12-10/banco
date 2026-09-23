/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author miguel62977036
 */
public class Contacpf  extends Conta{
     private double cpf;
     

    public double getCpf() {
        return cpf;
    }

    public Contacpf(double cpf, String titular, double saldo) {
        super(titular,saldo);
        this.cpf = cpf;
        
    }
    
   @Override
    public void extratoBancario(){
        System.out.println("cpf" + this.cpf);
        super.extratoBancario();
         System.out.println("---------");
        
        
    
     
         
    }
}
    
         
         
     
    
   
    

