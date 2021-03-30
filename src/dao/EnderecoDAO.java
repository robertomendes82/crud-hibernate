package dao;

import java.util.List;

import model.Endereco;

public interface EnderecoDAO {
	public void salvar (Endereco endereco);
	public void alterar (Endereco endereco);
	public void remover( Endereco endereco);
	public Endereco pesquisar(int numero);
	public List<Endereco> listarTodos();
	public int getSequence();

}
