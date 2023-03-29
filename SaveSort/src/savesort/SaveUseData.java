
package savesort;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;

/**
 *
 * @author Cshasting1
 */

/*
            INSTRUCTIONS FOR USING SaveUseData CLASS

----make_open_file----
pass a name for the file on which all of your data will be stored
    if a file with the name exists, that file will be opened, all of the data in the file will be coppied into the all_char character array
    if a file with the name does not exist, one will be created with the name and then the empty file will be open

----convert_to_dynamic_memory----
if a file has not been oppened or the oppened file is empty, the method will only tell the user that there is no data to convert and it will do nothing else
if a file has been opened and data is present, the data will be converted to dynamic memory
    it is important that the data in the file is formated properly, impropper formatting might create an error
once the dynamic memory is created, it can be accessed via other methods within this class
    you may want to transfer the dynamic memory from this class to your class if you wish to use or alter it in detail

----read_dynamic_memory----
if dynamic memory of a file has been created, this class will show that data in the text bar
this will likely only be used for trouble shooting

----get_char_array----
if a file has been extracted, this method will return the entierety of that file as a character array

*/
public class SaveUseData {
    
    private File file_name;
    private static char[] all_char;//will save every character from the file into an array
    private static int current_char;//used for keeping track of the current character being observed in iterators
    private static int total_char;//used for keeping track of the total number of characters from the file being used in iterators
    
    //these variables are used for dynamic memory creation
    private String single_line = "";
    private SaveUseData next_line;
    //this is used for storing data relative to the main chunk of data
    //this dynamic memory is functioning similar to a 2D array, but the number of dimensions this dinamic array can occupy does not have an upper limit
    private SaveUseData sub_line;
    
    SaveUseData(){}
    
    //this will construct a txt file with the same name as the string passed to
    //the method, it will construct a file with the name passed to the method
    //if the file does not yet exist
    public void make_open_file(String name){
        file_name = new File(name);
        total_char = (int)file_name.length();
        all_char = new char[total_char];
        current_char = 0;
        
        //if the file does not exist, this will create a new blank file
        if(file_name.exists() == false){
        try {
            FileWriter Write = new FileWriter(file_name);
            Write.write("");
            Write.close();
        } catch (IOException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        //puts all the text on the file into the all_char variable
        try {
            FileReader look = new FileReader(name);//saved_data.txt
            look.read(all_char);
            if(all_char.length == 0){
                System.out.println("file is empty, do not attempt to access it without first adding data");
            }
            look.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    //run this method if you want to convert the character array into dynamic memory
    public void convert_to_dynamic_memory(){
        if(all_char != null){
            next_line = new SaveUseData();//root node
            
            create_dynamic_itorator(next_line);
        }
        else{
            System.out.println("the chosen file is empty, fill it with data or select a different file to use");
        }
    }
    
    
    //this itterator is going to be used for creating dynamic memory
    //DO NOT CALL THIS METHOD, it is only meant to be called by other methods in this class
    private void create_dynamic_itorator(SaveUseData next){
        boolean run = true;
        while(current_char < total_char && run == true){
            next.single_line = next.single_line + all_char[current_char];
            if(all_char[current_char] == '\n'){
                run = false;
            }
            current_char++;
        }
        if((int)(all_char[current_char]) - 48 > 0){
            current_char++;
            current_char++;
            current_char++;
            next.sub_line = new SaveUseData();
            create_sub_itorator(next.sub_line, (int)all_char[current_char - 3] - 48);
        }else{
            current_char++;
            current_char++;
            current_char++;
        }
        
        if(current_char < total_char){
            next.next_line = new SaveUseData();
            create_dynamic_itorator(next.next_line);
        }
    }
    
    //this method creates sub-nodes for increatsing the dimensions of the array
    //this method does not need to be called, it is an optional extra optionf for more complicated/specific storrage
    //DO NOT CALL THIS METHOD, it is only meant to be called by other methods in this class
    private void create_sub_itorator(SaveUseData nxt, int end){
        boolean run = true;
        while(current_char < total_char && run == true){
            nxt.single_line = nxt.single_line + all_char[current_char];
            if(all_char[current_char] == '\n'){
                run = false;
            }
            current_char++;
        }
        if((int)(all_char[current_char]) - 48 > 0){
            current_char++;
            current_char++;
            current_char++;
            nxt.sub_line = new SaveUseData();
            create_sub_itorator(nxt.sub_line, (int)all_char[current_char - 3] - 48);
        }else{
            current_char++;
            current_char++;
            current_char++;
        }
        end--;
        if(current_char < total_char && end > 0){
            nxt.next_line = new SaveUseData();
            create_sub_itorator(nxt.next_line, end);
        }
    }
    
    
    //call this to display the dynamic memory as text
    //we'll probably only use this for trouble shooting and other similar things
    public void read_dynamic_memory(){
        if(next_line != null){
            read_dynamic_itorator(next_line);
        }
    }
    
    //this reads the dynamic memory
    //DO NOT CALL THIS METHOD, it is only meant to be called by other methods in this class
    private void read_dynamic_itorator(SaveUseData next){
        System.out.print(next.single_line);
        if(next.sub_line != null){
            read_sub_itorator(next.sub_line, 1);
        }
        if(next.next_line != null){
            read_dynamic_itorator(next.next_line);
        }
    }
    
    //this is used for displaying sub-nodes in the dynamic memory array
    //DO NOT CALL THIS METHOD, it is meant to be calld by other methods in this class
    private void read_sub_itorator(SaveUseData nxt, int tabs){
        for(int i = 0; i < tabs; i++){
            System.out.print('\t');
        }
        System.out.print(nxt.single_line);
        if(nxt.sub_line != null){
            read_sub_itorator(nxt.sub_line, tabs + 1);
        }
        if(nxt.next_line != null){
            read_sub_itorator(nxt.next_line, tabs);
        }
    }
    
    
    //delete this before turning in, I just used it for testing stuff
    public void test_class_delete_later(){
        //System.out.println(next_line.next_line.next_line.sub_line.next_line.next_line.single_line);
    }
    
    //returns the entier character array unaltered
    //your probably not going to use this, but I left it here just in case
    public char[] get_char_array(){
        return (all_char);
    }
}
