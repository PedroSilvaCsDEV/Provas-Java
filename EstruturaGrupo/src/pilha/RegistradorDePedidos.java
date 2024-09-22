package pilha;

public class RegistradorDePedidos {

    private String codigo;
    private String data;
    private String pais;

    public RegistradorDePedidos(String codigo, String data, String pais) {
        this.codigo = codigo;
        this.data = data;
        this.pais = pais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}