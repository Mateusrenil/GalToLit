/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package galtolit;

/** 
 *
 * @author Aluno
 */
public class GalToLIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare as variáveis
        double gallons=10;
        double liters=0;
        // adicione o cálculo aqui
      
       // exiba o resultado para o usuário
        System.out.println(gallons+" gallons equals " +liters+  " liters");
        
        
    }

     public class StudentDriver {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Nome do Aluno: " + student.fName + " " + student.lName);
        System.out.println("ID do Aluno: " + student.stuId);
        System.out.println("Status do Aluno: " + student.stuStatus);
    }

    private static class Student {

        private String fName = "Lisa";
        private String stuId = "123456789";
        private String stuStatus = "Active";
        private String lName = "Palombo";

        public Student() {
        }
    }
     }
}

