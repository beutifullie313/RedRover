package Person;

public class Salary {


   static double getSum(Employee[] employeeArray){ //static method is used within all class
       double result = 0.0;
       for(int i =0; i < employeeArray.length; i++){
           result += employeeArray[i].salary;
       }
       return result;
   }
}


