public class Cronometro {

	private int cont;
	private int segundos;
	private int minutos;
	
	
	Cronometro(){
	
		this.segundos=0;
		this.minutos=0;
	}
	
	public void Reiniciar(){
		segundos=0;
		minutos=0;
		
	}
	public void IncrementarTiempo(){
		
		segundos++;
		if (segundos> 59) {
			minutos++;
			segundos=0;
		}
		
	}
	
	public void MostrarTiempo(){
		System.out.println("Minutos: "+minutos+"	/	"+"Segundos: "+segundos);
		
		
	}
	
}
