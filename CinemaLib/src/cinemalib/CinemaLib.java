package cinemalib;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 * Programa
 * @author Fabs
 * 
 * 
 */
public class CinemaLib {

    /**
     * Classe Principal do Aplicativo, utilizada para chamar a Interface Gráfico
     * e Instanciar os dados
*/
    
    
    
    public static void main(String[] args) {
        // Método Padrão
        // NOT READY //
        
        /*/DADOS DE TESTE
        List<Filme> listaFilmes = new ArrayList();
        Filme F1 = new Filme("Os Vingadores", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        Filme F2 = new Filme("Vingança do Mal", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        Filme F3 = new Filme("O FILME DO JOGO", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        Filme F4 = new Filme("Exterminador do Passado", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        
        listaFilmes.add(F1);
        listaFilmes.add(F2);
        listaFilmes.add(F3);
        listaFilmes.add(F4);
        // FIM DOS DADOS DE TESTE
        /*
        
        */
        /* for(Filme x: listaFilmes){
            System.out.println(x.getNome());
        }
        */
        
        
      TelaPrincipal t = new TelaPrincipal();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(870, 540);
        t.setVisible(true);
        
        
        
        
        
        
        
    }
}
   
   


