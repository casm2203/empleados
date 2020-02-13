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
public class opeTecnico3 extends operarios {

    private int extra;

    public opeTecnico3() {
        super();
        extra = 0;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    @Override
    public int salario() {
        int salarioBase = super.salario();
        int prestaciones = 80;
        int cobroExtra =   this.extra * (int) ( (salarioBase/30) * 1.5);
        int salarioOpe3 = (int) (salarioBase * 1.40) + prestaciones + cobroExtra;
        return salarioOpe3;
    }
    
    @Override
    public String mostrar() {
        String info = super.mostrar()+"\n-Horas extras: "+this.extra;

        return info;
    }
}
