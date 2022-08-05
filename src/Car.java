public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount, true, false);
    }

    @Override
    public String toString() {
        return "Автомобиль:" + getModelName() +
                " Количество колес:" + getWheelsCount() +
                " Наличие двигателя:" + isEngine();
    }
}