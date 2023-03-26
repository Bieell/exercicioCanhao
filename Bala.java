public class Bala {
    private double posicaoX;
    private double posicaoY;

    public double getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }

    public double getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }

    @Override
    public String toString() {
        return String.format("""
                Bala:
                Altura máxima: %.2f m
                Distância máxima: %.2f m
                """, getPosicaoY(), getPosicaoX());
    }

}
