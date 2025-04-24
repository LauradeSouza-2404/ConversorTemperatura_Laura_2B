public class Temperatura {
    //Atributo privado para armazenar temp- celsius
    private double tempCelsius;
    
    //Construtor criar o objeto com uma temp inicial
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
    }
    
        
    //Getter - ler temp
    public double getTemperaturaCelsius(){
        return tempCelsius;
    }
    //Setter - mudar a temp
    public void setTemperaturaCelsius(double mudarTempCelsius){
        this.tempCelsius = mudarTempCelsius;
    }
    //metodo para converter celsius fahrenheit
        public double converteParaFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
    //metodo para converter celsius para kelvin
        public double converteParaKelvin(){
            return tempCelsius+273.15;
        }
}
