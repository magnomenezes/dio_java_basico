package candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

	public static void main(String[] args) {
		/*analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		}
	static void selecaoCandidatos () {
		String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados <5 && candidatoAtual< candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + "solicitou este valor de salário " + salarioPretendido);
			if(salarioBase>=salarioPretendido) {
				System.out.println("O candidato " + candidato + "foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	
	}
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase>salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido)
			System.out.println("Ligar para o candidato com um contraproposta.");
	else { 
		System.out.println("Aguardando resultado dos demais.");
	}
	}
}
