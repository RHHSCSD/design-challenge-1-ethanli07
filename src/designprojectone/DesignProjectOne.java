/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package designprojectone;
import java.util.*;

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
* Takes the total number of students doing each project and calculates the total fixed cost, applying a discount if appropriate
* Take the number of students doing each respective contest and add their respective costs to the total cost
* Divide the total cost among the total number of students to calculate the individual cost for every student
*OUTPUT:
* Print out the individual cost for every student 
***************************************************/
  
/**************** TEST CASES *********************************************************
*Test                     Input     Desired Output                       Actual Output
* Division by 0 error     0 0 0     You cannot divide by 0
* Negative Numbers       -1 0 0     You cannot input negative numbers
*                        -1 4 5     You cannot input negative numbers
* # of projects > 100  100 100 100  The cost per student is $62.5
* Standard Case          10 10 10   The cost per student is $65
* Only one type          0  0  10
**************************************************************************************/
public class DesignProjectOne {
    public static void main(String[] args) {
    //Write Pseudocode FIRST as comments and THEN write the code
    
        //ASSIGN CONSTANTS
        double PROJECT_COST = 50.00;
        double ARDUINO_COST = 10.00;
        double RPI_COST = 15.00;
        double VR_COST = 20.00;
        
        //INITIALIZE SCANNER
        Scanner keyboard = new Scanner(System.in);
        
        //ASK USER TO ASSIGN VARIABLE VALUES
        System.out.print("Number of students writing the Arduino Project: ");
        int numArduino = keyboard.nextInt();
        
        System.out.print("Number of students writing the Raspberry PI Project: ");
        int numRPI = keyboard.nextInt();
        
        System.out.print("Number of students writing the VR Project: ");
        int numVR = keyboard.nextInt();
        
        //CALCULATE VARIABLE VALUES
        int totalNumberOfStudents = numArduino + numRPI + numVR;
        double fixedCost = totalNumberOfStudents * PROJECT_COST;
        double variableCost = numArduino * ARDUINO_COST + numRPI * RPI_COST + numVR * VR_COST;
        
        // CHECK IF THE INPUTS ARE VALID, IF THEY ARE PROCEED WITH THE CALCULATIONS
        if ((numArduino < 0) || (numRPI < 0) || (numVR < 0)) {
            System.out.println("You cannot input negative numbers!");
        }
        else if ((numArduino + numRPI + numVR) == 0) {
            System.out.println("You cannot have 0 students doing each porject!");
        }
        else {
            if (totalNumberOfStudents > 100) {
                fixedCost *= 0.95;
            }
            System.out.println("The cost per student is $" + (fixedCost + variableCost)/totalNumberOfStudents);
        }  
    }
}
