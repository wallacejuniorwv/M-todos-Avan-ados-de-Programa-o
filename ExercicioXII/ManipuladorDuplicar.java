package ExercicioXII;

public class ManipuladorDuplicar extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string + " " + string;
	}
}
