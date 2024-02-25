package es.IoC;

public class JefeEmpleado implements Empleado{

    private CreacionInforme informeNuevo;

    public JefeEmpleado(CreacionInforme informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestiono las cuestiones relativas a mis empleados de seccion.";
    }

    @Override
    public String getInforme() {
        return "Informe Presentado por el Jefe con arreglos: " + informeNuevo.getInforme();
    }
}
