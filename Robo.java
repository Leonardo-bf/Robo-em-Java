public class Robo {
    private final int DRE = 122117670;
    private final String nome = "Leonardo de Barros Fernandes";
    public int horizontal;
    public int vertical;
    public int l;
    public int c;
    public boolean GO_Center;
    public int id;
    public GPS g1;
    public int l_anterior;
    public int c_anterior;
    public int centro_l;
    public int centro_c;

    public Robo(int id, GPS g1){
        this.GO_Center = true;
        this.id = id;
        this.g1 = g1;
    }

    public Move MOVE(){
        horizontal = g1.getL(id);
        vertical = g1.getC(id);
        c_anterior = vertical-1;
        l_anterior = horizontal-1;
        while(c_anterior != vertical){
            c_anterior = vertical;
            g1.move(Move.RIGHT);
            vertical = g1.getC(id);
            System.out.println(Move.RIGHT);
        }
        c = vertical;
        System.out.println(c);
        while(l_anterior != horizontal){
            l_anterior = horizontal;
            g1.move(Move.DOWN);
            horizontal = g1.getL(id);
            System.out.println(Move.DOWN);
        }
        l = horizontal;
        System.out.println(l);
        centro_l = horizontal / 2 + 1;
        centro_c = vertical / 2 + 1;
        while (GO_Center) {

            if (horizontal < centro_l) {
                g1.move(Move.RIGHT);
                System.out.println(Move.RIGHT);
                horizontal = g1.getL(id);
                System.out.println(horizontal);
            } else if (horizontal > centro_l) {
                g1.move(Move.LEFT);
                System.out.println(Move.LEFT);
                horizontal = g1.getL(id);
                System.out.println(horizontal);
                horizontal = g1.getL(id);
            }
            if (vertical > centro_c) {
                g1.move(Move.UP);
                System.out.println(Move.UP);
                vertical = g1.getC(id);
                System.out.println(vertical);
            } else if (vertical < centro_c) {
                g1.move(Move.DOWN);
                System.out.println(Move.DOWN);
                vertical = g1.getC(id);
                System.out.println(vertical);
            }
            else{
                return Move.STOP;
            }
        }
        return Move.STOP;
    }
    public int getDRE(){
        return this.DRE;
    }
    public String getNome(){
        return this.nome;
    }
    public void print(){
        System.out.println(getNome());
        System.out.println(getDRE());
    }
}
