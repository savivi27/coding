/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection1;
import java.util.Collection;
import java.util.LinkedList;
/**
 *
 * @author DELL
 */
public class CollectionPractical1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<Integer> c = new LinkedList<>();
        
        c.add(12);
        c.add(13);
        c.add(27);
        c.add(16);
        c.add(19);

        System.out.println("Is the collection empty? " + c.isEmpty());

        System.out.println("Size of the collection: " + c.size());

        int elementToCheck = 12;
        System.out.println("Does the collection contain " + elementToCheck + "? " + c.contains(elementToCheck));

        int elementToRemove = 19;
        c.remove(elementToRemove);
        System.out.println(elementToRemove + " removed from the collection.");

        System.out.println("Remaining elements in the collection: " + c);
    }
    
}
