package org.exemplos;
public class BuscaBinaria {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 15};

        for(int i : a)
            System.out.println(buscaBinaria(a, i));
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