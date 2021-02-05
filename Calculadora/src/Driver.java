import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
Author: Marco Orozco
*/

public class Driver {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> stack = new ArrayList<String>();
        try{
            FileReader f = new FileReader("C:\\Users\\sonic\\Documents\\Universidad\\3er semestre\\Estructuras de datos\\Calcu\\Datos.txt");
            BufferedReader r = new BufferedReader(f);

            String cadena;

            while((cadena=r.readLine()) != null){
                stack.add(cadena);
            }
            System.out.println(stack);
        } catch(FileNotFoundException e){
            System.out.println("No se ha podido abrir el archivo");
        }
        
        Calculadora c = new Calculadora();
        
        for(int expresion = 0; expresion < stack.size(); expresion++){
            System.out.println(c.Calculo(stack.get(expresion)));
        }
    }
}
