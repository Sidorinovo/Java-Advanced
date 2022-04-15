package Exercise05;

public class Car {
//model, engine, weight and color
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.color = "n/a";
        this.weight = -1;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
        this.weight = -1;
    }

    public Car(String model, Engine engine, int weight, String color){
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        //<CarModel>:
        //<EngineModel>:
        //Power: <EnginePower>
        //Displacement: <EngineDisplacement>
        //Efficiency: <EngineEfficiency>
        //Weight: <CarWeight>
        //Color: <CarColor>
        if(this.weight < 0){
            return String.format("%s:\n" + this.engine.toString() + "\nWeight: %s\nColor: %s",this.model, "n/a", this.color);
        }
        return String.format("%s:\n" + this.engine.toString() + "\nWeight: %d\nColor: %s",this.model, this.weight, this.color);
    }
}
