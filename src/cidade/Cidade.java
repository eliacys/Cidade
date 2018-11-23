
package cidade;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Cidade {

   
    public static void main(String[] args) {
                 Pessoa p1 = new Pessoa();
                 Pessoa p2 = new Pessoa();
                 Pessoa p3 = new Pessoa();
                 p1.nome  = "Maria";
                 p1.idade = 32;
                 p1.altura = 1.60;
                 p1.sexo = 'F';
            System.out.println("Os dados da pessoa 1 foram:" +"\nNome: "+p1.nome+"\nIdade"+p1.idade+"\nAltura"+p1.altura+"\nSexo"+p1.sexo);
         //Entrada de dados com JOPtionPane
               p2.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Informações", JOptionPane.DEFAULT_OPTION); 
            String dataTemp = JOptionPane.showInputDialog(null, "Digite sua idade:", "Informações: ", JOptionPane.DEFAULT_OPTION);
               p2.idade = Byte.parseByte(dataTemp);
            dataTemp = JOptionPane.showInputDialog(null, "Digite sua altura:", "Informações: ", JOptionPane.DEFAULT_OPTION);
               p2.altura = Double.parseDouble(dataTemp);
            dataTemp = JOptionPane.showInputDialog(null, "Digite seu sexo:", "Informações: ", JOptionPane.DEFAULT_OPTION);
               p2.sexo = dataTemp.charAt(0);
            JOptionPane.showMessageDialog (null, "Os dados da pessoa 2 foram:" +"\nNome: "+p2.nome+"\nIdade"+p2.idade+"\nAltura"+p2.altura+"\nSexo"+p2.sexo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
         //Entrada de dados   
        Scanner ler = new Scanner(System.in);
            System.out.println("Informe seu nome");
               p3.nome = ler.nextLine();
            System.out.println("Informe sua idade");
               p3.idade = ler.nextByte();
            System.out.println("Informe sua altura");
               p3.altura = ler.nextDouble();
            System.out.println("Informe seu sexo");
               p3.sexo = ler.next().charAt(0);
            System.out.println("Os dados da pessoa 3 foram:" +"\nNome: "+p3.nome+"\nIdade"+p3.idade+"\nAltura"+p3.altura+"\nSexo"+p3.sexo);
                    
        
            
            
            
             }
    
}
