package AtividadeBuild;


	public static class BuilderChicago {

	    private final Dough Dough;
		private final Sauce Sauce;
		private final Veggies[] mVeggies;
		private final Pepperoni mPepperoni;
		private final Clams mClams;

	    /**
	     * Constructor
	     */
	    public BuilderChicago(Dough dough, Sauce sauce) {
			if (dough == null || sauce == null) {
	        throw new IllegalArgumentException("dough and sauce can not be null");
	      }
	      this.mDough = dough;
	      this.mSauce = sauce;
		  
	    }
	
}
