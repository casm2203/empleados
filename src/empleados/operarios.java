/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

class operarios extends Empleados {

    private String tipo;
    private int antiguedad;
    private String profesion;
    private int horasTrabajadas;
    private int valor;

    public operarios() {
        super();
        tipo = "";
        antiguedad = 0;
        profesion = "";
        horasTrabajadas = 0;
        valor = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int salario() {
        int salario = 900;
        return salario;
    }

    @Override
    public String mostrar() {
        String info = super.mostrar() + "\n-Antiguedad en meses: " + this.antiguedad
                + "\n-Profesión: " + this.profesion + "\n-Horas trabajadas: "
                + this.horasTrabajadas + "\n-Valor: " + this.valor;

        return info;
    }
}
