package com.marcosviniciusdev.entities;

public class Televisor {
	
	public int canal;
	public int volume;
	public boolean ligado = false;
	
	public void ligar() {
		ligado = !ligado;
		canal = 1;
	}
	
	public void aumentarVolume() {
		if (volume >= 0 && volume < 16) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (canal >= 0 && canal < 16) {
			volume--;
		}
	}
	
	public void aumentarCanal() {
		if (canal >= 1 && canal <= 15) {
			canal++;
		}
	}
	
	public void diminuirCanal() {
		if (canal >= 1 && canal <= 15) {
			canal--;
		}
	}
	
	public String obterStatus() {
		if (ligado) {
			return "Status: ligado\nCanal atual: " + canal + "\nVolume Atual: " + volume;
		} else {
			return "Status: Desligado";
		}
	}

}
