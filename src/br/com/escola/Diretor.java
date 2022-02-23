package br.com.escola;

public class Diretor implements Aumento {

    @Override
    public void calculaAumento(Profissional profissional) {
        if (profissional.getCargo().equals("Diretor")) {
            double aumento = (profissional.getSalario() * 0.45) + profissional.getSalario();
            profissional.setSalario(aumento);
        }
        System.out.println(profissional);
    }
}
