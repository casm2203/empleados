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
public class opeTecnico1 extends operarios {

    private String especialidad;

    public opeTecnico1() {
        super();
        especialidad = "";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public double salario (){
        double salarioBase = super.salario();
        int prestaciones = 80;
        double salarioOpe1 = (salarioBase* 1.20) + prestaciones ;
        return salarioOpe1;
    }
    
    @Override
    public String mostrar() {
        String info = super.mostrar()+"\n-Especialidad: "+this.especialidad+"\n-Salario: $"+this.salario();
        return info;
    }

}
