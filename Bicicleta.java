class Bicicletaa extends Vehiculo{

	public Bicicleta(){
		this.kilometrosRecorridos = 0;
	}

	@Override
	public void mover(double distancia){
		kilometrosRecorridos += distancia;
		System.out.println("La bicicleta ha recorrido" + distancia + "KM")
	}
	@Override
	public double calcularAutonomia(){
		return -1;
	}
}