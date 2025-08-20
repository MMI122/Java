public class here {
  

    private int a;
    private int b;
    public here(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double[] getting(){
        return a;
    }
    public double[] gettingerr() {
        return b;
    }
    public double[] setting(int a) {
        a = 15;
        return a;
    }
    public double[] settingerr(int b) {
        b = 20;
        return b;
    }

}
