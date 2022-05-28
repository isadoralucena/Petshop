package PetshopAriPet;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;
public class Cachorros extends Animais{//Herança
    VacinasTomadasCachorro vacinas = new VacinasTomadasCachorro();
    private boolean barulhento;//encapsulamento
    private boolean rabo;//encapsulamento
    private boolean agressivo;//encapsulamento
    Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
    @Override
    public void emitirSom() {//Polimorfismo
       System.out.println("Au au");
    }
    public boolean getRabo() {
        return rabo;
    }
    public void setRabo(boolean rabo) {
        this.rabo = rabo;
    }
    public boolean getAgressivo() {
        return agressivo;
    }
    public void setAgressivo(boolean agressivo) {
        this.agressivo = agressivo;
    }
    public boolean getBarulhento() {
        return barulhento;
    }
    public void setBarulhento(boolean barulhento) {
        this.barulhento = barulhento;
    }
    @Override
    public String toString(){//Polimorfismo 
        return "Nome: "+getNome()+"\nRaca: "+getRaca()+"\nData de nascimento: "+cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR)
        +"\nCor do pelo: "+getCorDoPelo()+"\nPeso: "+getPeso()+"\nBarulhento: "+getBarulhento()
        +"\nRabo: "+getRabo()+"\nAgressivo: "+getAgressivo();
    }
    @Override
    public void leitura() throws ParseException{//polimorfismo
        super.leitura();
        Scanner sc = new Scanner(System.in);
        System.out.print("Barulhento (informe true ou false): ");
        setBarulhento(sc.nextBoolean());
        System.out.print("Rabo (informe true ou false): ");
        setRabo(sc.nextBoolean());
        System.out.print("Agressivo (informe true ou false): ");
        setAgressivo(sc.nextBoolean());
    }
}
