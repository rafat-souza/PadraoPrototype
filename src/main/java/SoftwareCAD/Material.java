package SoftwareCAD;

public class Material implements Cloneable {

    private String tipo;
    private Integer resistencia;

    public Material(String tipo, Integer resistencia) {
        super();
        this.tipo = tipo;
        this.resistencia = resistencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Material{" +
                "tipo='" + tipo + '\'' +
                ", resistencia=" + resistencia +
                '}';
    }

}
