public class MonitoringSystem
{

    public static void main(String[] args){
        CentralSystem centralSystem = CentralSystem.getInstance();

        centralSystem.newCustomer("Hoshi");
        centralSystem.newCustomer("Mingyu");
        centralSystem.newCustomer("Joshua");

        centralSystem.quittingCustomer();

        centralSystem.newCustomer("Seungkwan");
        centralSystem.newCustomer("Jeonghan");
        centralSystem.quittingCustomer();
        centralSystem.newCustomer("Vernon");
    }
}
