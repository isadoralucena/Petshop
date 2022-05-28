package PetshopAriPet;
import java.text.ParseException;
import java.util.Scanner;
public class Teste {
    public static void main(String[]args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos procedimentos são feitos no Pethsop/Clínica Veterinária? ");
        int numeroDeProced = sc.nextInt();
        while(numeroDeProced <=0){//Estrutura de repetição para só aceitar a catalogação de 1 ou mais procedimentos
            System.out.println("Quantos procedimentos são feitos no Pethsop/Clínica Veterinária?? Obs.: só é possível registrar 1 ou mais procedimentos");
            numeroDeProced = sc.nextInt();
        }
        TiposDeProcedimentos []proced = new TiposDeProcedimentos[numeroDeProced];//Criando objeto

        if(numeroDeProced==1){//Estrutura de condição
            System.out.println("Para catatolgar "+numeroDeProced+" procedimento informe");  
          }else{
            System.out.println("Para catatolgar "+numeroDeProced+" procedimentos informe");
          }
          
        for(int i=0;i<numeroDeProced;i++){//Loop para ler o vetor de objeto criado      
            proced[i]=new TiposDeProcedimentos();//Referenciando as posições do vetor ao registro TiposDeProcedimentos
            System.out.print("Procedimento " +(i+1)+", nome: ");
            proced[i].setNome(sc.next());
            sc.nextLine();//Esvaziando o buffer (na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado)
            System.out.print("Procedimento " +(i+1)+", preço: R$");
            proced[i].setPreco(sc.nextFloat());
        }

        for(int j=0;j<numeroDeProced;j++){//Loop para exibir os procedimentos
            System.out.println("Procedimento "+(j+1));
            System.out.println("Nome: "+proced[j].getNome());
            System.out.println("Preço: R$"+proced[j].getPreco());
        }

        Gatos g1 = new Gatos();
        g1.emitirSom();
        g1.leitura();
        g1.toString();

        sc.close();
    }
}
