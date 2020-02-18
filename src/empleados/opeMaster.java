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
public class opeMaster extends operarios {

    private int extras;

    public opeMaster() {
        super();
        extras = 0;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    @Override
    public double salario() {
        double salarioBase = super.salario();
        int prestaciones = 80;
        double cobroExtra = this.extras * (int) ((salarioBase / 30) * 2);
        double salarioOpe3 = (salarioBase * 1.50) + prestaciones + cobroExtra;
        return salarioOpe3;
    }

    @Override
    public String mostrar() {
        String info = super.mostrar() + "\n-Horas extras: " + this.extras + "\n-Salario: $" + this.salario();
        return info;
    }

}
