package br.com.escola;

public class Professor implements Aumento {

    @Override
    public void calculaAumento(Profissional profissional) {
        if (profissional.getCargo().equals("Professor")) {
            double aumento = (profissional.getSalario() * 0.3) + profissional.getSalario();
            profissional.setSalario(aumento);
        }
        System.out.println(profissional);
    }
}
