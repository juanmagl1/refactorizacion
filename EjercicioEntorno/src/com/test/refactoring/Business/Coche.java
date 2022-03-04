package com.test.refactoring.Business;

public class Coche extends Vehiculo implements FuncionCoche {
	/**
	 * La clase coche que hereda de la clase vehiculo y tenemos implementada
	 * la interfaz con los m�todos acelerar y frenar y el atributo numero de plazas
	 */
	private Integer numPlazas;
	/**
	 * Creamos los constructores uno a vac�o y otro con los parametros del padre m�s el atributo n�mero de plazas
	 * que tenemos como par�metros
	 */

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, String color, String combustible, String nombreConductor, String dniConductor,
			Integer numPlazas) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.numPlazas = numPlazas;
	}
/**
 * Metodos para consultar el n�mero de plazas o para mofidicar el n�mero de las plazas del coche
 * @return el numero de las plazas del coche
 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
/**
 * Este m�todo lo que hace es cambiar el n�mero de plazas del coche 
 * @param numPlazas el n�mero de las plazas que va a tener el coche
 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
/**
 * Los m�todos para acelerar y frenar el coche progresivamente 
 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}

	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return super.toString() + ", numPlazas=" + numPlazas;
	}

}
