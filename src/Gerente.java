
public class Gerente extends Funcionario {
private double salariobruto;
private double descontoir =0;
private double salarioliquido;

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
		this.salario = 30 ;
		salariobruto = (marcador.horastrabalhadas * this.salario);
		cauculaIR();
		imprimeconracheque();
		
	}
	
	public void imprimeconracheque() {
		System.out.printf ("\n O funcionario: "+ this.nome);
		System.out.printf ("\n Tem o  cpf: "+ this.cpf);
		System.out.printf ("\n Tem o  salario: "+ salariobruto);
		System.out.printf ("\n Tem o  salario liquido: "+ salarioliquido);
		System.out.printf ("\n Tem o  desconto de IR: "+ descontoir);
		System.out.printf ("\n Ganha : "+ this.salario +"por hora");

	}
	
	public void cauculaIR() {
		if (salariobruto >1200){
			descontoir = (salariobruto/17);  
			salarioliquido = salariobruto - descontoir;
		}
		
	}
	
	public void cauculaINSS() {
		
		
	}
}