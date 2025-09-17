public class TrianguloEquilatero extends FiguraGeometrica
{
    double lado = 0;
    public static double RAIZ_TRES_SOB_QUATRO = (Math.sqrt(3))/4;
    public static double TRES = 3;

    public TrianguloEquilatero(String cor, double lado)
    {
        super(cor);
        this.lado = lado;
    }

    public double getLado()
    {
        return lado;
    }

    public void setLado(double novoLado)
    {
        this.lado = novoLado;
    }

    @Override
    public double calcularArea()
    {
        
        return  RAIZ_TRES_SOB_QUATRO*(Math.pow(lado, 2));
    }

    @Override
    public double calcularPerimetro()
    {
        return TRES * lado;
    }

    @Override
    public String getTipoFigura()
    {
        return "Triângulo Equilátero";
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + " " + "Tipo:" + " " + getTipoFigura() + " " + "Lado:" + " " + Double.toString(lado);
    }

    @Override
    public String getDetalhes()
    {
        return "Lado:" + " " + Double.toString(lado);
    }

    
}
