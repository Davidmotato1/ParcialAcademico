package vista;

import Interface.IMostrarMensaje;
import modelo.Enrollment;

import java.util.List;



public class ViewEnrollment implements IMostrarMensaje {
    public void displayListEnrollments( List<Enrollment> enrollments ) {
        System.out.println(" == Lista de inscripcion ==");
        for(Enrollment enrollment : enrollments) {
            System.out.println("id inscripcion " + enrollment.getId() + ", student id " + enrollment.getStudentId() + ", Course id " + enrollment.getCourseId());
        }
    }


}