package entity;

public class Usuario {

     private int codigo;
     private String id;
     private String nome;
     private String idade;
     private String telefone;
     private String setor;
     private String vacinas;

    public int getCodigo(){
        return codigo; 
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

        public String getIdade(){
        return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }

        public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

      public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }

          public String getVacinas(){
        return vacinas;
    }
    public void setVacinas(String vacinas){
        this.vacinas = vacinas;
    }
    

}
