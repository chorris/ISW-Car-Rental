//CategoryDAOImp
package persistence;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;

import persistence.dto.CustomerDTO;
import exceptions.DAOException;

public class CustomerDAOImp implements ICustomerDAO {
	protected ConnectionManager connManager;

	public CustomerDAOImp() throws DAOException {
		super();
		try {
			connManager= new ConnectionManager("vehiclerentalDB");
			}
		catch (ClassNotFoundException e) {
			throw new DAOException(e);
			}
		}
	

	  
	public List <CustomerDTO> getCustomers() throws DAOException {
		try {
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from CUSTOMER");
			connManager.close();
			
			List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();
			
			try {
				while (rs.next()){
					CustomerDTO cusDTO = new CustomerDTO(
							rs.getString("DNI"),
							rs.getString("NAMEANDSURNAME"),
							rs.getString("ADDRESS"),
							rs.getString("CITY"),
							rs.getString("POSTALCODE"),
							LocalDateTime.of(rs.getDate("DATEDRIVERLICENSE").toLocalDate(), rs.getTime("DATEDRIVERLICENSE").toLocalTime()),
							rs.getString("DIGITSCC"),
							rs.getInt("MONTHCC"),
							rs.getInt("YEARCC"),
							rs.getInt("CVCCC"),
							rs.getString("TYPECC"));
					
					customerDTOList.add(cusDTO);
					}
				return customerDTOList;
			}
			catch (Exception e){throw new DAOException(e);}
		}
		catch (SQLException e){throw new DAOException(e);}	
		catch (DAOException e){throw e;}
	
	}

	  
	public CustomerDTO findCustomer(String dni)throws DAOException{
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from CUSTOMER where DNI= '"+dni+"'");
			connManager.close();
		
			if (rs.next())
				return new CustomerDTO(
						rs.getString("DNI"),
						rs.getString("NAMEANDSURNAME"),
						rs.getString("ADDRESS"),
						rs.getString("CITY"),
						rs.getString("POSTALCODE"),
						LocalDateTime.of(rs.getDate("DATEDRIVERLICENSE").toLocalDate(), rs.getTime("DATEDRIVERLICENSE").toLocalTime()),
						rs.getString("DIGITSCC"),
						rs.getInt("MONTHCC"),
						rs.getInt("YEARCC"),
						rs.getInt("CVCCC"),
						rs.getString("TYPECC"));
			else
				return null;
			
		}
		catch (SQLException e){	throw new DAOException(e);}	
	}
	
	public void createCustomer(CustomerDTO c) throws DAOException{
		try{
			connManager.connect();
			connManager.updateDB("INSERT INTO CUSTOMER VALUES ('"+c.getDni()+"','"+c.getNameAndSurname()+"','"+c.getAddress()+"','"+c.getCity()+"','"+c.getPostalCode()+"',"+c.getDateDriverLicense()+",'"+c.getDigitsCC()+"',"+c.getMonthCC()+","+c.getYearCC()+","+c.getCvcCC()+","+c.getTypeCC()+")");;
			connManager.close();
			
		}
		catch (SQLException e){	throw new DAOException(e);}
	}
}
