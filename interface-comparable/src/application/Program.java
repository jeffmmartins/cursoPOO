package application;
import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        //Caminho do arquivo;
        String path = "C:\\Users\\Jefferson\\Documents\\temp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                //Vetor onde vai conter os nomes que estão no arquivo e separando por vrigurla;
                String [] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                //Ler novamente a proxima linha do arquivo;
                employeeCsv = br.readLine();
            }
            //Operação padrão para ordernar uma  coleção;
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}