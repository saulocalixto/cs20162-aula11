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

    String[] expressaonula = new String[1];
    String[] expressaocorreta = new String[1];

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void saidaCerta() {
        expressaocorreta[0] = "5+10";
        exit.expectSystemExitWithStatus(0);
        main.main(expressaocorreta);
    }

}
