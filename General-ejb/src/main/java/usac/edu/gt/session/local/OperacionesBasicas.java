package usac.edu.gt.session.local;


public class OperacionesBasicas  {
	
	public double suma(double num1, double num2){
		
		return num1 + num2;
	}

	public double resta(double num1, double num2){
		
		return num1 - num2;
	}

	public double multiplicacion(double num1, double num2){
		
		return num1 * num2;
	}

	public double division(double num1, double num2){
		
		return num1 / num2;
	}
	
	public int potencia(int base, int pot){

        int result = 1;

        while (pot != 0)
        {
            result *= base;
            --pot;
        }
		return result;
	}
}
