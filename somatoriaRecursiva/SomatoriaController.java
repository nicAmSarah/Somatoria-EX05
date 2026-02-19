package somatoriaRecursiva;

public class SomatoriaController {
	public SomatoriaController() {
		
	}
	
	public double somatoria(int num) {
		if (num == 1) {
			return 1;
		}
		
		return  somatoria(num - 1) + (1.0 / num);
	}
}
