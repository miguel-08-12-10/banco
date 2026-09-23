/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.banco;

/**
 *
 * @author miguel62977036
 */
public class Conta {
   
    private double saldo;
    private String titular;

    public Conta(String titular,Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setTitular(String nome){
        this.titular = titular;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
        }else{
            System.out.println("Não é permitido depositar valor negativo");
        }
        
    }
        public void sacar(double valor){
            if(valor > 0 && valor <= this.saldo){
            this.saldo = this.saldo - valor;
            }else{
                System.out.println("saque não perrmitido");
            }
        }
            
        
        public void extratoBancario(){
            System.out.println("Saldo: " + this.saldo);
            System.out.println("titular" + this.titular);
            
        }
            }
    

