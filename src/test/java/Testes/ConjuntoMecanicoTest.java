package Testes;

import SoftwareCAD.ConjuntoMecanico;
import SoftwareCAD.Material;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class ConjuntoMecanicoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Material materialOriginal = new Material("Aço Inox", 500);
        ConjuntoMecanico conjuntoOriginal = new ConjuntoMecanico(101, "Engrenagem", materialOriginal, "Automotivo");

        ConjuntoMecanico conjuntoClone = conjuntoOriginal.clone();

        assertNotSame(conjuntoOriginal, conjuntoClone);
        assertNotSame(conjuntoOriginal.getMaterialPrincipal(), conjuntoClone.getMaterialPrincipal());

        assertEquals(conjuntoOriginal.getCodigoProjeto(), conjuntoClone.getCodigoProjeto());
        assertEquals(conjuntoOriginal.getNomePeca(), conjuntoClone.getNomePeca());
        assertEquals(conjuntoOriginal.getSetorAplicacao(), conjuntoClone.getSetorAplicacao());

        assertEquals(conjuntoOriginal.getMaterialPrincipal().getTipo(), conjuntoClone.getMaterialPrincipal().getTipo());
        assertEquals(conjuntoOriginal.getMaterialPrincipal().getResistencia(), conjuntoClone.getMaterialPrincipal().getResistencia());

        conjuntoClone.setNomePeca("Engrenagem Modificada");
        conjuntoClone.getMaterialPrincipal().setTipo("Titânio");
        conjuntoClone.getMaterialPrincipal().setResistencia(900);

        assertEquals("Engrenagem", conjuntoOriginal.getNomePeca());
        assertEquals("Aço Inox", conjuntoOriginal.getMaterialPrincipal().getTipo());
        assertEquals(500, conjuntoOriginal.getMaterialPrincipal().getResistencia());

        assertEquals("Engrenagem Modificada", conjuntoClone.getNomePeca());
        assertEquals("Titânio", conjuntoClone.getMaterialPrincipal().getTipo());
        assertEquals(900, conjuntoClone.getMaterialPrincipal().getResistencia());
    }

}
