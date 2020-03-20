package healthcare.services;

import healthcare.dao.AdminDao;
import healthcare.dao.AdminDaoImpl;
import healthcare.dto.Diagnostic;

public class AdminServiceImpl implements AdminService {
	AdminDao dao=new AdminDaoImpl();
	@Override
	public int addDiagnosticCenter(Diagnostic diagnostic)
	{
		int rows=dao.addDiagnosticCenter(diagnostic);
		return rows;
	}
	@Override
	public int deleteDiagnosticCenter(int diacode)
	{
		// TODO Auto-generated method stub
		int rows=dao.deleteDiagnosticCenter(diacode);
		return rows;
	}

}
