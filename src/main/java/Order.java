public class Order {

    private String name;
    private int pos1;
    private int pos2;
    private int pos3;
    private int pos4;
    private int pos5;

    public String getName() {
        return ""+name+""+pos1+"";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPos1() {
        return pos1;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public int getPos2() {
        return pos2;
    }

    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }

    public int getPos3() {
        return pos3;
    }

    public void setPos3(int pos3) {
        this.pos3 = pos3;
    }

    public int getPos4() {
        return pos4;
    }

    public void setPos4(int pos4) {
        this.pos4 = pos4;
    }

    public int getPos5() {
        return pos5;
    }

    public void setPos5(int pos5) {
        this.pos5 = pos5;
    }

    public String getStringOrder(){
        return "("+getName()+") - "+getPos2()+" - "+getPos3()+" - "+getPos4()+" - "+getPos5()+" |";
    }
}
