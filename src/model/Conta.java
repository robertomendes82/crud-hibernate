package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id
	private Integer numero;
	
	private double saldo;
	
	private double limite;
	
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
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}
	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "] \n";
	}
	
	

}
