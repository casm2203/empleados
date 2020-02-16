/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author csuarez25
 */
public class directivos extends Empleados {

    private String dependencia;
    private int antiguedad;
    private int horasDeTrabajo;
    private int valorHora;

    public directivos() {
        super();
        dependencia = "";
        antiguedad = 0;
        horasDeTrabajo = 0;
        valorHora = 0;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
    public int salario() {
        int nomina = this.valorHora * this.horasDeTrabajo;
        return nomina;
    }
        
    public String mostrar (){
        String info = super.mostrar()+"\n-Dependencia: "+this.dependencia+"\n-Antiguedad(meses): "+this.antiguedad+"\n-Horas trabajadas: "
                +this.horasDeTrabajo+"\n-Valor hora: $"+this.valorHora+ "\n-Salario: $"+this.salario();
        return info;
    }
           

}
