package com.br.javatestes;

public class Main {
    public static boolean isOdd(double number){
        // Verifica se numero é ímpar
        if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public static String helloName(String name){
        if (name.equals("")){
            return "Hello Anonymous";
        }
        return "Hello "+name;

    }

    public static int somarNumeros(int... numeros){
        int sum = 0;

        if (numeros == null){
            return 0;
        }

        if (numeros.length == 1){
            return numeros[0];
        }

        for (int numero:numeros){
            sum+=numero;
        }
        return sum;
    }

    public static void main(String[] args) {
    }
}
