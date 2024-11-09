package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRachel {
    // Primer metodo  convertirNumero
    @Test
    public void testConvertirNumero_Decimal() {
        assertEquals(10, Calculadora.convertirNumero("10", 2));   // 10 en decimal es 10
        assertEquals(123, Calculadora.convertirNumero("123", 2)); // 123 en decimal es 123
        assertEquals(-1, Calculadora.convertirNumero("12a", 2));  // Número decimal inválido
    }

    @Test
    public void testConvertirNumero_Hexadecimal() {
        assertEquals(255, Calculadora.convertirNumero("FF", 3));  // FF en hexadecimal es 255
        assertEquals(16, Calculadora.convertirNumero("10", 3));   // 10 en hexadecimal es 16
        assertEquals(-1, Calculadora.convertirNumero("G1", 3));   // Número hexadecimal inválido
    }
    // Segundo metodo realizarOperacion
    @Test
    public void testRealizarOperacion_Suma() {
        assertEquals(10, Calculadora.realizarOperacion(7, 3, "+"));  // 7 + 3 = 10
        assertEquals(0, Calculadora.realizarOperacion(-5, 5, "+"));  // -5 + 5 = 0
        assertEquals(-2, Calculadora.realizarOperacion(-1, -1, "+")); // -1 + -1 = -2
    }

    @Test
    public void testRealizarOperacion_Resta() {
        assertEquals(4, Calculadora.realizarOperacion(7, 3, "-"));  // 7 - 3 = 4
        assertEquals(10, Calculadora.realizarOperacion(5, -5, "-")); // 5 - (-5) = 10
        assertEquals(0, Calculadora.realizarOperacion(-1, -1, "-")); // -1 - (-1) = 0
    }
    // Tercer metodo  convertirADestino
    @Test
    public void testConvertirADestino_Decimal() {
        assertEquals("10", Calculadora.convertirADestino(10, 2));      // 10 en decimal es 10
        assertEquals("123", Calculadora.convertirADestino(123, 2));    // 123 en decimal es 123
        assertEquals("0", Calculadora.convertirADestino(0, 2));        // 0 en decimal es 0
    }

    @Test
    public void testConvertirADestino_Hexadecimal() {
        assertEquals("ff", Calculadora.convertirADestino(255, 3));    // 255 en hexadecimal es ff
        assertEquals("10", Calculadora.convertirADestino(16, 3));     // 16 en hexadecimal es 10
        assertEquals("0", Calculadora.convertirADestino(0, 3));       // 0 en hexadecimal es 0
    }
}
