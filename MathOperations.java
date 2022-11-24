
import java.rmi.Remote;

public interface MathOperations extends Remote {
	
	public int add(int x, int y) throws Exception;
	
	public int subtract(int x, int y) throws Exception;
	
	public int multiply(int x, int y) throws Exception;
	
	public int divide(int x, int y) throws Exception;
	
}
