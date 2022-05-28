package PetshopAriPet;
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
public class Gatos extends Animais{//Herança
    VacinasTomadasGato vacinas = new VacinasTomadasGato();
    private String corDosOlhos;//encapsulamento
    private boolean pedigree;//encapsulamento
    Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
    @Override
    public void emitirSom(){
       System.out.println("Miau");
    }

    public boolean getPedigree(){
        return pedigree;
    }

    public void setPedigree(boolean pedigree){
        this.pedigree = pedigree;
    }

    public String getCorDosOlhos(){
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos){
        this.corDosOlhos = corDosOlhos;
    }
    @Override
    public String toString(){//Polimorfismo
        return "Nome: "+getNome()+"\nRaca: "+getRaca()+"\nData de nascimento: "+cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR)
        +"\nCor do pelo: "+getCorDoPelo()+"\nPeso: "+getPeso()+"\nPedigree: "+getPedigree()
        +"\nCor dos olhos: "+getCorDosOlhos();
    }
    @Override
    public void leitura() throws ParseException{//polimorfismo
        super.leitura();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cor dos olhos: ");
        setCorDosOlhos(sc.next());
        System.out.print("Tem pedigree (informe true ou false)? ");
        setPedigree(sc.nextBoolean());
    }
}
