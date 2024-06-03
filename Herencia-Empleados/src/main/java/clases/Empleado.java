package clases;

public class Empleado {
    private String Nombre;
    private int Edad;
    private double Salario;

    public Empleado() {
    }
    
    public Empleado(String Nombre, int Edad, double Salario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: {"+getNombre()+"}");
        System.out.println("Edad: {"+getEdad()+"}");
        System.out.println("Salario: {"+getSalario()+"}");
    }
}
