public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo Status " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("\nNovo Status " + smartTv.ligada);

    }
}