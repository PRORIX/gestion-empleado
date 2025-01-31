package es.ies.puerto.model;

public class GerenteModel extends EmpleadoModel{

    /**
     * Constructor vacío
     */
    public GerenteModel() {
    }

    /**
     * Constructor con la clave primaria
     * @param id del gerente
     */
    public GerenteModel(String id){
        super.id = id;
    }

    /**
     * Constructor con parámetros
     * @param id del gerente
     * @param nombre del gerente
     * @param edad del gerente
     * @param salarioBase del gerente
     */
    public GerenteModel(String id, String nombre, int edad, double salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() + getSalarioBase()*0.30;
    }
    
}
