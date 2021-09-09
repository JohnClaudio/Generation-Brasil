package GenerationTurma32.POO.Class_Cliente;

public class Cliente
{
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

   public Cliente(String nome, String cpf, String telefone, String email)
   {
       setCpf(cpf);
       setEmail(email);
       setNome(nome);
       setTelefone(telefone);
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ImprimirDados()
    {
        System.out.println("Nome do cliente: " +  getNome());
        System.out.println("CPF do cliente: " +  getCpf());
        System.out.println("Telefone do cliente: " +  getTelefone());
        System.out.println("Email do cliente: " +  getEmail());
    }
}
