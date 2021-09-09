package GenerationTurma32.POO.ProdutoEletronico;

/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class Principal {

    public static void main(String[] args) {
      ProdutoEletronico micro_ondas = new ProdutoEletronico("Microondas Eletrolux",300.50,"25/10/2020","Eletrodomestico");
      micro_ondas.imprimirDados();
    }
}
