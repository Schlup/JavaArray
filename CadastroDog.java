package AprendendoArray;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDog {
	public static void main(String[] args) {
		int max = 2;
		Scanner ler = new Scanner(System.in);
		ArrayList<Dog> dogList = new ArrayList<>();
		
		System.out.println("Cadastrando...");
		
		for(int i=0; i<max; i++) {
			Dog currentDog = new Dog();
			System.out.println("Informe o nome do cachorro ("+(i+1)+"/"+max+")");
			currentDog.setName(ler.next());
			System.out.println("Informe a idade do cachorro ("+(i+1)+"/"+max+")");
			currentDog.setAge(ler.nextInt());
			dogList.add(currentDog);
		}
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.getName()+", "+ dog.getAge());
		}
		ler.close();		
	}
}
