package com.samussoft.alcancebeans.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.samussoft.alcancebeans.MostrarFechayHoraServidor;
import com.samussoft.alcancebeans.MostrarHoraServidor;

public class MostrarFechayHoraServidorImpl implements MostrarFechayHoraServidor {
	Logger log = Logger.getLogger(getClass());
	private MostrarHoraServidor mostrarHoraServidor;

	public void mostrarInformacionServidor() {
		Calendar objCalendario = Calendar.getInstance();
		SimpleDateFormat objFormateador = new SimpleDateFormat("DD/MM/YYY");
		log.info("La Fecha actual del servidor es : "
				+ objFormateador.format(objCalendario.getTime()));
		mostrarHoraServidor.mostrarHora();
	}

	public MostrarHoraServidor getMostrarHoraServidor() {
		return mostrarHoraServidor;
	}

	public void setMostrarHoraServidor(MostrarHoraServidor mostrarHoraServidor) {
		this.mostrarHoraServidor = mostrarHoraServidor;
	}

}
