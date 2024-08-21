
package com.todocodeacademy.peluqueriacanina.logica;

import com.todocodeacademy.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atEspecial, String nombreDuenio, String celDuenio) {

	// creamos el dueño y asignamos sus valores
	Duenio duenio = new Duenio();
	duenio.setNombre(nombreDuenio);
	duenio.setCelDuenio(celDuenio);
	
	// creamos la mascota y asignamos sus valores
	Mascota masco = new Mascota();
	masco.setNombre(nombreMasco);
	masco.setRaza(raza);
	masco.setColor(color);
	masco.setObservaciones(observaciones);
	masco.setAlergico(alergico);
	masco.setAtencion_especial(atEspecial);
	masco.setUnDuenio(duenio);
	
	controlPersis.guardar(duenio,masco);
	
    }

    public List<Mascota> traerMascotas() {
	return controlPersis.traerMascotas();
	
    }

    public void borrarMascota(int num_cliente) {
	controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
	return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atEspecial, String nombreDuenio, String celDuenio) {
	
	masco.setNombre(nombreMasco);
	masco.setRaza(raza);
	masco.setColor(color);
	masco.setObservaciones(observaciones);
	masco.setAlergico(alergico);
	masco.setAtencion_especial(atEspecial);
	
	// modifico la mascota
	controlPersis.modificarMascota(masco);
	
	// identificar dueño y seteo nuevos valores
	Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
	dueno.setCelDuenio(celDuenio);
	dueno.setNombre(nombreDuenio);
	
	
	// llamar al modificarDueño
	this.modificarDuenio(dueno);
}

    private Duenio buscarDuenio(int id_duenio) {
	return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
	controlPersis.modificarDuenio(dueno);
    }
}