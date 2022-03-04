package com.test.refactoring.Business;

public class Camion extends Vehiculo implements FuncionCoche {
/**
 * La clase cami�n que hereda de la clase vehiculo y tenemos implementada la interfaz 
 * con  los metdos acelerar y frenar y el atributo de tipo carnet
 */
	private String tipoCarnet;
/**
 * Creamos los constructores uno a vac�o y otro con los parametros del padre m�s el atributo 
 * que tenemos como par�metros
 */
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String matricula, String color, String combustible, String nombreConductor, String dniConductor,
			String tipoCarnet) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;
	}
/**
 * Aqu� podemos mirar el tipo de carnet que tenemos
 * @return tipoCarnet
 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
/**
 * Con este metodo modificamos el tipo de carnet de la clase
 * @param tipoCarnet
 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
/**
 * Son metodos abstractos que nos permiten acelerar y frenar el cami�n 
 * progresivamente 
 */
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");

		// TO DO
		// Incluir l�gica de movimiento
	}

	public void detener() {
		System.out
				.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	@Override
	public String toString() {
		return super.toString() + ", tipoCarnet=" + tipoCarnet;
	}

}
