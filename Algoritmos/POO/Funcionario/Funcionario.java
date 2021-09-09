package GenerationTurma32.Algoritmos.POO.Funcionario;

/*

4) Crie uma classe funcionário e apresente os atributos e métodos
   referentes esta classe, em seguida crie um objeto funcionário, defina as
   instancias deste objeto e apresente as informações deste objeto no
   console.

   */

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;

    public Funcionario(String nome,String cpf, double salario, String cargo){

        setNome(nome);
        setCPF(cpf);
        setSalario(salario);
        setCargo(cargo);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimirDadosFuncionario(){

        System.out.println("O nome do funcionário é: " + getNome());
        System.out.println("O CPF do funcionário é: " + getCPF());
        System.out.println("O salario do funcionário é: " + getSalario());
        System.out.println("O cargo do funcionário é: " + getCargo());



    }
}
