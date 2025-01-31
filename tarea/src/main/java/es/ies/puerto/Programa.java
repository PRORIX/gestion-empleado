package es.ies.puerto;

import es.ies.puerto.model.DesarrolladorModel;
import es.ies.puerto.model.DiseniadorModel;
import es.ies.puerto.model.GerenteModel;

public class Programa {
    public static void main(String[] args) {
        DesarrolladorModel desarrollador = new DesarrolladorModel("ABC00", "Carlos", 30, 3000);
        DiseniadorModel diseniador = new DiseniadorModel("ABC02", "Ana", 28, 2500);
        GerenteModel gerente = new GerenteModel("ABC03", "Luis", 40, 5000);
        System.out.println(desarrollador);
        System.out.println(desarrollador.calcularSalarioFinal());
        System.out.println(diseniador);
        System.out.println(diseniador.calcularSalarioFinal());
        System.out.println(gerente);
        System.out.println(gerente.calcularSalarioFinal());
    }
}
