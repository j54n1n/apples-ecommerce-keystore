package interfaces;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface KeyManagerInt {
	@WebMethod
	public String getPrivatekey(String customerId);
	
	@WebMethod
	public boolean insertNewKey(String customerId, String privateKey);
	
	@WebMethod
	public boolean updatePrivateKey(String customerId, String privateKey) throws SQLException;
}
