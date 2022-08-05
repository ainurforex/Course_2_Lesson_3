public abstract class Transport {
    private String modelName;
    private int wheelsCount;
    private boolean engine;
    private boolean trailer;

    public Transport(String modelName, int wheelsCount, boolean engine, boolean trailer) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.engine = engine;
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Имя модели:" + modelName +
                " Количество колес:" + wheelsCount +
                " Наличие двигателя:" + engine +
                " Наличие прицепа:" + trailer;
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public boolean isEngine() {
        return engine;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        if (engine == true) {
            System.out.println("Проверяем двигатель");
        } else System.out.println("Двигателя нет");
    }

    public void checkTrailer() {
        if (trailer == true) {
            System.out.println("Проверяем прицеп");
        } else System.out.println("Прицепа нет");
    }
}
