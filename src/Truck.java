public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount, true, true);
    }

    @Override
    public String toString() {
        return "Грузовик:" + getModelName() +
                " Количество колес:" + getWheelsCount() +
                " Наличие двигателя:" + isEngine() +
                " Наличие прицепа:" + isTrailer();
    }
}