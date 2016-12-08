/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.parsen;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

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

    @Test(expected = Exception.class)
    public void saidaErrada2() {
        String[] errada;
        errada = new String[1];
        errada[0] = null;
        Starter.main(errada);
    }

    @Test()
    public void Construtor() {

        Starter main = new Starter();

        Assert.assertNotNull(main);
    }
}
