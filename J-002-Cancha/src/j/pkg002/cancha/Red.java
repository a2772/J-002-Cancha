package j.pkg002.cancha;

public class Red {
    String [] juega, cieloSi, cieloNo, vientoSi, vientoNo, temperaturaSi, temperaturaNo, humedadSi, humedadNo;

    public Red() {
        this.juega = new String[]{"Sí", "0.633", "No", "0.367"};
        
        this.cieloSi = new String[]{"Soleado","0.238","Nublado","0.49","Lluvia","0.33"};
        this.cieloNo = new String[]{"Soleado","0.538","Nublado","0.077","Lluvia","0.385"};
        
        this.vientoSi = new String[]{"Verdadero","0.60","Falso","0.350"};
        this.vientoNo = new String[]{"Verdadero","0.417","Falso","0.583"};
        
        this.temperaturaSi = new String[]{"Caliente","0.238","Cálido","0.429","Frío","0.333"};
        this.temperaturaNo = new String[]{"Caliente","0.385","Cálido","0.385","Frío","0.231"};
        
        this.humedadSi = new String[]{"Alta","0.35","Normal","0.650"};
        this.humedadNo = new String[]{"Alta","0.75","Normal","0.250"};
    }
}
