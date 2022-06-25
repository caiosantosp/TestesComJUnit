package com.br.javatestes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTestes {
    @Test
    public  void verificaSeNumeroEImpar(){

        boolean result = Main.isOdd(5);

        Assertions.assertEquals(true,result);
    }

    @Test
    public  void verificaSeNumeroEPar(){

        boolean result = Main.isOdd(6);

        Assertions.assertEquals(false,result);
    }

    @Test
    public void verificaSeNomeENulo(){
        String result = Main.helloName("");

        Assertions.assertEquals("Hello Anonymous",result);
    }

    @Test
    public void verificaComNomeVerdadeiro(){
        String result = Main.helloName("Caio");

        String valorPassado = "Caio";

        Assertions.assertEquals(("Hello "+valorPassado),result);
    }

    @Test
    public void verificaSeSomaEstaOk(){
        int result = Main.somarNumeros(1,1,1);

        Assertions.assertEquals(3,result);
    }

    @Test
    public void verificaSeSomaEstaOkQuandoNumeroENulo(){
        int result = Main.somarNumeros();

        Assertions.assertEquals(0,result);
    }

    @Test
    public void verificaSeSomaEstaOkQuandoNumeroSoTemUmacasa(){
        int valorPassado = 4;

        int result = Main.somarNumeros(valorPassado);

        Assertions.assertEquals(valorPassado,result);
    }
}
