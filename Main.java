import java.util.ArrayList;
import java.util.Collection;

public class Main<E> extends Generic {
    public static void main(String[] args) {
        Generic list = new Generic();
        Generic list2 = new Generic();
       
        list.addItem(new Atk("A001", "pensil", "faber castel", 10));
        list.addItem(new Atk("A002", "pulpen", "kenko",30));
        list.addItem(new Atk("A009", "pulpen", "joyko", 26));
        list.addItem(new Atk("A007", "pulpen", "deli", 40));
        list.addItem(new Atk("A002", "spidol", "faber castel", 20));
        list.addItem(new Atk("A002", "spidol", "kenko", 10));


        list2.addItem(new Bag("C004", "tas", "faber castel", 50));
        list2.addItem(new Bag("C005", "tas", "faber castel", 20));
        list2.addItem(new Bag("C003", "tas", "faber castel", 30));
        list2.addItem(new Bag("C002", "tas", "faber castel", 10));
        list2.addItem(new Bag("C001", "tas", "faber castel", 40));

        list.removeItem(1);
        list.editItem(1, new Atk("A010", "pensil", "faber castel", 10));

        list.print();
        list2.print();
        
    }
}