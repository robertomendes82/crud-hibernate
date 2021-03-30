package dao;

import java.util.List;

import model.Conta;

public interface ContaDAO {
	public void salvar (Conta conta);
	public void alterar (Conta conta);
	public void remover(Conta conta);
	public Conta pesquisar(int numero);
	public List<Conta> listarTodos();
}
