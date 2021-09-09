package GenerationTurma32.POO.Class_Cliente;

/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marcela", "48022060892", "5671-92530", "email@email.com");
        cliente.ImprimirDados();
    }
}
