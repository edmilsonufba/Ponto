import java.util.Scanner;


public class Ponto {
	

	public Ponto() {
		super();
		HorasMes();
	}
	
	private int horariochegada ;
	private int horariosaida ;
	protected int horastrabalhadas;
	private int numeroDias ;
	private Scanner ler;
	
 
 //------------------Get e Set Inicio----------------//
 	public int getHorariosaida() {
 		return horariosaida;
 	}
 	public void setHorariosaida(int horariosaida) {
 		this.horariosaida = 0;
 	}
 	public int getHorariochegada() {
 		return horariochegada;
 	}
 	public void setHorariochegada(int horariochegada) {
 		this.horariochegada = 0;
 	}
 	public int getHorastrabalhadas() {
 		return horastrabalhadas;
 	}
 	public void setHorastrabalhadas(int horastrabalhadas) {
 		this.horastrabalhadas = horastrabalhadas;
 	}
 	public int getNumeroDias() {
 		return numeroDias;
 	}
 	public void setNumeroDias(int numeroDias) {
 		this.numeroDias = numeroDias;
 	}
//------------------Get e Set Fim ----------------//
 
//------------------Metodos de funcionamento Inicio ----------------//
 	private int calculodehoras(){
	int horas =0 ;
	int x = this.horastrabalhadas ;
	System.out.printf ("Digite O horario de chegada");
	ler = new Scanner(System.in);
	this.horariochegada = ler.nextInt();
	System.out.printf ("Digite O horario de saida");
	ler = new Scanner(System.in);
	this.horariosaida = ler.nextInt();
		if(this.horariosaida > this.horariochegada) {
			horas = this.horariosaida - this.horariochegada  ;
			this.horastrabalhadas = x + horas ;
			return this.horastrabalhadas;
		}
		return this.horastrabalhadas;
	}
 
 	public void HorasMes(){
	System.out.printf ("Digite O numero de dias trabalhados");
	ler = new Scanner(System.in);
	this.numeroDias = ler.nextInt();
	int dias= 0 ;
	while (dias != this.numeroDias  ){
		calculodehoras();
		dias++ ;
		//System.out.print (this.horastrabalhadas+ "efhuodfhsihfsf  ");
		}
	}
//------------------Metodos de funcionamento Fim----------------//
}


 
