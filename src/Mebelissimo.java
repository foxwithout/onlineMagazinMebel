import java.util.ArrayList;
import java.util.List;

public class Mebelissimo {

    public static void main(String[] args) {
        OfficeMebel shkaf = new OfficeMebel("Шкаф", 12);
        OfficeMebel stul = new OfficeMebel("Стул стульный", 11);

        List<OfficeMebel> officeMebels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            OfficeMebel stulSp = new OfficeMebel("Стулъ Номер " + (i + 1), 0);
            officeMebels.add(stulSp);

        }
        for (int i = 0; i < 5; i++) {
            OfficeMebel stulSp = new OfficeMebel("Шкафъ Номер " + (i + 1), 0);
            officeMebels.add(stulSp);

        }
        for (OfficeMebel t : officeMebels) {
            //System.out.println(t);
            System.out.println(t.getName());

        }

        stul.dobavitKolichestvo(-5);
        System.out.println("Сумма N стульев " + stul.getKolichestvo());

        stul.vichestKolichestvo(5);
        System.out.println("Вычли N стульев " + stul.getKolichestvo());

        stul.umnozhitKolichestvo(5);
        System.out.println("Умножили N стульев " + stul.getKolichestvo());

        stul.delenieKolichestvo(2);
        System.out.println("Поделение N стульев " + stul.getKolichestvo());

        //stul.vichestKolichestvo(15);

        double stulNaSklade = stul.getKolichestvo();

        if (stulNaSklade <= 0) {
            System.out.println("Невозможно приобрести");
        } else {
            do {
                stulNaSklade--;
                System.out.println("Был приобретён стул и осталось " + stulNaSklade);
            } while (stulNaSklade > 1);
        }
    }
}
