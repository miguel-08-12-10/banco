/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author miguel62977036
 */
public class Contafs extends Conta{

    private double cnpj;
    



    public double getCnpj() {
        return cnpj;
    }
    
    public Contafs(double cnpj, String titular,double saldo) {
        super(titular,saldo);
        this.cnpj = cnpj;
    }
    
     public void extratoBancario(){
        System.out.println("cpf" + this.cnpj);
       super.extratoBancario();
        System.out.println("---------");
     }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

