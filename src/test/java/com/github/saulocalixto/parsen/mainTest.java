/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 *
 * @author saulocalixto
 */
public class mainTest {

 

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void saidaCerta() {
        String[] expressaocorreta = new String[1];
        expressaocorreta[0] = "5+10";
        exit.expectSystemExitWithStatus(0);
        Starter.main(expressaocorreta);
    }

    @Test(expected = Exception.class)
    public void saidaErrada() {
        String[] errada;
        errada = new String[1];
        errada[0] = "//5+10+3+";
        Starter.main(errada);
    }
    
    @Test(expected = NullPointerException.class)
    public void saidaNula() {
        String[] errada;
        errada = null;
        Starter.main(errada);
    }
}
