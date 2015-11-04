//ICustomerDAO
package persistence;

import exceptions.*;
import persistence.dto.CustomerDTO;

public interface ICustomerDAO {
	public CustomerDTO findCustomer(String dni)throws DAOException;
	
	public void createCustomer(CustomerDTO customer) throws DAOException;
}