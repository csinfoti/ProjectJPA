package dao.impl;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.ContaDAO;
import model.Conta;
import model.util.JpaUtil;


public class ContaDAOImpl implements ContaDAO{
	
	private EntityManager em;
	private EntityTransaction et;

	@Override
	public void salvar(Conta conta) {
		// TODO Auto-generated method stub
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(conta);
			et.commit();	
			
		} catch (Exception e){
			if(em.isOpen()) {
				et.rollback();
			}
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public void alterar(Conta conta) {
		// TODO Auto-generated method stub
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(conta);
			et.commit();	
			
		} catch (Exception e){
			if(em.isOpen()) {
				et.rollback();
			}
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		
		
		
	}

	@Override
	public void remover(int numero) {
		// TODO Auto-generated method stub
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Conta.class, numero));
			et.commit();	
			
		} catch (Exception e){
			if(em.isOpen()) {
				et.rollback();
			}
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
	}

	@Override
	public Conta pesquisar(int numero) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		try {
			
			this.em = JpaUtil.getEntityManager();
			conta = em.find(Conta.class, numero);
		} catch (Exception e){
			if(em.isOpen()) {
				et.rollback();
			}
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		return conta;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Conta> listarTodos() {
		// TODO Auto-generated method stub
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Conta e");
		List<Conta> listaConta = query.getResultList();
		em.close();
		return listaConta;
	}

	@Override
	public String toString() {
		return "ContaDAOImpl [listarTodos()=" + listarTodos() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
