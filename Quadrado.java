import java.lang.Math;

public class Quadrado {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado=lado;
    }

    public float CalcularArea() {
        float area = (float) Math.pow(lado, 2);
        return area;
    }

    public float CalcularPerimetro() {
        float perimetro = lado * 4;
        return perimetro;
    }
}
