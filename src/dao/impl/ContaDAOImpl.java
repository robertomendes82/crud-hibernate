package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.ContaDAO;
import model.Conta;
import model.util.JpaUtil;

public class ContaDAOImpl implements ContaDAO {
	
	private EntityManager em = 	Persistence.createEntityManagerFactory("jpaProject").createEntityManager();
	
	private EntityTransaction et;
	

	@Override
	public void salvar(Conta conta) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(conta);
			et.commit();
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		}finally {
			if(em.isOpen()){
				em.close();
			}
		}
		
	}

	@Override
	public void alterar(Conta conta) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(conta);
			et.commit();
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		}finally {
			if(em.isOpen()){
				em.close();
			}
		}
		
	}

	@Override
	public void remover(Conta conta){
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Conta.class, conta.getNumero()));	
			et.commit();
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		}finally {
			if(em.isOpen()){
				em.close();
			}
		}
	}

	@Override
	public Conta pesquisar(int numero) {
		Conta conta = new Conta();
		try {
			this.em=JpaUtil.getEntityManager();
			conta = em.find(Conta.class, numero);
		}catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		}finally {
			if(em.isOpen()){
				em.close();
			}
		}
		return conta;
		
				
	}

	@Override
	public List<Conta> listarTodos() {
		this.em=JpaUtil.getEntityManager();
		Query query = em.createQuery("from Conta é");
		List<Conta>listaConta = query.getResultList();
		em.close();
		return listaConta;
	}


}
