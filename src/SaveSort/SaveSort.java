/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savesort;

/**
 *
 * @author Cshasting1
 */
public class SaveSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaveUseData test = new SaveUseData();
        test.make_open_file("test_file.txt");
        test.convert_to_dynamic_memory();
        test.read_dynamic_memory();
        
        //not to self (Seth), ignore this if you are not me
        //the read_sub_itorator will tab sub-nodes over, but it will not double tab sum-sub-nodes over
        //nor will it add any extra tabs for any other sub-nodes of sub-nodes. develoup a 
        //method by which a node will recieve more tabs for being sub-nodes of sub-nodes when displayed.
        //perhaps another variable can be added to the class to signify how many dimensions down
        //a node is reletive to the root node. the root node and other nodes in the same dimension as
        //the root node would be classified as being on the first dimension, while sub-nodes would be
        //on the second dimension, sub-nodes of sub-nodes on the third dimension, etc. this data
        //could be passed when other classes or the main accesses the SaveUseData class.
    }
    
}
