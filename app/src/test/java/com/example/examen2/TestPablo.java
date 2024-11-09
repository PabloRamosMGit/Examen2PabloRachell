package com.example.examen2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestPablo {
    @Test
    public void testConvertirNumero_binario(){
        assertEquals(4, Calculadora.convertirNumero("100", 0)); // 100 --> 5
        assertEquals(15, Calculadora.convertirNumero("1111", 0)); // 1111 -> 15
        assertEquals(-1, Calculadora.convertirNumero("2", 0)); // Invalido Binario
        assertEquals(-1, Calculadora.convertirNumero("1110511", 0)); // Invalido

    }
    @Test
    public void testConvertirNumero_octal(){
        assertEquals(10, Calculadora.convertirNumero("12", 1)); // 12 -> 10
        assertEquals(63, Calculadora.convertirNumero("77", 1)); // 77 -> 63
        assertEquals(-1, Calculadora.convertirNumero("8", 1)); // Invalido numero octal
        assertEquals(-5, Calculadora.convertirNumero("-5", 1));//Acepta negativos
    }

    @Test
    public void testRealizarOperacion_multiplicacion() {
        assertEquals(15, Calculadora.realizarOperacion(3, 5, "*")); //3*5 = 15
        assertEquals(0, Calculadora.realizarOperacion(7, 0, "*"));
        assertEquals(-6, Calculadora.realizarOperacion(2, -3, "*"));
        assertEquals(7, Calculadora.realizarOperacion(7, 1, "*"));
        assertEquals(25, Calculadora.realizarOperacion(-5, -5, "*")); //Verificar negativos
    }

    @Test
    public void testRealizarOperacion_division() {
        assertEquals(2, Calculadora.realizarOperacion(10, 5, "/"));
        assertEquals(1, Calculadora.realizarOperacion(1, 1, "/"));
        assertEquals(1, Calculadora.realizarOperacion(4, 4, "/"));
        assertEquals(0, Calculadora.realizarOperacion(25, 320, "/")); //Como es un int no permite decimales entonces es cero
        assertThrows(ArithmeticException.class, () -> Calculadora.realizarOperacion(320, 0, "/")); // Division por cero
    }
    @Test
    public void testConvertirADestino_binario() {
        assertEquals("101", Calculadora.convertirADestino(5, 0));
        assertEquals("10100", Calculadora.convertirADestino(20, 0));
        assertEquals("11111111111111111111111111111110", Calculadora.convertirADestino(-2, 0)); //Saca el complemento a 2
    }

    @Test
    public void testConvertirADestino_octal() {
        assertEquals("71", Calculadora.convertirADestino(57, 1));
        assertEquals("52", Calculadora.convertirADestino(42, 1)); 
        assertEquals("37777777775", Calculadora.convertirADestino(-3, 1)); //Complemento a dos del número -3 en base octal.
    }

}
