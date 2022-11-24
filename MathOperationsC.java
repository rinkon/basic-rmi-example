import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathOperationsC extends UnicastRemoteObject implements MathOperations {
	
	public MathOperationsC() throws RemoteException {
		super();
	}

	@Override
	public int add(int x, int y) throws Exception {
		return x + y;
	}

	@Override
	public int subtract(int x, int y) throws Exception {
		return x - y;
	}

	@Override
	public int multiply(int x, int y) throws Exception {
		return x * y;
	}

	@Override
	public int divide(int x, int y) throws Exception {
		return x / y;
	}

}
