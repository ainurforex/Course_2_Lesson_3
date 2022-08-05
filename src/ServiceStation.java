public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport.isEngine()) {
            transport.checkEngine();
        }
        if (transport.isTrailer()) {
            transport.checkTrailer();
        }
    }
}

