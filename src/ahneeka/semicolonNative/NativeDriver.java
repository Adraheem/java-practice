package ahneeka.semicolonNative;

public class NativeDriver {
    public static void main(String[] args) {
        Laptop dell = new Laptop("Latitude", "Dell");
        Laptop lenovo = new Laptop("ThinkPad", "Lenovo");
        Phone tecno = new Phone("Tecno", "Spark 4", 6.0, ChargerType.TYPE_B);
        Phone itel = new Phone("itel", "itel 10",7.8,ChargerType.TYPE_B);

        Native ahneeka = new Native("Ahneeka", "345", "ahneeka@gmail.com",
                Cohort.COHORT_13, dell);
        ahneeka.setPhone(tecno);
        Native amirah = new Native("Amirah", "667", "amirah@gmail.com");
        amirah.setLaptop(lenovo);
        amirah.setPhone(itel);

        System.out.println(ahneeka);
        System.out.println(amirah);
    }
}
