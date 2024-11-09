package com.example.examen2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEncuentra {

    @Test
    public void testEncuentraElementoExistente() {
        int[] lista = {1, 2, 3, 4, 5};
        int elemento = 3;
        assertTrue(Calculadora.Encuentra(lista, elemento)); // Se espera true porque 3 está en la lista
    }
    @Test
    public void testElementosRepetidos() {
        int[] lista = {1, 2, 5, 3, 5,20,3,3,3,2};
        int elemento = 3;
        assertTrue(Calculadora.Encuentra(lista, elemento)); // Se espera true porque 3 está en la lista
    }

    // Caso 2: Elemento no encontrado
    @Test
    public void testEncuentraElementoNoExistente() {
        int[] lista = {1, 2, 3, 4, 5};
        int elemento = 6;
        assertFalse(Calculadora.Encuentra(lista, elemento)); // Se espera false porque 6 no está en la lista
    }

    @Test
    public void testListaVacia() {
        int[] lista = {};
        int elemento = 1;
        assertFalse(Calculadora.Encuentra(lista, elemento)); // Se espera false porque la lista está vacía
    }

    // Caso 4: Lista con un solo elemento (elemento existente)
    @Test
    public void testListaUnElementoExistente() {
        int[] lista = {5};
        int elemento = 5;
        assertTrue(Calculadora.Encuentra(lista, elemento)); // Se espera true porque el único elemento es 5
    }

    // Caso 5: Lista con un solo elemento (elemento no existente)
    @Test
    public void testListaUnElementoNoExistente() {
        int[] lista = {5};
        int elemento = 3;
        assertFalse(Calculadora.Encuentra(lista, elemento)); // Se espera false porque el único elemento es 5, no 3
    }
}
