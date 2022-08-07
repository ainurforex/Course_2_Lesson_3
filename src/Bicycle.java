public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Велосипед:" + getModelName() +
                " Количество колес:" + getWheelsCount();
    }
}