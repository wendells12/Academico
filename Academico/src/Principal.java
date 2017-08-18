
public class Principal {

	public static void main(String[] args) {
		Aluno a1=new Aluno("lucas", "123456", 26, "ciencia da computacao", "matutino", "masculino");
		Disciplina d1= new Disciplina("linguagem de preogramacao 1", "ciencia da computacao", 40);
		System.out.println(a1.getNome());
		System.out.println(d1.getNome());
		
		System.out.println(a1.imprimirAluno());

	}

}
