/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubexercise4;

/**
 *
 * @author earle
 */
public class GitHubExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printName();
        printLoop();
    }
    
    public static void printName(){
        System.out.println("My name is Hunter Earley and this is my statement");
    }
    
    public static void printLoop(){
        for(int x = 0; x <= 10; x++){
            System.out.println("| " + x + "|");
        }
    }
}
