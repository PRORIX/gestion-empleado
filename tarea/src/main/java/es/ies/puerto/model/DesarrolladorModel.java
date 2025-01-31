package es.ies.puerto.model;

public class DesarrolladorModel extends EmpleadoModel{

    /**
     * Constructor vacío
     */
    public DesarrolladorModel() {
    }

    /**
     * Constructor con la clave primaria
     * @param id del desarrollador
     */
    public DesarrolladorModel(String id){
        super.id = id;
    }

    /**
     * Constructor con parámetros
     * @param id del desarrollador
     * @param nombre del desarrollador
     * @param edad del desarrollador
     * @param salarioBase del desarrollador
     */
    public DesarrolladorModel(String id, String nombre, int edad, double salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + getSalarioBase()*0.20;
    }
    
}
