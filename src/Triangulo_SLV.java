
public class Triangulo_SLV extends FiguraGeometrica_SLV {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_SLV(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
