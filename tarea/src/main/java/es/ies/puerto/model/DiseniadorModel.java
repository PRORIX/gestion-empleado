package es.ies.puerto.model;

public class DiseniadorModel extends EmpleadoModel{

    /**
     * Constructor vacío
     */
    public DiseniadorModel() {
    }

    /**
     * Constructor con la clave primaria
     * @param id del diseniador
     */
    public DiseniadorModel(String id){
        super.id = id;
    }

    /**
     * Constructor con parámetros
     * @param id del diseniador
     * @param nombre del diseniador
     * @param edad del diseniador
     * @param salarioBase del diseniador
     */
    public DiseniadorModel(String id, String nombre, int edad, double salarioBase) {
        super.id = id;
        super.nombre = nombre;
        super.edad = edad;
        super.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + getSalarioBase()*0.10;
    }
    
}
