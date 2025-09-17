public abstract class FiguraGeometrica implements CalculosGeometricos
{
    String cor;
    int id = 0;
    static int totalFiguras = 0;

    public FiguraGeometrica(String cor)
    {
        this.cor = cor;
        totalFiguras++;
        this.id = totalFiguras;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String novaCor)
    {
        this.cor = novaCor;
    }

    public static int getTotalFiguras()
    {
        return totalFiguras;
    }

    public String getInfo()
    {
        String detalhes = "ID:" + " " + Integer.toString(id)+ " " + "Cor:" + " " + cor;

        return detalhes;
    }

    public abstract String getDetalhes();
}