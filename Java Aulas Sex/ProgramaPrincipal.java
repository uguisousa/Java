package veiculos;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();
		novoCarro.marca = "VW";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.km = 15560;
		
		System.out.println("Marca: " + novoCarro.marca);
		System.out.println("Modelo: " + novoCarro.modelo);
		System.out.println("Cor: " + novoCarro.cor);
		System.out.println("Km: " + novoCarro.km);
		
		System.out.println();
		
		Carro novoCarro2 = new Carro();
		novoCarro2.marca = "Chevrolet";
		novoCarro2.modelo = "Onix";
		novoCarro2.cor = "Preto";
		novoCarro2.km = 22350;
		
		System.out.println("Marca: " + novoCarro2.marca);
		System.out.println("Modelo: " + novoCarro2.modelo);
		System.out.println("Cor: " + novoCarro2.cor);
		System.out.println("Km: " + novoCarro2.km);
		
		System.out.println();
		
		Carro novoCarro3 = new Carro();
		novoCarro3.marca = "Fiat";
		novoCarro3.modelo = "Palio";
		novoCarro3.cor = "Prata";
		novoCarro3.km = 0;
		
		System.out.println("Marca: " + novoCarro3.marca);
		System.out.println("Modelo: " + novoCarro3.modelo);
		System.out.println("Cor: " + novoCarro3.cor);
		System.out.println("Km: " + novoCarro3.km);
		

	}

}
