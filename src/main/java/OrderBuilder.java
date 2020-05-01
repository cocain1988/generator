import java.util.ArrayList;
import java.util.Random;

public class OrderBuilder {
    private Order order;
    private Random rnd = new Random();
    private ArrayList<Order> orders = new ArrayList<>();

    private void setPrefixOrder(){
        order = new Order();
        ArrayList<String> prefix = new ArrayList<>();
        prefix.add("TXT");
        prefix.add("INC");
        prefix.add("DDL");
        prefix.add("BSS");
        prefix.add("OSS");
        prefix.add("PBX");
        prefix.add("TFS");
        order.setName(prefix.get(rnd.nextInt(7)));
        order.setPos1(rnd.nextInt(10000));
    }

    private void generatePosition(){
        order.setPos2(rnd.nextInt(25));
        order.setPos3(rnd.nextInt(150));
        order.setPos4(rnd.nextInt(250));
        order.setPos5(rnd.nextInt(500));
    }

    public String getOrder(){
        this.setPrefixOrder();
        this.generatePosition();
        return order.getStringOrder();
    }

    private Order buildOrder(){
        this.setPrefixOrder();
        this.generatePosition();
        return order;
    }

    public ArrayList<String> getOrders(int countOrders){
        for (int i = 0; i<=countOrders; i++)
            orders.add(this.buildOrder());

        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j<=countOrders; j++)
            list.add(orders.get(j).getStringOrder());
        return list;
    }

}
