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
  
/**************** TEST CASES ************************
*Test                     Input      Desired Output
* Division by 0 error     0 0 0       
* 
* 
* 
* 
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Write Pseudocode FIRST as comments and THEN write the code
    
        //CONSTANTS
        int PROJECT_COST = 50;
        int ARDUINO_COST = 10;
        int RPI_COST = 15;
        int VR_COST = 20;
        
        // INITIALIZE SCANNER
        Scanner keyboard = new Scanner(System.in);
        
        //VARIABLES
        System.out.print("Number of students writing the Arduino Project: ");
        int numArduino = keyboard.nextInt();
        
        System.out.print("Number of students writing the Raspberry AI Project: ");
        int numRPI = keyboard.nextInt();
        
        System.out.print("Number of students writing the VR Project: ");
        int numVR = keyboard.nextInt();
        
        int totalNumberOfStudents = numArduino + numRPI + numVR;
        int fixedCost = totalNumberOfStudents * PROJECT_COST;
        int variableCost = numArduino * ARDUINO_COST + numRPI * RPI_COST + numVR * VR_COST;
        
        //CODE
        if (totalNumberOfStudents > 0) {
            if (totalNumberOfStudents > 100) {
                fixedCost *= 0.95;
            }
            
        }
        else {
            System.out.println("Invalid Input");
        }
        
       
    }
    
}
