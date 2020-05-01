
import static java.lang.Thread.sleep;

public class Generator {

    public static void main(String[] args) throws InterruptedException {
        OrderBuilder    ob = new OrderBuilder();
        ManBuilder      mb = new ManBuilder()  ;
        while (true){
            sleep(1000);
            System.out.println(mb.getManString());
        }


    }

}
