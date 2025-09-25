
package ComputadoraPlacaPropietario;


public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario; 

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        if (placaMadre == null) {
            throw new IllegalArgumentException("La placa madre es obligatoria");
        }
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computadora{" +"marca='" + marca + '\'' +", numeroSerie='" + numeroSerie + '\'' +", placaMadre=" + placaMadre + ", propietario=" + (propietario != null ? propietario.getNombre() : "null") + '}';
    }
}
