package controller;

import java.util.List;

import dao.ContaDAO;
import dao.impl.ContaDAOImpl;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.close();*/
		
		Conta conta = new Conta();
		
		conta.setLimite(5000);
		conta.setNumero(55555);
		conta.setSaldo(50);
		
		ContaDAO contaDao = new ContaDAOImpl();
		contaDao.salvar(conta);
		
		conta.setLimite(500);
		conta.setNumero(55555);
		conta.setSaldo(50.45);
		
		contaDao.alterar(conta);
		contaDao.remover(55555);
		System.out.println(contaDao.pesquisar(3));
		
		for(Conta c: contaDao.listarTodos()) {
			System.out.println(c);
		}
		contaDao.listarTodos().forEach(System.out::println);		
		
	}
}
