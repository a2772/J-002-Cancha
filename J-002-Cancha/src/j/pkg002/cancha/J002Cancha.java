package j.pkg002.cancha;
import javax.swing.JOptionPane;

public class J002Cancha {
    public static void main(String[] args) {
        Red red = new Red();
        String jugar = JOptionPane.showInputDialog("--Jugar--\n1) Sí\n2) No");
        String cielo = JOptionPane.showInputDialog("--Cielo--\n1)Soleado\n3) Nublado\n5)Lluvioso");
        String temperatura = JOptionPane.showInputDialog("--Temperatura--\n1) Caliente\n3) Cálido\n5) Frío ");
        String viento = JOptionPane.showInputDialog("--Viento--\n1) Verdadero\n3) Falso");
        String humedad = JOptionPane.showInputDialog("--Humedad--\n1) Alta\n3) Normal ");
        
        double probSi;
        double probNo;
        
        probSi = red.probSi(Integer.parseInt(cielo), Integer.parseInt(viento), Integer.parseInt(temperatura), Integer.parseInt(humedad));
        probNo = red.probNo(Integer.parseInt(cielo), Integer.parseInt(viento), Integer.parseInt(temperatura), Integer.parseInt(humedad));
        
        double suma = probSi + probNo;
        String resultado = "";
        resultado += "Suma de la probabilidad Si + No: " + suma + " \n\n";
        resultado += "Probabilidad de jugar: " + probSi/suma + " = " +  Math.round( (probSi/suma*100)*100d )/100d + "%\n";
        resultado += "Probabilidad de NO jugar: " + probNo/suma + " = " + Math.round( (probNo/suma*100)*100d )/100d + "%\n";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
