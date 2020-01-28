
public abstract class FiguraGeometrica_SLV {
	
	public double area1() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

	protected String tipoFigura;

	public FiguraGeometrica_SLV(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
