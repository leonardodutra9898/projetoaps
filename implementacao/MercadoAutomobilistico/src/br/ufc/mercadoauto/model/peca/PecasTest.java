package br.ufc.mercadoauto.model.peca;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import br.ufc.mercadoauto.repositorios.PecasRepositorio;

public class PecasTest {

	public static void pecasTeste() {
		PecasRepositorio pecas = new PecasRepositorio();
		
		Calendar data1 = Calendar.getInstance(new Locale("America/Sao Paulo"));
		Date dataMotor = data1.getTime();
		Calendar data2 = Calendar.getInstance(new Locale("America/Sao Paulo"));
		Date dataCilindro = data2.getTime();
		
		// Add peça
		Pecas motor = new Pecas(2, "Motor v2.0 4 cilindros", 18000.00, "Mitsubishi", 10.0, 15000.00, dataMotor);
		Pecas cilindro = new Pecas(63, "Cilindro Padrão", 2000.51, "Dodge", 20.0, 1500.00, dataCilindro);
		
		pecas.inserir(motor);
		pecas.inserir(cilindro);
		
		System.out.println("Total de registros => " + pecas.totalRegistros() + "\n");
		
		
		for(Pecas ps : pecas.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome() + ", data === " + ps.getDataEnvioFornecedor());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando peça
		cilindro.setNome("Cilindro mais potente");
		Pecas pTemp = pecas.obter(63);
		System.out.println("\nItem atualizado => " + pTemp.getNome());
		
		// deletando peça
		pecas.delete(motor);
		
		System.out.println("Total de registros Agora => " + pecas.totalRegistros() + "  //  Lista Vazia? == " + pecas.listaVazia() + " \n");
		
		
		for(Pecas ps : pecas.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome());
			System.out.println(" -------------------------------------------- ");
		}
	}
	
}
