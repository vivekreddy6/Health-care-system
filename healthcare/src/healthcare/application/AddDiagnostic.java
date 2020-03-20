package healthcare.application;

import java.util.Scanner;

import healthcare.dto.Diagnostic;
import healthcare.services.AdminService;
import healthcare.services.AdminServiceImpl;

public class AddDiagnostic {
	public static void main(String[] args) {
		int a;
		float c;
		String b,d;
		Long e;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the diagnostic code");
		a=s.nextInt();
		System.out.println("Enter the diagnostic center");
		b=s.next();
		System.out.println("Enter the Center id");
		c=s.nextFloat();
		System.out.println("Enter Address of Center: ");
		d=s.next();
		System.out.println("Enter the contact of Center: ");
		e=s.nextLong();
		Diagnostic diagnostic=new Diagnostic(a,b,c,d,e);
		AdminService service=new AdminServiceImpl();
		int rows=service.addDiagnosticCenter(diagnostic);
		if(rows>0)
			System.out.println("added");
		else
			System.out.println("not added");
	}

}
