public class OfficeMebel implements Wooden {
    private String name;
    private double kolichestvo;

    public OfficeMebel(String name) {
        this.name = name;
    }

    public OfficeMebel(String name, int shtuk) {
        this.name = name;
        this.kolichestvo = shtuk;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OfficeMebel) {
            return (name.equals(((OfficeMebel) obj).getName()));
        } else {
            return false;
        }
    }


    public void dobavitKolichestvo(int kolichestvo) {
        if (kolichestvo > 0) {
            this.kolichestvo += kolichestvo;
        } else {
            System.out.println("Не может быть отрицательным");
        }
//        if (kolichestvo < 0) {
//            System.out.println("Не может быть отрицательным");
//        }
    }
    public void vichestKolichestvo(int kolichestvo) {
        this.kolichestvo -= kolichestvo;
    }
    public void umnozhitKolichestvo(int kolichestvo) {
        this.kolichestvo *= kolichestvo;
        if (this.kolichestvo > 20) {
            System.out.println("Склад почти полный");
        }
//        else if (this.kolichestvo > 25) {
//            System.out.println("Склад полный");
//        }




    }
    public void delenieKolichestvo(int kolichestvo) {
        this.kolichestvo /= kolichestvo;
    }
    public double getKolichestvo() {
        return kolichestvo;
    }
    public String getName() {
        return name;
    }

    @Override
    public void wood() {

    }
}
