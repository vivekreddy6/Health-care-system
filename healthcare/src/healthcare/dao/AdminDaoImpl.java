package healthcare.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import healthcare.dto.Diagnostic;
import healthcare.utils.AdminDBQueries;


public class AdminDaoImpl implements AdminDao {
	private Connection connection=null;
	private PreparedStatement pst;
	@SuppressWarnings("unused")
	private ResultSet result;
	@Override
	public void openConnection()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			 connection =DriverManager.getConnection(url,"vivek","vivekreddy");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
	}
	@Override
	public void close()
	{
		try
		{
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public int addDiagnosticCenter(Diagnostic diagnostic) {

		openConnection();
		int rows=0;
		try{
			pst=connection.prepareStatement(AdminDBQueries.addAdminQuery);
			pst.setInt(1, diagnostic.getDiacode());
			pst.setString(2, diagnostic.getCentername());
			pst.setDouble(3, diagnostic.getCenterId());
			pst.setString(4, diagnostic.getCenterAddress());
			pst.setLong(5, diagnostic.getCentercontact());
			rows=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
		close();
		}
		return rows;
	}
	@Override
	public int deleteDiagnosticCenter(int diacode) {
		openConnection();
		int rows=0;
		try{
			pst=connection.prepareStatement(AdminDBQueries.deleteAdminQuery);
			pst.setInt(1, diacode);
			rows=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return rows;
	}

}
