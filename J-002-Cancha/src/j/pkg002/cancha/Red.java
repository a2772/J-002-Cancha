package j.pkg002.cancha;

public class Red {
    String [] juega, cieloSi, cieloNo, vientoSi, vientoNo, temperaturaSi, temperaturaNo, humedadSi, humedadNo;

    public Red() {
        this.juega = new String[]{"Sí", "0.633", "No", "0.367"};
        
        this.cieloSi = new String[]{"Soleado","0.238","Nublado","0.49","Lluvia","0.272"};
        this.cieloNo = new String[]{"Soleado","0.538","Nublado","0.077","Lluvia","0.385"};
        
        this.vientoSi = new String[]{"Verdadero","0.60","Falso","0.40"};
        this.vientoNo = new String[]{"Verdadero","0.417","Falso","0.583"};
        
        this.temperaturaSi = new String[]{"Caliente","0.238","Cálido","0.429","Frío","0.333"};
        this.temperaturaNo = new String[]{"Caliente","0.385","Cálido","0.385","Frío","0.230"};
        
        this.humedadSi = new String[]{"Alta","0.35","Normal","0.650"};
        this.humedadNo = new String[]{"Alta","0.75","Normal","0.250"};
    }
    public double probSi(int posCielo, int posViento, int posTemperatura, int posHumedad){
        return Double.parseDouble(this.juega[1])*Double.parseDouble(this.cieloSi[posCielo])*Double.parseDouble(this.vientoSi[posViento])*Double.parseDouble(this.temperaturaSi[posTemperatura])*Double.parseDouble(this.humedadSi[posHumedad]); 
    }
    public double probNo(int posCielo, int posViento, int posTemperatura, int posHumedad){
        return Double.parseDouble(this.juega[3])*Double.parseDouble(this.cieloNo[posCielo])*Double.parseDouble(this.vientoNo[posViento])*Double.parseDouble(this.temperaturaNo[posTemperatura])*Double.parseDouble(this.humedadNo[posHumedad]); 
    }
}
