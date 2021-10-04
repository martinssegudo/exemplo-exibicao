package br.exemplo.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysExplorer {

    public static void main(String[] args) {
        List<Aluno> listaAlunoList = new ArrayList<>();



        List<Presenca> presencas = new ArrayList<>();
        Presenca presenca = new Presenca("01/01/2021",true);
        presencas.add(presenca);

        presenca = new Presenca("02/01/2021", false);
        presencas.add(presenca);

        presenca = new Presenca("03/01/2021", true);
        presencas.add(presenca);

        Aluno aluno = new Aluno("Luiz Segundo", presencas);
        listaAlunoList.add(aluno);


        List<String> todasAsDatas = new ArrayList<>();
        for (Aluno alunoLista :listaAlunoList) {
            for (Presenca presenca1:alunoLista.getPresencas()) {
                if(!todasAsDatas.contains(presenca1.getData())){
                    todasAsDatas.add(presenca1.getData());
                }
            }
        }

        int count = 0;
        for (String data :todasAsDatas) {
            if(count == 0){
                System.out.print("Nome do aluno "+data);
                count++;
            }else{
                System.out.print(" "+data);
            }
        }

        System.out.println();

        for (Aluno alunoRenderizado:listaAlunoList) {
            System.out.print(alunoRenderizado.getNome()+" ");
            for (String data :todasAsDatas) {
                String presencaEncontrada = "";
                for (Presenca presencaAluno :alunoRenderizado.getPresencas()) {
                    if(data.equals(presencaAluno.getData())){
                        presencaEncontrada = presencaAluno.isPresente()?"Presente ":"Falta ";
                        break;
                    }
                    presencaEncontrada = "Falta ";
                }
                System.out.print(presencaEncontrada);
            }
        }
        System.out.println();
    }
}
