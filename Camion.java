class Camion(double combustible, double autonomiaMaixma){
	
	public Camion(double combustible, double autonomiaMaxima){
		super(combustible, autominaMaxima);
	}
	@Override
	public void mover(double distancia){
		if(combustible > 0){
			if(distancia <= calcularAutonomia()){
				kilometrosRecorridos += distancia;
				combustible -= distancia / 5;
				System.out.println("El camion ha recorrido" + distancia + "KM");
			}else{
				System.out.println("No hay suficiente combustible para recorrer esa distancia.");
			}			

		} else{
			Sysmte.out.println("El camion no tiene combustible");
}
		}
	@Override
	public double calcularAutonomia(){
		return combustible * 5;
	}

}