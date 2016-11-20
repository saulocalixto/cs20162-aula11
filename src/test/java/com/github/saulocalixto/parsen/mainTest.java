/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author saulocalixto
 */
public class mainTest {

    Calcular calculo;

    @Before
    public void executaAntes() {
        calculo = new Calcular();
    }
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void saidaCerta() {
        exit.expectSystemExitWithStatus(0);
        String[] expressao = new String[1];
        expressao[0] = "15*7";
        main.main(expressao);
    }
    
        @Test
    public void expressaoNula() {
        exit.expectSystemExitWithStatus(1);
        String[] expressao = new String[1];
        expressao[0] = null;
        main.main(expressao);
    }

}
