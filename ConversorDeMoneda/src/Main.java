import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        Divisa divisa = consultaDivisa.cambioDivisaUSD();
        boolean correPrograma = true;
        double cambioDivisa;


        while (correPrograma) {

            String llavesDeConversion = divisa.conversion_rates().keySet().toString();
            //System.out.println(llavesDeConversion);

            System.out.println("**********************************");
            System.out.println("Escoge una opcion:");
            System.out.println("[1] USD --> EUR[Euro]");
            System.out.println("[2] USD --> MXN[Peso Mexicano]");
            System.out.println("[3] USD --> JPY[Yen Japones]");
            System.out.println("[4] USD --> CNY[Yuan Chino]");
            System.out.println("[5] USD --> GBP[Libra Esterlina]");
            System.out.println("**********************************");

            System.out.println("Escoge la opcion que desees utilizar:");
            int opcion = lectura.nextInt();

            if (opcion == 0){
                System.out.println("Cerrando el programa...");
                correPrograma = false;
            } else {

                System.out.println("Ingrese la cantidad a cambiar: ");
                int cantidad = lectura.nextInt();

                double valorTotal;

                switch (opcion) {
                    case 1:
                        cambioDivisa = divisa.conversion_rates().get("EUR");
                        valorTotal = cantidad * cambioDivisa;
                        System.out.println("Haciendo cambio USD a EUR: " + cantidad + " x " + cambioDivisa + " = " + valorTotal);
                        System.out.println("Total del cambio: " +valorTotal);
                        break;
                    case 2:
                        cambioDivisa = divisa.conversion_rates().get("MXN");
                        valorTotal = cantidad * cambioDivisa;
                        System.out.println("Haciendo cambio USD a MXN: " + cantidad + " x " + cambioDivisa + " = " + valorTotal);
                        System.out.println("Total del cambio: " +valorTotal);
                        break;
                    case 3:
                        cambioDivisa = divisa.conversion_rates().get("JPY");
                        valorTotal = cantidad * cambioDivisa;
                        System.out.println("Haciendo cambio USD a JPY: " + cantidad + " x " + cambioDivisa + " = " + valorTotal);
                        System.out.println("Total del cambio: " +valorTotal);
                        break;
                    case 4:
                        cambioDivisa = divisa.conversion_rates().get("CNY");
                        valorTotal = cantidad * cambioDivisa;
                        System.out.println("Haciendo cambio USD a CNY: " + cantidad + " x " + cambioDivisa + " = " + valorTotal);
                        System.out.println("Total del cambio: " +valorTotal);
                        break;
                    case 5:
                        cambioDivisa = divisa.conversion_rates().get("GBP");
                        valorTotal = cantidad * cambioDivisa;
                        System.out.println("Haciendo cambio USD a GBP: " + cantidad + " x " + cambioDivisa + " = " + valorTotal);
                        System.out.println("Total del cambio: " +valorTotal);
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida...");
                }

            }




        }

    }
}


