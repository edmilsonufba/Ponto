import java.util.Scanner;


abstract  class Funcionario implements Tributos {
	
	protected String nome;
	protected String cpf; //a escolha por string se deu ao fato de se aceitar o formato xxx.xxx.xxx/xx
	protected int salario ;
	protected int salarioBruto ;
	protected int salarioLiquido ;
	protected Ponto marcador;
	private Scanner ler;

	
	public Funcionario() {
		super();
		ler = new Scanner(System.in);
		System.out.printf ("Digite o nome");
		this.nome = ler.next();
		System.out.printf ("Digite o CPF");
		this.cpf =  ler.next();
		marcador = new Ponto();
	
	}
		//--------------------------///
		
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Ponto getMarcador() {
		return marcador;
	}
	public void setMarcador(Ponto marcador) {
		this.marcador = marcador;
	}
	public int getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public int getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(int salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
    //----------------------------------//	
	
}

