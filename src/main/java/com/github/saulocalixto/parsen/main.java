/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.parsen;

/**
 *
 * @author saulocalixto
 */
public class main {
    
    public static void main(String[] args) {
        
        String conta;
        conta = args[0];
        
        if(args != null) {
            try {
                System.out.println(Calcular.calcularExpressao(conta));
            } catch (IllegalArgumentException erro) {
                System.err.println("Expressão inválida.");
            }
        } else {
            System.err.println("Erro, expressão nula.");
        }
    }
    
}
