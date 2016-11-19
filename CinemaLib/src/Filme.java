//package TESTE;
import java.io.*;

import java.util.*;

/**
 * Linguagem de Programação 1 - Projeto Final
 * @author Alielson, Fábio Melo, Gabriel, Yuri Felix
 * Filme.java - Classe que gerencia o Objeto Filme
 */

public class Filme implements Serializable {
    private String Nome;
    private ArrayList<String> Categorias;
    private String Material_Original;
    private Localizacao Producao;
    private Localizacao Lancamento;
    private String Sinopse;
    private String Genero;
    private String Premios;
    private ArrayList<NomeRegistro> Elenco;
    
    private String Direcao;

    //Mini-subclasses genéricas para lidar com campos Específicos //
    public static class NomeRegistro{
        // Objeto para o Array de Filmes e Diretor
        private String Nome;
        private String Registro_Artistico;

        public NomeRegistro(String Nome, String Registro_Artistico) {
            this.Nome = Nome;
            this.Registro_Artistico = Registro_Artistico;
        }

        public String getNome() {
            return Nome;
        }

        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        public String getRegistro_Artistico() {
            return Registro_Artistico;
        }

        public void setRegistro_Artistico(String Registro_Artistico) {
            this.Registro_Artistico = Registro_Artistico;
        }

        @Override
        public String toString() {
            return "Nome:" + Nome + ", Registro Artístico:" + Registro_Artistico + '}';
        }
        
        
    }
    public static class Localizacao{
        private int Ano;
        private String Pais;
        private String Cidade;
        private String Estado;

        public int getAno() {
            return Ano;
        }
        
        public void setAno(int Ano) throws IllegalArgumentException {
            // Verifica se a data é Válida //
            if (Ano > 2100 || Ano < 1800) { throw new IllegalArgumentException("Ano Inválido"); }
            this.Ano = Ano;
        }

        public String getPais() {
            return Pais;
        }

        public void setPais(String Pais) {
            this.Pais = Pais;
        }

        public String getCidade() {
            return Cidade;
        }

        public void setCidade(String Cidade) {
            this.Cidade = Cidade;
        }

        public String getEstado() {
            return Estado;
        }

        public void setEstado(String Estado) {
            this.Estado = Estado;
        }

        @Override
        public String toString() {
            return "Ano:" + Ano + ", País:" + Pais + ", Cidade:" + Cidade + ", Estado:" + Estado + '}';
        }
        
        
        
    }
    
    // Construtor

    public Filme(String Nome, ArrayList<String> Categorias, String Material_Original, Localizacao Producao, Localizacao Lancamento, String Sinopse, String Genero, String Premios, ArrayList<NomeRegistro> Elenco, int Duracao_Minutos, String Direcao) {
        this.Nome = Nome;
        this.Categorias = Categorias;
        this.Material_Original = Material_Original;
        this.Producao = Producao;
        this.Lancamento = Lancamento;
        this.Sinopse = Sinopse;
        this.Genero = Genero;
        this.Premios = Premios;
        this.Elenco = Elenco;
        this.Direcao = Direcao;
    }
    //temp testar
    public Filme(String nome, String Material_Original){
        this.Nome = nome;
        this.Material_Original = Material_Original;
        
        
    }
    
    //Getters e Setters /

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        if (Nome.trim().length() == 0) //Verifica se o nome está vazio //
        {
           throw new IllegalArgumentException("O Nome não pode estar vazio");
        }
        this.Nome = Nome;
    }

    public String getMaterial_Original() {
        return Material_Original;
    }

    public void setMaterial_Original(String Material_Original) {
        this.Material_Original = Material_Original;
    }

    public Localizacao getProducao() {
        return Producao;
    }

    public void setProducao(Localizacao Producao) {
        this.Producao = Producao;
    }

    public Localizacao getLancamento() {
        return Lancamento;
    }

    public void setLancamento(Localizacao Lancamento) {
        this.Lancamento = Lancamento;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public void setSinopse(String Sinopse) {
        this.Sinopse = Sinopse;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPremios() {
        return Premios;
    }

    public void setPremios(String Premios) {
        this.Premios = Premios;
    }

    public String getDirecao() {
        return Direcao;
    }

    public void setDirecao(String Direcao) {
        this.Direcao = Direcao;
    }

    public ArrayList<String> getCategorias() {
        return Categorias;
    }

    public ArrayList<NomeRegistro> getElenco() {
        return Elenco;
    }

    public void setCategorias(ArrayList<String> Categorias) {
        this.Categorias = Categorias;
    }

    public void setElenco(ArrayList<NomeRegistro> Elenco) {
        this.Elenco = Elenco;
    }
    
    

    //Método ToString

    @Override
    public String toString() {
        return "Filme{" + "Nome=" + Nome + ", Categorias=" + Categorias + ", Material_Original=" + Material_Original + ", Producao=" + Producao + ", Lancamento=" + Lancamento + ", Sinopse=" + Sinopse + ", Genero=" + Genero + ", Premios=" + Premios + ", Elenco=" + Elenco + ", Direcao=" + Direcao + '}';
    }
    
    public String toStringBonita(){
        return  "\n Nome:" + Nome + 
                "\n Categorias:" + Categorias +
                "\n Material Original:" + Material_Original +
                "\n Produção:\n" + Producao.toString() +
                "\n Lançamento:\n" + Lancamento.toString() +
                "\n Gênero:" + Genero + 
                "\n Prêmios" + Premios + 
                "\n Elenco:\n" + Elenco + 
                " minutos \n Direção:\n" + Direcao + 
                "\n Sinopse:" + Sinopse; 

    }
 
}

    