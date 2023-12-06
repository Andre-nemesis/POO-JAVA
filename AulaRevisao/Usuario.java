package AulaRevisao;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    
    private ArrayList<Livro> livro = new ArrayList<Livro>();
    
    public void setNomeUsuario(String nome) {this.nome=nome;}
    public void setIdUsuario(int id) {this.id=id;}
    
    public String getNomeUsuario() {return this.nome;}
    public int getIdUsuraio() {return this.id;}
 
    public void emprestarLivro(Livro liv) {
        this.livro.add(liv);
    }

    public void devolverLivro(Livro liv) {
        this.livro.remove(liv);
    }
    
    public void infoUsuario() {
        System.out.println("\nInformações do Usuário:\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.print("Livro em Empréstimo: ");
        for (Livro  liv : livro) System.out.print(liv.getTitulo()+", ");
    }

}
