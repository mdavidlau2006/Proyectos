public class App {
    public static void main(String[] args) throws Exception {
        float peso = 40;
        if (peso <= 30) {
            System.out.println("Estas delgado");
        } else if (peso > 30 && peso <= 50) {
            System.out.println("Estas en el peso normal");
        } else if (peso > 50 && peso <= 70) {
            System.out.println("Estas gordo");
        } else {
            System.out.println("Estas obeso");
        }
    }
}
