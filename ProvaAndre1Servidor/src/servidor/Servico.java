package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import comums.ServicoRemortoImplv;


public class Servico {
	
	public Servico() throws RemoteException{
		try {
			LocateRegistry.createRegistry(8282);
			System.out.println("INICIO");
			Naming.rebind("rmi://localhost:8282/veterinario", new ServicoRemortoImplv());
			System.out.println("FIM");			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws RemoteException {
		new Servico();
	}

}
