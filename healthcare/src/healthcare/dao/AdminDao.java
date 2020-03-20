package healthcare.dao;

import healthcare.dto.Diagnostic;
public interface AdminDao {
	public void openConnection();
	public void close();
	public int addDiagnosticCenter(Diagnostic diagnostic);
	public int deleteDiagnosticCenter(int diacode);

}
