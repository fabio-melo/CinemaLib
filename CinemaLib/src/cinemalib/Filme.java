package cinemalib;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia o formato da biblioteca
 */
public class Filme {
    private String Nome;
    private List<String> Categorias = new ArrayList<>();
    private int Ano_Prod;
    private String País_Prod;
    private String Cidade_Prod;
    private String Estado_Prod;
    private int Ano_Lançamento;
    private String Pais_Lançamento;
    private String Sinopse;
    private String Gênero;
    private String Prêmios;
    private List<String> Atores = new ArrayList<>();
    private int Duração_Minutos;
    private String Direção;
    private String Roteiro;
    private String Escritor;
    private String Classificação_Etaria;
    private Path Poster;

    
    
    /* Contrutor Padrão */

    public Filme(String Nome, int Ano_Prod, String País_Prod, String Cidade_Prod, String Estado_Prod, int Ano_Lançamento, String Pais_Lançamento, String Sinopse, String Gênero, String Prêmios, int Duração_Minutos, String Direção, String Roteiro, String Escritor, String Classificação_Etaria, Path Poster) {
        this.Nome = Nome;
        this.Ano_Prod = Ano_Prod;
        this.País_Prod = País_Prod;
        this.Cidade_Prod = Cidade_Prod;
        this.Estado_Prod = Estado_Prod;
        this.Ano_Lançamento = Ano_Lançamento;
        this.Pais_Lançamento = Pais_Lançamento;
        this.Sinopse = Sinopse;
        this.Gênero = Gênero;
        this.Prêmios = Prêmios;
        this.Duração_Minutos = Duração_Minutos;
        this.Direção = Direção;
        this.Roteiro = Roteiro;
        this.Escritor = Escritor;
        this.Classificação_Etaria = Classificação_Etaria;
        this.Poster = Poster;
    }
    



    /**
     * Utilizamos a interface List para flexibilizar a implementação e permitir modificações caso necessário
     * utilizando path para viabilizar o uso de Posters para os filmes
     */

 
    //Getters e Setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<String> getCategorias() {
        return Categorias;
    }

    public void setCategorias(List<String> Categorias) {
        this.Categorias = Categorias;
    }

    public int getAno_Prod() {
        return Ano_Prod;
    }

    public void setAno_Prod(int Ano_Prod) {
        this.Ano_Prod = Ano_Prod;
    }

    public String getPaís_Prod() {
        return País_Prod;
    }

    public void setPaís_Prod(String País_Prod) {
        this.País_Prod = País_Prod;
    }

    public String getCidade_Prod() {
        return Cidade_Prod;
    }

    public void setCidade_Prod(String Cidade_Prod) {
        this.Cidade_Prod = Cidade_Prod;
    }

    public String getEstado_Prod() {
        return Estado_Prod;
    }

    public void setEstado_Prod(String Estado_Prod) {
        this.Estado_Prod = Estado_Prod;
    }

    public int getAno_Lançamento() {
        return Ano_Lançamento;
    }

    public void setAno_Lançamento(int Ano_Lançamento) {
        this.Ano_Lançamento = Ano_Lançamento;
    }

    public String getPais_Lançamento() {
        return Pais_Lançamento;
    }

    public void setPais_Lançamento(String Pais_Lançamento) {
        this.Pais_Lançamento = Pais_Lançamento;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public void setSinopse(String Sinopse) {
        this.Sinopse = Sinopse;
    }

    public String getGênero() {
        return Gênero;
    }

    public void setGênero(String Gênero) {
        this.Gênero = Gênero;
    }

    public String getPrêmios() {
        return Prêmios;
    }

    public void setPrêmios(String Prêmios) {
        this.Prêmios = Prêmios;
    }

    public List<String> getAtores() {
        return Atores;
    }

    public void setAtores(List<String> Atores) {
        this.Atores = Atores;
    }

    public String getDireção() {
        return Direção;
    }

    public void setDireção(String Direção) {
        this.Direção = Direção;
    }

    public String getRoteiro() {
        return Roteiro;
    }

    public void setRoteiro(String Roteiro) {
        this.Roteiro = Roteiro;
    }

    public String getEscritor() {
        return Escritor;
    }

    public void setEscritor(String Escritor) {
        this.Escritor = Escritor;
    }

    public String getClassificação_Etaria() {
        return Classificação_Etaria;
    }

    public void setClassificação_Etaria(String Classificação_Etaria) {
        this.Classificação_Etaria = Classificação_Etaria;
    }

    public int getDuração_Minutos() {
        return Duração_Minutos;
    }

    public void setDuração_Minutos(int Duração_Minutos) {
        this.Duração_Minutos = Duração_Minutos;
    }

    public Path getPoster() {
        return Poster;
    }

    public void setPoster(Path Poster) {
        this.Poster = Poster;
    }

    @Override
    public String toString() {
        return "Filme{" + "Nome=" + Nome + 
                ", Categorias=" + Categorias + 
                ", Ano_Prod=" + Ano_Prod + 
                ", Pa\u00eds_Prod=" + País_Prod + 
                ", Cidade_Prod=" + Cidade_Prod + 
                ", Estado_Prod=" + Estado_Prod + 
                ", Ano_Lan\u00e7amento=" + Ano_Lançamento + 
                ", Pais_Lan\u00e7amento=" + Pais_Lançamento + 
                ", Sinopse=" + Sinopse + 
                ", G\u00eanero=" + Gênero + 
                ", Pr\u00eamios=" + Prêmios + 
                ", Atores=" + Atores + 
                ", Duração" + Duração_Minutos +
                "min, Dire\u00e7\u00e3o=" + Direção + 
                ", Roteiro=" + Roteiro + 
                ", Escritor=" + Escritor + 
                ", Classifica\u00e7\u00e3o_Etaria=" + Classificação_Etaria + '}';
    }


}