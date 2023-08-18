package nuevoexample;

public class empleado extends persona{
    private int diastrabajados;
    private float sueldo;

    public int getDiastrabajados() {
        return diastrabajados;
    }

    public void setDiastrabajados(int diastrabajados) {
        this.diastrabajados = diastrabajados;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public float calcularsueldo(){
        float sueldoganado = diastrabajados * sueldo;
        return  sueldoganado;
    }
}
