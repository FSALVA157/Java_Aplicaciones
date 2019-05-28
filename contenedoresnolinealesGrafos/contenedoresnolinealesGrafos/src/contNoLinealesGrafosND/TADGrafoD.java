package contNoLinealesGrafosND;

public interface TADGrafoD {
	public abstract void cargaGrafo();
	public int getOrden();
	public void muestraBEA();
	public void muestraBPF();
	public void muestraDijkstra(int startVertex);
	public void muestraFloyd();
	public void muestraGrafo();

}
