public class CentralSystem
{
    private static CentralSystem instance;
    private String customer;
    private boolean isCustomerVisiting;
    private Integer queueNo;

    private CentralSystem(){

    }
    public static synchronized CentralSystem getInstance(){
        if (instance == null)
            instance = new CentralSystem();
        return instance;
    }

    public synchronized boolean isCustomerVisiting(){
        return isCustomerVisiting;
    }

    public synchronized void newCustomer(String customer){
        queueNo = 0;
        if(!isCustomerVisiting) {
            while (isCustomerVisiting = true) {
                this.customer = customer;
                queueNo = queueNo + 1;
                System.out.println(customer + " here's your queueing number: " + queueNo);
                break;
            }
        }else
            System.out.println(customer + " failed to get queueing number");
    }
    public synchronized void quittingCustomer(){
        isCustomerVisiting = false;
        System.out.println(customer + " left the queue");
        queueNo = queueNo - 1;
    }

}
