package se.almstudio.service;

public class ManageEmployee {
    public static int average(int[] input) {
        int total = 0;
        int num = 0;
        for (int counter = 0; counter < input.length; counter++) {
            total = (int) (total + input[counter]);
            num = num + 1;
        }
        int averageSalary = (total / num);
        return averageSalary;
    }
    public static void main(String[] args) {
        //matas nödvändiga uppgifter om 5 employee, och motsvarande objekt av typen employee skapas
        Employee employee1 = new Employee("Ali ", "gholi", 1950, 500);
        Employee employee2 = new Employee("hosein ", "abadi", 1960, 600);
        Employee employee3 = new Employee("Martin ", "Erikson", 1970, 700);
        Employee employee4 = new Employee("Anna ", "Larsson", 1980, 800);
        Employee employee5 = new Employee("Tom ", "Karlsson", 1990, 900);
        // Dessa objekt lagras i en vektor
        Employee[] V = new Employee[5];
        int[] allprices = new int[5];
        V[0] = employee1;
        V[1] = employee2;
        V[2] = employee3;
        V[3] = employee4;
        V[4] = employee5;
        // matas antalet arbetstimmar för varje employee in, och deras löner bestäms
        for (int i = 0; i < V.length; i++) {
            int finalSalary = V[i].salaryCalculator(V[i].getPrice(), 5);
            allprices[i] = finalSalary;
            String allNames = V[i].getName();
            String allFamilies = V[i].getFamily();
            // Arbetarna och deras löner skrivs ut
            System.out.println(allNames + allFamilies + " salary is " + finalSalary );
        }
        //medellön för alla employee beräknas och skris ut
        System.out.println("The Average salary is " + average(allprices));
    }
}
