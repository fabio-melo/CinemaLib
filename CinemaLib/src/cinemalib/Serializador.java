package cinemalib;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Linguagem de Programação 1 - Projeto Final
 * @author Alielson Ferreira, Fábio Melo, Gabriel Augusto, Yuri Felix
 * Serializador.java - Classe de escrita/serialização
 */

public class Serializador {
 
    public Serializador() {    }
     
    public void serializar(String path, Object obj) throws Exception {
            FileOutputStream outFile = new FileOutputStream(path);
    ObjectOutputStream s = new ObjectOutputStream(outFile);
    s.writeObject(obj);
    s.close();
    }
}
