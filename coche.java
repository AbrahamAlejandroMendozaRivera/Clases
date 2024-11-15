class Coche extends Vehiculo{
	protected double combustible;
	protected double autonomiaMaxima];

	public Coche(double combustible, double autonomiaMaxima){
}
	@Override
	public void mover(){
		if (combustible > 0)
			if (distancia <=calcularAutonomia()){
				kilometrosRecorridos +- distancia;
				combustible -= distancia /10;
				System.out.println("El coche a recorrido " + distancia + "KM");
}			else{
			System.out.prinln("No hay suficiente combustible para recorrer esa distancia");	
			}
	}		else{System.out.println("El coche no tiene combustible");
}

	@Override
	public double calcularAutonomia(){
		reuturn combustible * 10;
}


}