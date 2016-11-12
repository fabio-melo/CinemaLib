/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemalib;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Fabs
 */
public class CinemaLib {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // Dados de Teste
/*        List<Filme> listaFilmes = new ArrayList();
        Filme Vingadores = new Filme("Os Vingadores", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        Filme VingançadoMal = new Filme("Vingança do Mal", 2012,"Estados Unidos","New York","NY",2012,"Estados Unidos","Uma Vingança muito vingativa", "Ação","Oscar 2013",150,"Josh Whedon", "John Gruber","Finn Jones","Livre", null); 
        
        listaFilmes.add(Vingadores);
        listaFilmes.add(VingançadoMal);
        
        for(int i=0; i < listaFilmes.size(); i++){
        System.out.print(listaFilmes.get(i));
        System.out.println("\n");
        
      */
      TelaPrincipal t = new TelaPrincipal();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(870, 540);
        t.setVisible(true);
        
        
        
        
        
        
        
        
    }
}
   
   


