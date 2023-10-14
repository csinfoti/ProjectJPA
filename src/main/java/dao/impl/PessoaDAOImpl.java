package dao.impl;

import java.util.List;

import dao.PessoaDAO;
import model.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {

	@Override
	public void salvar(Pessoa pesssoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa pesquisar(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PessoaDAOImpl [listarTodos()=" + listarTodos() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
