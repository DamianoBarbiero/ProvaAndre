package comums;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemortoImplv extends UnicastRemoteObject implements ServicoRemoto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4575782489488595222L;
	private static List<Veterinario> lstVeterinario = new ArrayList<>();

	public ServicoRemortoImplv() throws RemoteException{
	}
	
	@Override
	public void inserir(Veterinario v) throws RemoteException{
		lstVeterinario.add(v);
	}
	
	@Override
	public List<Veterinario> listarVeterinario() throws RemoteException{
		return lstVeterinario;
	
	}
}
