public class Auto {
    public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos() {
        return asientos.length;
    }
    public String verificarintegridad() {
        for(int i = 0; i < asientos.length; i++) {
            if(asientos[i].registro != registro)
                return "Las piezas no son originales";
        }
        if(motor.registro != registro)
            return "Las piezas no son originales";
       
        return "Auto original";
    }
}
