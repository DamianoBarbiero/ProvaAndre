package veterinariopr;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comums.ServicoRemoto;
import comums.Veterinario;

public class AppPrincipal {

	public static void main(String[] args) {
		try {
		 ServicoRemoto objvet = (ServicoRemoto) Naming.lookup("rmi://localhost:8282/veterinario");
			
		 Veterinario vt = new Veterinario ();
		 
		 vt.setId(1);
		 vt.setNome("Joaquim");
		 vt.setCpf("123456789");
		 
		 Veterinario vt2 = new Veterinario ();
		 
		 vt2.setId(2);
		 vt2.setNome("Joana");
		 vt2.setCpf("741852963");

		 Veterinario vt3 = new Veterinario ();
		 
		 vt3.setId(3);
		 vt3.setNome("Maria");
		 vt3.setCpf("987654321");
		 
		 objvet.inserir(vt);
		 objvet.inserir(vt2);
		 objvet.inserir(vt3);
		 
		 for(Veterinario vet : objvet.listarVeterinario()) {
			 System.out.println("ID : " + vet.getId());
			 System.out.println("Nome : " + vet.getNome());
			 System.out.println("Cpf : " + vet.getCpf());
			 System.out.println("-------------------------------------------");
		 }
		 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}
