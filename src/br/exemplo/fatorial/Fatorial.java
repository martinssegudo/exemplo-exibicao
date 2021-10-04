package br.exemplo.fatorial;

public class Fatorial {

    public static double returnFatorial(int numeroFatorial){
        if(numeroFatorial <= 1)
            return 1;
        return numeroFatorial*returnFatorial(numeroFatorial-1);
    }

    public static double divisao(int numeroFatorial){
        if(numeroFatorial <= 1)
            return 1;
        return 1/Fatorial.returnFatorial(numeroFatorial)+1/Fatorial.returnFatorial(numeroFatorial-1);
    }

    public static void main(String [] args){
        double resultado = 0;
        resultado += Fatorial.divisao(5);
        System.out.println(resultado);
    }
}
