package Cronometro;


public class Principal {
public static void main(String[] args) {
	
	Cronometro Crono1 = new Cronometro();
	
	for (int i = 0; i < 5000; i++) {
		Crono1.IncrementarTiempo();
	}
	Crono1.MostrarTiempo();
	Crono1.Reiniciar();
	Crono1.MostrarTiempo();
	
}
}
