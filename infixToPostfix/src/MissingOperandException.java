/**
 * Course: COMP 2100
 * Assignment: Project 2
 *
 * @author Johnathan Kneice
 * @author Jacob McIntosh
 * @version 1.0, 10/7/2021
 */

public class MissingOperandException extends Exception {
    public MissingOperandException() {
        super("Missing operand");
    }
}
