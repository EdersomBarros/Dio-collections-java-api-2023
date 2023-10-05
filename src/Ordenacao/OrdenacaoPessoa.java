package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> pessoaList;

	
	public OrdenacaoPessoa() {
		super();
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		
		return pessoasPorAltura;
		
	}
	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("nome 2", 44, 1.78);
		ordenacaoPessoa.adicionarPessoa("nome 3", 12, 1.97);
		ordenacaoPessoa.adicionarPessoa("nome 4", 45, 1.85);
		ordenacaoPessoa.adicionarPessoa("nome 5", 76, 1.64);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
	}

}
