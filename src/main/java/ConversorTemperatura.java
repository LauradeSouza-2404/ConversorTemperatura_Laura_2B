public class ConversorTemperatura {

    public static void main(String[] args) {
        Temperatura c1 = new Temperatura(50.5);
        
        System.out.println("Temperatura em F:" + c1.converteParaFahrenheit());
    }
}
