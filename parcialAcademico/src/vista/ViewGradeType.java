package vista;

import Interface.IMostrarMensaje;
import modelo.GradeType;

import java.util.List;


public class ViewGradeType implements IMostrarMensaje {
    public void  displayListGradeTypes( List<GradeType> gradeTypes) {
        System.out.println(" == Tipo de grados ==");
        for(GradeType gradeType : gradeTypes) {
            System.out.println("id grado " + gradeType.getId() + ", Nombre " + gradeType.getName() + ", Weight " + gradeType.getWeight());
        }
    }
}