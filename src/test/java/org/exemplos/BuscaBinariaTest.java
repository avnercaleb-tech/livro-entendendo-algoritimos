package org.exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {

    @Test
    public void valida_algotiritmo() {
        int[] numsValidos = {1, 3, 5, 7, 9, 11, 15};
        int[] numsInvalidos = {2, 4, 6, 8, 10, 12};

        for(int i : numsValidos) {
            assertTrue(buscaBinaria(numsValidos, i));
        }

        for(int i : numsInvalidos) {
            assertFalse(buscaBinaria(numsValidos, i));
        }
    }

    static boolean buscaBinaria(int[] nums, int numeroProcurado) {
        int comeco = 0;
        int fim = nums.length - 1;

        while(comeco <= fim) {
            int meio = (comeco + fim) / 2;

            if(numeroProcurado == nums[meio]) {
                return true;
            } else if (numeroProcurado > nums[meio]) {
                comeco = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return false;
    }
}