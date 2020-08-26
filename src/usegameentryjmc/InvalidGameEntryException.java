/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usegameentryjmc;

/**
 *
 * @author Enubs
 */
public class InvalidGameEntryException extends IndexOutOfBoundsException{
    public InvalidGameEntryException(){
        super("Game entry does not exist.");
    }
}
