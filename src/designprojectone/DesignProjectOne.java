/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package designprojectone;
import java.util.*;
import java.text.*;

/***************************************************
*  Program: Tech Fair Project Calculator
*  Author: Ethan Li
*  Date: March 7, 2024
*  Description: Takes the inputs of the number of students doing each project, calculates the total cost, and splits it evenly among all participating students
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Number of students writing the Arduino Project
* Number of students writing the Raspberry PI Project
* Number of students writing the VR Project

*PROCESSING:
* Take the total number of students doing each project and calculates the total fixed cost, applying a discount if appropriate 
* fixedCost = PROJECT_COST * totalNumberOfStudents
* fixedCost *= 0.95 (if appropriate)
* 
* Take the number of students doing each respective contest and add their respective costs to the total cost, applying discounts where appropriate
* variableCost = numArduino * ARDUINO_COST + numRPI * RPI_COST + numVR * VR_COST
* variableCost -= numArduino - 15 (if applicable)
* variableCost -= (numRPI - 20) * 3 (if applicable)
* 
* Divide the total cost among the total number of students to calculate the individual cost for every student
* individualCost = (fixedCost + variableCost)/totalNumberOfStudents

*OUTPUT:
* Print out the individual cost for every student 
***************************************************/
  
/**************** TEST CASES ************************************************************************************************
*Test                     Input     Desired Output                            Actual Output
* Division by 0 error     0 0 0     You cannot 0 students doing each project! You cannot have 0 students doing each porject!
* Negative Numbers       -1 0 0     You cannot input negative numbers!        You cannot input negative numbers!
*                        -1 4 5     You cannot input negative numbers!        You cannot input negative numbers!
* # of projects > 100  100 100 100  The cost per student is $61.42            The cost per student is $61.416666666666664
* Test Discounts         30 30 30   The cost per student is $64.5             The cost per student is $64.5
* Only one type          0  0  10   The cost per student is $70               The cost per student is $70
*****************************************************************************************************************************/

public class DesignProjectOne {
    public static void main(String[] args) {
    //Write Pseudocode FIRST as comments and THEN write the code
    
        //ASSIGN CONSTANTS
        final double PROJECT_COST = 50.00;
        final double ARDUINO_COST = 10.00;
        final double RPI_COST = 15.00;
        final double VR_COST = 20.00;
        
        //INITIALIZE OBJECTS
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        //ASK USER NUM OF STUDENTS WRITING EACH PROJECT
        System.out.print("Number of students doing the Arduino Project: ");
        int numArduino = keyboard.nextInt();
        
        System.out.print("Number of students doing the Raspberry PI Project: ");
        int numRPI = keyboard.nextInt();
        
        System.out.print("Number of students doing the VR Project: ");
        int numVR = keyboard.nextInt();
        
        //CALCULATE COSTS
        int totalNumberOfStudents = numArduino + numRPI + numVR;
        double fixedCost = totalNumberOfStudents * PROJECT_COST;
        double variableCost = numArduino * ARDUINO_COST + numRPI * RPI_COST + numVR * VR_COST;
        
        //ADJUST FOR PRICE DISCOUNTS
        if (totalNumberOfStudents > 100) {
            fixedCost *= 0.95;
        }
        if (numArduino > 15) {
            variableCost -= (numArduino - 15);
        }
        if (numRPI > 20) {
            variableCost -= (numRPI - 20) * 3;
        }
        
        //CALCULATE INDIVIDUAL COST
        double individualCost = (fixedCost + variableCost)/totalNumberOfStudents;
        
        //CHECK IF THE INPUTS ARE VALID, IF THEY ARE OUTPUT THE COST PER STUDENT
        if ((numArduino < 0) || (numRPI < 0) || (numVR < 0)) {
            System.out.println("You cannot input negative numbers!");
        }
        else if ((numArduino + numRPI + numVR) == 0) {
            System.out.println("You cannot have 0 students doing each project!");
        }
        else {
            System.out.println("The cost per student is $" + decimalFormat.format(individualCost));
        }  
    }
}
