package cinemalib.bugado.temporario;
import cinemalib.Filme;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 * Linguagem de Programação 1 - Projeto Final
 * @author Alielson, Fábio Melo, Gabriel, Yuri Felix
 * Dados.java - Classe que gerencia a serialização de 
 * um Arraylist de objetos Filme e permite a leitura e escrita de arquivos.
 */


public class Dados {
    
    private ArrayList<Filme> filmes;
    
    
    // Constrói o Objeto Filmes

    public Dados() {
        filmes = new ArrayList<Filme>();
    }
    //usando polimorfismo para gerar 
    public Dados(ArrayList<Filme> listaFilmes){
        
        filmes = listaFilmes;
    }
    
    public void EscreveFilmesnoArquivo (String nomedoarquivo){
        try {
            PrintWriter escrita = new PrintWriter(nomedoarquivo);
            
            try {
                Iterator<Filme> it = filme.iterator();
                while (it.hasNext()){
                    Filme filme = it.next();
                    ArrayList<String> categorias = filme.getCategorias();
                    String nome = filme.getNome();
                    String materialoriginal = filme.getMaterial_Original();
                    Filme.Localizacao producao = filme.getProducao();
                    Filme.Localizacao lancamento = filme.getLancamento();
                    String sinopse = filme.getSinopse();
                    String genero = filme.getGenero();
                    String premios = filme.getPremios();
                    int duracao_min = filme.getDuracao_Minutos();
                    ArrayList<Filme.NomeRegistro> elenco = filme.getElenco();
                    Filme.NomeRegistro Diretor = filme.getDirecao();
                    
                    
                    String linhadesaida = "";
                    Iterator<String> itElenco = elenco.iterator();
                    int numeroElenco = 0;
                    while (itElenco.hasNext())
                    {
                        String ator = itElenco.next();
                        elenco = ator.concat(",");  // adiciona uma virgula no final do nome de cada ator na string //
                        linhadesaida = linhadesaida.concat(ator);  // add the actor to all the others to be written to file
                        numeroElenco++;
                    }
                    // We know there can be only 3 actors so for the number of actors that were not in the object 
                    // add commas to ensure format of saving movie information to file is kept
                    for (int i = 0; i < (elenco.size()-numeroElenco); i++)
                    {
                        linhadesaida = linhadesaida.concat(",");
                    }
                    
                    escrita.write(nome+","+categorias+","+materialoriginal+","+producao+lancamento);
                                         }
            }
            finally
            {
                escrita.close();
            }
            
        } 
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null,"Erro de I/O");
        
    }
    
    
    
}
    
}
