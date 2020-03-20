package healthcare.services;

import healthcare.dto.Diagnostic;

public interface AdminService {
	public int addDiagnosticCenter(Diagnostic diagnostic);
	public int deleteDiagnosticCenter(int diacode);
}
