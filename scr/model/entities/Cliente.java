package model.entities;

public class Cliente {
	private int cliid;
	private String clinome;
	private String clisenha;
	private String cliemail;
	private String clitelefone;
	
	public int getCliid() {
		return cliid;
	}

	public void setCliid(int cliid) {
		this.cliid = cliid;
	}
	
	public String getCliemail() {
		return cliemail;
	}

	public void setCliemail(String cliemail) {
		this.cliemail = cliemail;
	}

	public String getClitelefone() {
		return clitelefone;
	}

	public void setClitelefone(String clitelefone) {
		this.clitelefone = clitelefone;
	}

	public String getClinome() {
		return clinome;
	}
	
	public void setCliome(String nome) {
		this.clinome = nome;
	}
	
	public String getClisenha() {
		return clisenha;
	}
	
	public void setClisenha(String senha) {
		this.clisenha = senha;
	}
	
}
