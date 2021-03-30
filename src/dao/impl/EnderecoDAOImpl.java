package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.EnderecoDAO;
import model.Endereco;
import model.util.JpaUtil;

public class EnderecoDAOImpl implements EnderecoDAO {
	
	private EntityManager em = Persistence.createEntityManagerFactory("jpaProject").createEntityManager();
	private EntityTransaction et;
	
	@Override
	public void salvar(Endereco endereco) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(endereco);
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
	public void alterar(Endereco endereco) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(endereco);
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
	public void remover(Endereco endereco) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Endereco.class, endereco.getNumero()));
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
	public Endereco pesquisar(int numero) {
		Endereco endereco = new Endereco();
		try {
			this.em=JpaUtil.getEntityManager();
			endereco = em.find(Endereco.class, numero);
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
		return endereco;
		
				
	}

	@Override
	public List<Endereco> listarTodos() {
		this.em=JpaUtil.getEntityManager();
		Query query = em.createQuery("from Endereco é");
		List<Endereco>listaEndereco = query.getResultList();
		em.close();
		return listaEndereco;
		
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
