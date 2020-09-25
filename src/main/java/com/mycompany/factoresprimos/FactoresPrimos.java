/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factoresprimos;

/**
 *
 * @author Usuario
 */
public class FactoresPrimos {
        

public static void main(String[] args){
    int numero, factor;
    numero=600;
    for (factor=2; factor<=numero; factor++){
        while (numero%factor==0) {
            System.out.println(numero + " | " + factor);
            numero/=factor;
        }
    }

}
}