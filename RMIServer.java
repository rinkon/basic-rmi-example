import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		MathOperationsC mc = new MathOperationsC();
		Naming.rebind("MATH_OPERATIONS", mc);
		
		System.out.println("SERVER STARTED...");
	}
}
