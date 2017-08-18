
public class Aluno {
	//atributos
	private String nome;
	private String ra;
	private int idade;
	private String curso;
	private String turno;
	private String sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Aluno(String nome, String ra, int idade, String curso, String turno, String sexo) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.idade = idade;
		this.curso = curso;
		this.turno = turno;
		this.sexo = sexo;
	}
	
	public String imprimirAluno(){
		return "dados do aluno\n"+ 
				this.nome + "\n" +
				this.ra  + "\n" +
				this.idade + "\n" +
				this.curso +this.turno + "\n" +
				this.sexo + "\n";
		
	}
	

}
