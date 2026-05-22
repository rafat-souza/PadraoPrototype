package SoftwareCAD;

public class ConjuntoMecanico implements Cloneable {

    private int codigoProjeto;
    private String nomePeca;
    private Material materialPrincipal;
    private String setorAplicacao;

    public ConjuntoMecanico(int codigoProjeto, String nomePeca, Material materialPrincipal, String setorAplicacao) {
        this.codigoProjeto = codigoProjeto;
        this.nomePeca = nomePeca;
        this.materialPrincipal = materialPrincipal;
        this.setorAplicacao = setorAplicacao;
    }

    public int getCodigoProjeto() {
        return codigoProjeto;
    }

    public void setCodigoProjeto(int codigoProjeto) {
        this.codigoProjeto = codigoProjeto;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public Material getMaterialPrincipal() {
        return materialPrincipal;
    }

    public void setMaterialPrincipal(Material materialPrincipal) {
        this.materialPrincipal = materialPrincipal;
    }

    public String getSetorAplicacao() {
        return setorAplicacao;
    }

    public void setSetorAplicacao(String setorAplicacao) {
        this.setorAplicacao = setorAplicacao;
    }

    @Override
    public ConjuntoMecanico clone() throws CloneNotSupportedException {
        ConjuntoMecanico conjuntoClone = (ConjuntoMecanico) super.clone();
        conjuntoClone.materialPrincipal = (Material) conjuntoClone.materialPrincipal.clone();
        return conjuntoClone;
    }

    @Override
    public String toString() {
        return "ConjuntoMecanico{" +
                "codigoProjeto=" + codigoProjeto +
                ", nomePeca='" + nomePeca + '\'' +
                ", materialPrincipal=" + materialPrincipal +
                ", setorAplicacao='" + setorAplicacao + '\'' +
                '}';
    }

}
