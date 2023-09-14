package AprendendoArray;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastroContactV1 {
	public static void main(String[] args) {
		int max = 2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("####################");
		System.out.println("Cadastro de Contatos");
		System.out.println("####################\n");
		
		ArrayList<Contact> contactList = new ArrayList<>();		
		
		for(int i=0; i<max; i++) {
			Contact currentContact = new Contact();
			System.out.println("Informe o nome do contato ("+(i+1)+"/"+max+")");
			currentContact.setName(ler.nextLine());
			System.out.println("Informe o email do contato ("+(i+1)+"/"+max+")");
			currentContact.setEmail(ler.nextLine());
			System.out.println("Informe o telefone do contato ("+(i+1)+"/"+max+")");
			currentContact.setPhone(ler.nextLine());
			contactList.add(currentContact);
		}
		System.out.println("Contatos cadastrados: ");
		for(int i=0; i<contactList.size(); i++) {
			Contact contact = contactList.get(i);
			System.out.println(contact.getName()+", "+contact.getEmail()+", "+contact.getPhone());
		}
		ler.close();
	}
}
