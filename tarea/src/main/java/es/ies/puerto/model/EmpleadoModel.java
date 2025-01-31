package es.ies.puerto.model;
import java.util.Objects;

public abstract class EmpleadoModel {
    String id;
    String nombre;
    int edad;
    double salarioBase;


    /**
     * Constructor vacío
     */
    public EmpleadoModel() {
    }

    /**
     * Constructor con la clave primaria
     * @param id del empleado
     */
    public EmpleadoModel(String id){
        this.id = id;
    }


    /**
     * Constructor con parámetros
     * @param id del empleado
     * @param nombre del empleado
     * @param edad del empleado
     * @param salarioBase del empleado
     */
    public EmpleadoModel(String id, String nombre, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    
    // Getters y Setters


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }

    /**
     * Metodo equals
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmpleadoModel)) {
            return false;
        }
        EmpleadoModel empleadoModel = (EmpleadoModel) o;
        return Objects.equals(id, empleadoModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad, salarioBase);
    }
    


    /**
     * Metodo para calcular el salario final de cualquier empleado
     * @return salario final
     */
    public abstract double calcularSalarioFinal();
}