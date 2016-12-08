/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.parsen;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author saulocalixto
 */
public class CalcularTest {

    Calcular calculo;

    @Test
    public void saidaCorreta() {
        String expressao = "5+5";
        assertEquals(10.0f, calculo.calcularExpressao(expressao), 0.0f);
    }

    @Test
    public void chamarConstrutor() {
        Calcular calc = new Calcular();
        Assert.assertNotNull(calc);
    }
}
