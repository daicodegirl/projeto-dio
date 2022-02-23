package br.com.escola;

public class Main {
    public static void main(String[] args) {
        Profissional caio = new Profissional();
        Profissional daiane = new Profissional();

        caio.setNome("Caio");
        caio.setIdade(28);
        caio.setCargo("Professor");
        caio.setSalario(1000.00);

        //1300
        Professor professor = new Professor();
        professor.calculaAumento(caio);

        daiane.setNome("Dai");
        daiane.setIdade(29);
        daiane.setSalario(2300.00);
        daiane.setCargo("Diretor");

        //3335
        Diretor diretor = new Diretor();
        diretor.calculaAumento(daiane);

    }
}
