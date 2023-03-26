public class Canhao {
    private Bala bala;
    private final double GRAVIDADE = 9.81;

    public void setBala(Bala bala) {
        this.bala = bala;
    }

    public void disparar(double velInicial, double angInclinacao) {

        double velHorizontal = velInicial * Math.cos(Math.toRadians(angInclinacao));
        double velVertical = velInicial * Math.sin(Math.toRadians(angInclinacao));

        double tempoDeSubida = (velVertical / GRAVIDADE);
        double tempoDeLancamento = tempoDeSubida * 2;

        double distHorizontal = velHorizontal * tempoDeLancamento;
        double distVertical = velVertical * tempoDeSubida + (0.5 * (-1 * GRAVIDADE)) * Math.pow(tempoDeSubida, 2);
        setBala(new Bala());
        this.bala.setPosicaoX(distHorizontal);
        this.bala.setPosicaoY(distVertical);

    }

    public void getAlcanceMaximo() {
        disparar(100, 45);
        System.out.println(this.bala.toString());
    }
}