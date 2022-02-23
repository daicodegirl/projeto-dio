# Escola

## Pessoa
- Crie uma classe Pessoa com os atributos abaixo:
  - String nome;
  - int idade;
  - String sexo;
  - String telefone;

## Aluno
- Crie uma classe Aluno que herde os atributos de Pessoa e tenha os seguintes atributos:
  - String ra;
  - String serie;

## Profissional
- Crie uma classe Professor que herde os atributos de Pessoa e tenha os seguintes atributos:
  - double salario;
  - String cargo;


## Funcionamentos
- Cria uma interface chamada Aumento com um método do tipo void que calcule o aumento dos profissionais;
- Esse método deverá seguir a seguinte regra:
  - Se o profissional for professor, deverá ser aplicado 30% de aumento;
  - Se o profissional for diretor, deverá ser aplicado 45% de aumento;
- A implementação desses métodos deverão ser feitas em 2 classes separadas: Professor e Diretor 