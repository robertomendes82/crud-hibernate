package controller;

import java.util.List;

import dao.PessoaDAO;
import dao.impl.PessoaDAOImpl;
import model.Conta;
import model.Endereco;
import model.Pessoa;

public class Principal {
	
	
	public static void main(String[] args) {
		
	
		
//		Conta conta1 = new Conta();
//		conta1.setNumero(333);
//		conta1.setLimite(3000);
//		conta1.setSaldo(2500);
//		
//		ContaDAO contaDao = new ContaDAOImpl();
//		contaDao.salvar(conta1);
		
		//contaDao.alterar(conta1);
		
		//Conta p= contaDao.pesquisar(123);
		//System.out.println(p);
		
		//List<Conta> l = contaDao.listarTodos();
		//System.out.println(l);
		
//		contaDao.remover(conta1);
//		System.out.println("a conta excluída foi a " + conta1.getNumero());
	
//		Endereco e = new Endereco();
//		e.setRua("CARACOL");
//		e.setNumero(750);
//		e.setComplemento("APTO");
////		
//				
//		EnderecoDAO enderecoDao = new EnderecoDAOImpl();
//		enderecoDao.salvar(e);
////		
//		enderecoDao.alterar(e);
		
//		Endereco p = enderecoDao.pesquisar(11);
//		System.out.println(p);
		
		
//		List<Endereco> l = enderecoDao.listarTodos();
//		System.out.println(l);
		
		PessoaDAO pessoaDAO = new PessoaDAOImpl();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("SILVIO XAVIER");
		pessoa.setIdade(38);
		pessoa.setSexo("M");
		pessoa.setCpf("09487965423");
		
		Conta contaPessoa = new Conta();
		contaPessoa.setNumero(89);
		contaPessoa.setLimite(6000);
		contaPessoa.setSaldo(2750);
		
		Endereco enderecoPessoa = new Endereco();
		enderecoPessoa.setRua("CONSELHEIRO AGUIAR");
		enderecoPessoa.setNumero(230);
		enderecoPessoa.setComplemento("APTO");
		
		
		pessoa.setConta(contaPessoa);
		pessoa.setEndereco(enderecoPessoa);
		//pessoaDAO.salvar(pessoa);
		//pessoaDAO.alterar(pessoa);
		//pessoaDAO.remover(pessoa);
		List<Pessoa> l = pessoaDAO.listarTodos();
	System.out.println(l);
		
		//System.out.println(pessoaDAO.pesquisar("09487946748"));
				
		
		
		
//	
	}

	
	
}
