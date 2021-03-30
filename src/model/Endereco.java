package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	@Id
	@Column(name = "ID_ENDERECO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENDERECO")
	@SequenceGenerator(name = "ENDERECO", sequenceName = "S_ID_ENDERECO", 
    allocationSize = 1, initialValue=100)
	private Long id;
	private String rua;
	private Integer numero;
	private String complemento;
	/**
	 * @return the id_endereco
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id_endereco the id_endereco to set
	 */
	public void setId_(Long id) {
		this.id = id;
	}
	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}
	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + "] \n";
	}
	

}
