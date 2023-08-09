public class Test {

    static String[][] peopleData = new String[][]{ 
        {"Ana", "Paulo", "Márcia", "Pedro",  "Beatriz"},
        {"1.70", "1.72", "1.62", "1.90", "1.53" },
        {"80", "90", "61", "84", "49"}
    };

    public static void main(String[] args) throws Exception {

        getAverageHeight();
        getAverageWeight();
        getAllBMI();
        getTallest();
        getShortest();
        getHeaviest();
        getLightest();
        getHighestBMI();
        getLowestBMI();

    }

    private static void getAverageHeight() {
        double sum = 0;

        for(int i=0; i<peopleData[1].length; i++) {
            sum += Double.parseDouble(peopleData[1][i]);
        }

        double average = sum/peopleData[1].length;

        System.out.print("A média aritmética da altura das pessoas é ");
        System.out.printf("%.2f", average);
        System.out.println(" m");
    }

    private static void getAverageWeight() {
        double sum = 0;

        for(int i=0; i<peopleData[2].length; i++) {
            sum += Double.parseDouble(peopleData[2][i]);
        }

        double average = sum/peopleData[2].length;

        System.out.print("A média aritmética do peso das pessoas é ");
        System.out.printf("%.2f", average);
        System.out.println(" kg");
    }

    private static void getAllBMI() {

        for(int i=0; i<peopleData[0].length; i++) {

            String name = peopleData[0][i];
            double height = Double.parseDouble(peopleData[1][i]);
            double weight = Double.parseDouble(peopleData[2][i]);
            double bmi = (height*height)/weight;
            System.out.print("O IMC de " + name + " é ");
            System.out.printf("%.2f", bmi);
            System.out.println("");
            
        }
    }

    private static void getTallest() {
        double tallestHeight = Double.NEGATIVE_INFINITY;
        String name = "";

        for(int i=0; i<peopleData[0].length; i++) {
            double height = Double.parseDouble(peopleData[1][i]);

            if (height > tallestHeight) {
                tallestHeight = height;
                name = peopleData[0][i];
            } else {
                if (height == tallestHeight) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Mais alto(s): " + name + "  mede(m) ");
        System.out.printf("%.2f", tallestHeight);
        System.out.println(" m");
    }

    private static void getShortest() {
        double shortestHeight = Double.POSITIVE_INFINITY;
        String name = "";

        for(int i=0; i<peopleData[0].length; i++) {
            double height = Double.parseDouble(peopleData[1][i]);

            if (height < shortestHeight) {
                shortestHeight = height;
                name = peopleData[0][i];
            } else {
                if (height == shortestHeight) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Mais baixo(s): " + name + "  mede(m) ");
        System.out.printf("%.2f", shortestHeight);
        System.out.println(" m");
    }


    private static void getHeaviest() {
        double heaviestWeight = Double.NEGATIVE_INFINITY;
        String name = "";

        for(int i=0; i<peopleData[0].length; i++) {
            double weight = Double.parseDouble(peopleData[2][i]);

            if (weight > heaviestWeight) {
                heaviestWeight = weight;
                name = peopleData[0][i];
            } else {
                if (weight == heaviestWeight) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Mais pesado(s): " + name + "  pesa(m) ");
        System.out.printf("%.2f", heaviestWeight);
        System.out.println(" kg");     
    }

    private static void getLightest() {
        double lightestWeight = Double.POSITIVE_INFINITY;
        String name = "";

        for(int i=0; i<peopleData[0].length; i++) {
            double weight = Double.parseDouble(peopleData[2][i]);

            if (weight < lightestWeight) {
                lightestWeight = weight;
                name = peopleData[0][i];
            } else {
                if (weight == lightestWeight) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Mais leve(s): " + name + "  pesa(m) "); 
        System.out.printf("%.2f", lightestWeight);
        System.out.println(" kg");         
    }

    private static void getHighestBMI() {
        double highestBMI = Double.NEGATIVE_INFINITY;
        String name = "";
        double bmi = 0.0;

        for(int i=0; i<peopleData[0].length; i++) {
            double height = Double.parseDouble(peopleData[1][i]);
            double weight = Double.parseDouble(peopleData[2][i]);
            bmi = (height*height)/weight;

            if (bmi > highestBMI) {
                highestBMI = bmi;
                name = peopleData[0][i];
            } else {
                if (bmi == highestBMI) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Maior IMC: " + name + " cujo valor é ");
        System.out.printf("%.2f", highestBMI);
        System.out.println("");
    }

    private static void getLowestBMI() {
        double lowestBMI = Double.POSITIVE_INFINITY;
        String name = "";
        double bmi = 0.0;

        for(int i=0; i<peopleData[0].length; i++) {
            double height = Double.parseDouble(peopleData[1][i]);
            double weight = Double.parseDouble(peopleData[2][i]);
            bmi = (height*height)/weight;

            if (bmi < lowestBMI) {
                lowestBMI = bmi;
                name = peopleData[0][i];
            } else {
                if (bmi == lowestBMI) {
                    name += " e " + peopleData[0][i];
                }
            }
        }

        System.out.print("Menor IMC: " + name + " cujo valor é ");
        System.out.printf("%.2f", lowestBMI);
        System.out.println("");
    }

}
