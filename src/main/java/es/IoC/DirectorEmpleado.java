package es.IoC;

public class DirectorEmpleado implements Empleado {
    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }
}
