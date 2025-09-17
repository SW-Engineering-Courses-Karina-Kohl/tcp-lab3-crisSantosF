public class Retangulo extends FiguraGeometrica
{
    double lado = 0;
    double altura = 0;
    public static int DOIS = 2;

    public Retangulo(String cor, int lado, int altura)
    {
        super(cor);
        this.lado = lado;
        this.altura = altura;
    }

    ///////////////////////////////////////////////
    public double getLado()
    {
        return lado;
    }

    public void setLado(int novoLado)
    {
        this.lado = novoLado;
    }

        public double getAltura()
    {
        return altura;
    }

    public void setAltura(double novaAltura)
    {
        this.altura = novaAltura;
    }

    ///////////////////////////////////////////////
    @Override
    public double calcularArea()
    {
        
        return  altura*lado;
    }

    @Override
    public double calcularPerimetro()
    {
        return DOIS * (lado + altura);
    }

    @Override
    public String getTipoFigura()
    {
        return "Retângulo";
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + " " + "Tipo:" + " " + getTipoFigura() + " " + "Lado:" + " " + Double.toString(lado) + " " + "Altura:" + " " + Double.toString(altura);
    }

    @Override
    public String getDetalhes()
    {
        return "Lado:" + " " + Double.toString(lado) + " " + "Altura:" + " " + Double.toString(altura);
    }
}

