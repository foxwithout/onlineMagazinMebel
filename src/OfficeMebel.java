public class OfficeMebel {
    private String name;
    private double kolichestvo;

    public OfficeMebel(String name, int shtuk) {
     this.name = name;
     this.kolichestvo = shtuk;

    }

    public static void main(String[] args) {
        OfficeMebel shkaf = new OfficeMebel("Шкаф", 12);
        OfficeMebel stul = new OfficeMebel("Стул стульный", 11);

        stul.dobavitKolichestvo(5);
        System.out.println("Сумма N стульев " + stul.getKolichestvo());

        stul.vichestKolichestvo(5);
        System.out.println("Вычли N стульев " + stul.getKolichestvo());

        stul.umnozhitKolichestvo(5);
        System.out.println("Умножили N стульев " + stul.getKolichestvo());

        stul.delenieKolichestvo(2);
        System.out.println("Поделение N стульев " + stul.getKolichestvo());
    }

    public void dobavitKolichestvo(int kolichestvo) {
        this.kolichestvo += kolichestvo;
    }
    public void vichestKolichestvo(int kolichestvo) {
        this.kolichestvo -= kolichestvo;
    }
    public void umnozhitKolichestvo(int kolichestvo) {
        this.kolichestvo *= kolichestvo;
    }
    public void delenieKolichestvo(int kolichestvo) {
        this.kolichestvo /= kolichestvo;
    }
    public double getKolichestvo() {
        return kolichestvo;
    }
}
