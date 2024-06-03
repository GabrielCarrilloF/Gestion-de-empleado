package clases;

public class Gerente extends Empleado {
    
    private String departamento;
    private double bonus;

    public Gerente() {
    }

    public Gerente(String Nombre, int Edad, double Salario, String departaemnto, double bonus) {
        super(Nombre, Edad, Salario);
        this.departamento = departaemnto;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Departamento: {"+getDepartamento()+"}");
        System.out.println("Bonus: {"+getBonus()+"}");
    }
}
