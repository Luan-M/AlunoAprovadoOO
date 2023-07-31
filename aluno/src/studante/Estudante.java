package studante;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
		
	}
	
	public double validacaoNota() {
		if(notaTotal() < 60.0) {
			return 60.0 - notaTotal();
		}
		return 0.0;
	}
	
	public String toString() {
		return "A nota do(a) " + nome + " é: " + notaTotal();
	}
	
}
