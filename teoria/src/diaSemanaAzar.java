public class diaSemanaAzar {
    public static void main(String[] args) {
        int dia = (int)(Math.random() * 7);

        switch (dia){
            case 0:
                System.out.println("Lunes"); break;
            case 1:
                System.out.println("Martes"); break;
            case 2:
                System.out.println("Miércoles"); break;
            case 3:
                System.out.println("Jueves"); break;
            case 4:
                System.out.println("Viernes"); break;
            case 5:
                System.out.println("Sábado"); break;
            case 6:
                System.out.println("Domingo"); break;
        }
    }
}
