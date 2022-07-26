package br.com.alura.alura_lib.helper;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;

public class MessageHelper {

	private FacesContext context;
	private Flash flash;

	@Inject
	public MessageHelper(FacesContext context, Flash flash) {
		this.context = context;
		this.flash = flash;
	}

	public MessageHelper onFlash() {
		flash.setKeepMessages(true);
		return this;
	}

	public void addMessage(FacesMessage message) {
		addMessage(null, message);
	}

	private void addMessage(String clienteId, FacesMessage message) {
		context.addMessage(clienteId, message);

	}

	public Flash getFlash() {
		return flash;
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

}
