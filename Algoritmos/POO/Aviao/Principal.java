package GenerationTurma32.Algoritmos.POO.Aviao;


/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Principal {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("XYAKL4","LEHMOX","26/10/2015","BRANCO",3000.0);
        aviao.imprimirDados();
    }
}
