/**
 * Realizar una clase Vector3d que permita manipular vectores de tres componentes en
 * coordenadas x, y, z de acuerdo con las siguientes normas:
 * • Usar sólo un método constructor.
 * • Usar un método miembro equals() para saber si dos vectores tienen sus componentes
 * o coordenadas iguales.
 * */

public class C8_8_5_Vector3D {

    private double x;
    private double y;
    private double z;

    public C8_8_5_Vector3D(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(C8_8_5_Vector3D q){
        if((this.x == q.x)&&(this.y == q.y)&&(this.z == q.z)){
            return true;
        }else {
            return false;
        }

    }

    public double normamax(){
        return (Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z));
    }

}
