package sopra.monRdv.monrdv.model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Personne {
	
	private String numeroSS; 
	private String email; 
	private Date dtNaissance;
	
	private ArrayList<RendezVous> rdvs = new ArrayList<RendezVous>(); 

	
	public Patient() {
		super();
	}

	
	public String getNumeroSS() {
		return numeroSS;
	}

	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public ArrayList<RendezVous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(ArrayList<RendezVous> rdvs) {
		this.rdvs = rdvs;
	} 
	
	
	
}
