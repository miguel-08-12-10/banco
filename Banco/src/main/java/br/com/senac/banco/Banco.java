/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.banco;

/**
 *
 * @author miguel62977036
 */
public class Banco {

    public static void main(String[] args) {
       ContaBancaria conta1 = new ContaBancaria("Miguel");
       
       conta1.extratoBancario();
       conta1.sacar(10);
    }
}
