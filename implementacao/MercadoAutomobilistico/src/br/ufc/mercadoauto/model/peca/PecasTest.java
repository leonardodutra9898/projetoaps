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
		Date dataCilindro = data1.getTime();
		Date dataCarburador = data1.getTime();
		Date dataPneu = data1.getTime();
		
		// Add peça
		Pecas motor = new Pecas(2, "Motor v2.0 4 cilindros", 18000.00, "Mitsubishi", 10.0, 15000.00, dataMotor, 3);
		Pecas cilindro = new Pecas(63, "Cilindro Padrão", 2000, "Dodge", 20.0, 500, dataCilindro, 10);
		Pecas pneu = new Pecas(20, "Pneu Pirelli", 200.00, "Pirelli", 3.0, 100.00, dataPneu, 50);
		Pecas carburador = new Pecas(9, "Carburador simples", 800.00, "Sem marca", 19.0, 600.00, dataCarburador, 23);
		
		pecas.inserir(motor);
		pecas.inserir(cilindro);
		pecas.inserir(pneu);
		pecas.inserir(carburador);
		
		System.out.println("Total de registros [PEÇAS] => " + pecas.totalRegistros() + "\n");
		
		
		System.out.println("LISTANDO PEÇAS +++++++++++++++++++++++++++");
		for(Pecas ps : pecas.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome() + ", data === " + ps.getDataEnvioFornecedor());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando peça
//		cilindro.setNome("Cilindro mais potente");
//		Pecas pTemp = pecas.obter(63);
//		System.out.println("\nItem atualizado => " + pTemp.getNome());
		
		// deletando peça
//		pecas.delete(motor);
		
//		System.out.println("Total de registros Agora => " + pecas.totalRegistros() + "  //  Lista Vazia? == " + pecas.listaVazia() + " \n");
		
		
//		for(Pecas ps : pecas.listar()) {
//			System.out.println(" -------------------------------------------- ");
//			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome());
//			System.out.println(" -------------------------------------------- ");
//		}
	}
	
}
