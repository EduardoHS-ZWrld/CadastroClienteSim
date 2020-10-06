package tarefacadastro.pkg05.pkg10;
public class Pessoa {
    //Atributos
    //--------------------------------------------------------------------------
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String endereço;
    //--------------------------------------------------------------------------
    
    //Contruct
    //--------------------------------------------------------------------------
    public Pessoa(String nm, String cpf, int idd, String sx, String end) {
        this.nome = nm;
        this.cpf = cpf;
        this.idade = idd;
        this.sexo = sx;
        this.endereço = end;
    }
    //--------------------------------------------------------------------------

    //Métodos especiais
    //--------------------------------------------------------------------------   
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
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

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String end) {
        this.endereço = end;
    }
    //--------------------------------------------------------------------------
}
