/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.parsen;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author saulocalixto
 */
public class CalcularTest {

    Calcular calculo;
    
    @Before
    public void executaAntes() {
        calculo = new Calcular();
}
    
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void saidaCorreta() {
        exit.expectSystemExitWithStatus(1);
        String expressao = "5+5";
        assertEquals(10.0f, calculo.calcularExpressao(expressao),0.0f);
    }

}
