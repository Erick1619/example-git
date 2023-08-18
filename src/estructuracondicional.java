public class estructuracondicional {
    public static void  main(String[] args) {
            int hor;
            double min;
            int precio;
            double pago;

            hor = 1;
            min = 40;
            precio = 1500;


            if (hor > 0) {
                if (min > 0) {
                    pago = precio * hor + precio * (min / 60);
                    System.out.println("segundo if");
                    System.out.println("el pago es: ");
                    System.out.println(pago);
                } else {
                    pago = precio * (min / 60);
                    System.out.println("segundo else");
                    System.out.println("el pago es: ");
                    System.out.println(pago);
                }
            }
        }
    }


