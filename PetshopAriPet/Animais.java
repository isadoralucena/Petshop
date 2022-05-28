package PetshopAriPet;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class Animais {//Abstração
    private String nome;//encapsulamento
    private String raca;//encapsulamento
    private Date dataDeNascimento;//encapsulamento
    private String corDoPelo;//encapsulamento
    private float peso;//encapsulamento
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Tutores tutor = new Tutores();  
    Calendar cal = Calendar.getInstance();//A classe Calendar é abstrata, por isso não pode ser instanciada. Para obter um calendário é necessário usar o método estático getInstance()
    public void locomover(){
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getCorDoPelo() {
        return corDoPelo;
    }
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void comer(){
    }
    public abstract void emitirSom();//Método abstrato que obrigatoriamente precisa ser instanciado nas classes filhas
    public void leitura() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        setNome(sc.next());
        System.out.print("Raca: ");
        setRaca(sc.next());
        System.out.print("Data de nascimento no formato dd/MM/yyyy: ");
        String auxiliar = sc.next();
        setDataDeNascimento(formato.parse(auxiliar));//Transformando a string auxiliar no tipo Date, e passando seu valor para a variável privada dataDeNascimento
        System.out.print("Cor do pelo: ");
        setCorDoPelo(sc.next());
        System.out.print("Peso: ");
        setPeso(sc.nextFloat());
    }
    public String toString(){
        cal.setTime(getDataDeNascimento());//Transformando a data do tipo date em calendar
        return "Nome: "+getNome()+"\nRaca: "+getRaca()+"\nData de nascimento: "+cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR)
        +"\nCor do pelo: "+getCorDoPelo()+"\nPeso: "+getPeso();
    }
}

