package cinemalib;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Linguagem de Programação 1 - Projeto Final
 * @author Alielson, Fábio Melo, Gabriel, Yuri Felix
 * Deserializador.java - Classe que lê objetos serializados
 */
 
public class Deserializador {
 
    public Deserializador() {    }
     
    public Object deserializar(String path) throws Exception {
    FileInputStream inFile = new FileInputStream(path);
    ObjectInputStream d = new ObjectInputStream(inFile);
    Object o = d.readObject();
    d.close();
    return o;
    }
}
