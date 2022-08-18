package model;

public class Filial {
    private int id;
    private String nome;
    private String rua;
    private String numerorua;
    private String cidade;
    private String estado;
    private boolean cincoeEstrelas;

    public Filial(String nome, String rua, String numerorua, String cidade, String estado, boolean cincoeEstrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numerorua = numerorua;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoeEstrelas = cincoeEstrelas;
    }

    public Filial(int id, String nome, String rua, String numerorua, String cidade, String estado, boolean cincoeEstrelas) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numerorua = numerorua;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoeEstrelas = cincoeEstrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumerorua() {
        return numerorua;
    }

    public void setNumerorua(String numerorua) {
        this.numerorua = numerorua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isCincoeEstrelas() {
        return cincoeEstrelas;
    }

    public void setCincoe_strelas(boolean cincoeEstrelas) {
        this.cincoeEstrelas = cincoeEstrelas;
    }

    @Override
    public String toString() {
        if (cincoeEstrelas) {
            String classificacao = "Cinco Estrelas";

            return "Filial{" +
                    "id=" + id +
                    ", nome=" + nome +
                    ", rua=" + rua +
                    ", nº=" + numerorua +
                    ", cidade=" + cidade +
                    ", estado=" + estado +
                    ", classificação=" + classificacao + '}';
        } else {
            String classificacao = "Regular";

            return "Filial{" +
                    "id=" + id +
                    ", nome=" + nome +
                    ", rua=" + rua +
                    ", nº=" + numerorua +
                    ", cidade=" + cidade +
                    ", estado=" + estado +
                    ", classificação=" + classificacao + '}';
        }
    }
}
