package com.test.refactoring.Business;
/**
 * 
 * @author juanma
 * @version 1.0
 * Con esta clase lo que hacemos es los m�todos que est�n en com�n los extraemos en una
 * interfaz y en las clases de los vehiculos los implementamos
 */

public interface FuncionCoche {
/**
 * En este m�tdodo se nos pasa por param�tro la velocidad del vehiculo, y 
 * progresivamente se aumentar� la velocidad hasta llegar a la velocidad establecida en el m�todo
 * @param velocidad
 */
	void acelerar(Integer velocidad);
/**
 * En el m�todo detener el veh�culo se ir� deteniendo progresivamente hasta pararse del
 * todo
 */
	void detener();

}