package AtividadeBuild;

public final class PizzaStore {

	private final Dough Dough;
	private final Sauce Sauce;
	private final Veggies[] Veggies;
	private final Pepperoni Pepperoni;
	private final Clams Clams;

	private Pizza(Builder builder) {
    this.Dough = builder.dough;
    this.Sauce = builder.sauce;
    this.Veggies = builder.veggies;
    this.Pepperoni = builder.peppeoni;
    this.Clams = builder.clams;
  }

	public Dough getDough() {
		return Dough;
	}

	public Sauce getSauce() {
		return Sauce;
	}

	public Veggies[] getVeggies() {
		return Veggies;
	}

	public Pepperoni getPepperoni() {
		return Pepperoni;
	}

	public Clams getClams() {
		return Clams;
	}

	public Builder withVeggies(Veggies veggies) {
		this.Veggies = veggies;
		return this;
	}

	public Builder withmPepperoni(Pepperoni pepperoni) {
		this.Pepperoni = pepperoni;
		return this;
	}

	public Builder withClams(Clams clams) {
		this.Clams = clams;
		return this;
	}

	public Pizza build() {
		return new Pizza(this);
	}

}