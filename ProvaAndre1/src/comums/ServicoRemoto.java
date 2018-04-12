package comums;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServicoRemoto extends Remote{

	void inserir(Veterinario v) throws RemoteException;
	List<Veterinario> listarVeterinario() throws RemoteException;
	
}
