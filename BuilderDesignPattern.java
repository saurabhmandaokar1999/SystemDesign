class Pizza{
    private final long customerId; 
    private final String base;
    private final int size;
    private final boolean tomato;
    private final boolean cheese;

    private Pizza(PizzaBuilder builder){
        this.customerId = builder.customerId;
        this.base = builder.base;
        this.size = builder.size;
        this.tomato = builder.tomato;
        this.cheese = builder.cheese;
    }
    //static class to access outside of this class withoput outside object
    public static class PizzaBuilder{
        private final long customerId;
        private String base;
        private int size;
        private boolean tomato;
        private boolean cheese;

        public PizzaBuilder(long customerId){
            this.customerId = customerId;
        }

        public PizzaBuilder setBase(String base){
            this.base = base;
            return this;
        }
        public PizzaBuilder setSize(int size){
            this.size = size;
            return this;
        }
        public PizzaBuilder wantTomato(boolean tomato){
            this.tomato = tomato;
            return this;
        }
        public PizzaBuilder wantCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public Pizza order(){
            return new Pizza(this);
        }
    }
}

class pizzaTest{
    public static void main(String[] args){
        // not work cannot directly access pizza
       // Pizza p = new Pizza();

       Pizza  p = new Pizza.PizzaBuilder(101).setBase("Thin crust").setSize(6).wantCheese(true).order();
    }
}