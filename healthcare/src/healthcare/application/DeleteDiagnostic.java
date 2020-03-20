package healthcare.application;
import java.util.Scanner;

import healthcare.services.AdminService;
import healthcare.services.AdminServiceImpl;


public class DeleteDiagnostic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AdminService service=new AdminServiceImpl();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter code to delete center: ");
		int n=s.nextInt();
		int rows=service.deleteDiagnosticCenter(n);
		if(rows>0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
	}

}
