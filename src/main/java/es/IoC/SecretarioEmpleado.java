package es.IoC;

public class SecretarioEmpleado implements Empleado {
    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
