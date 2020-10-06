package br.com.unipe.aula.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.unipe.aula.model.Torcedor;

@Repository
public class TorcedorDAO {
	
	private static List<Torcedor> torcedores;
	
	public TorcedorDAO() {
		torcedores = new LinkedList<Torcedor>();
	}
	
	public void salvar(Torcedor torcedor) {
		torcedores.add(torcedor);
		for(Torcedor teste: torcedores) {
			System.out.println(teste.getNome() + " " + teste.getTime());
		}
	}
	
	public List<Torcedor> getAll() { 
		return torcedores; 
		}
	public void excluir(int id) {
		torcedores.remove(id);
	}
}
