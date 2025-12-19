import java.util.Scanner;

class CountryNotValidException extends Exception {
    public String getMessage() {
        return "The employee should be an Indian citizen for calculating tax.   ";
    }
}
class EmployeeNameInvalidException extends Exception{
    public String getMessage() {
        return "The employee name cannot be empty.   ";
    }
}
class TaxNotEligibleException extends Exception{
    public String getMessage() {
        return "the employee does not need to pay tax   ";
    }
}


class TaxCalculator {
    public double CalculateTax(String empName,boolean isindian,double empsal) 
    throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException {
        if(!isindian){
            throw new CountryNotValidException();
        }
        if(empName==null || empName.isEmpty()){
            throw new EmployeeNameInvalidException();
        }
        if(empsal>100000){
            return empsal*8/100;
        }
        else if(empsal>50000 || empsal<=100000){
            return empsal*6/100;
        }
        else if(empsal>30000 || empsal<=50000){
            return empsal*5/100;
        }
        else if(empsal>10000 || empsal<30000){
            return empsal*4/100;
        }
        else{
            throw new TaxNotEligibleException();
        }

    }
  

    
}


public class SimpleCalculator {
    public static void main(String[] args){
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter nationality (Indian/Other): ");
            String nationality = sc.nextLine();
            boolean isIndian = nationality.equalsIgnoreCase("Indian");
            
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();
            
            TaxCalculator calculator = new TaxCalculator();
            double tax = calculator.CalculateTax(name, isIndian, salary);
            
            System.out.println("Tax amount: " + tax);
            
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}