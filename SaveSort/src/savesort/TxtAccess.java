package savesort;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;
import java.util.Arrays;


public class TxtAccess {
    private File file_name;
    private char[] all_char;
    private int current_char;
    private int total_char;
   
    private String single_line = "";
    private TxtAccess next_line;
   
    TxtAccess(){
       
    }
   
    //converts the file of saved data into easily accessable dynamic memory
    TxtAccess(String name_of_file){
        this.file_name = new File("saved_data.txt");
        this.total_char = (int)file_name.length();
        this.all_char = new char[this.total_char];
       
        this.current_char = 0;
       
        try {
            FileReader read = new FileReader("saved_data.txt");//saved_data.txt
            read.read(this.all_char);
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        this.next_line = new TxtAccess();
        extract_file(this.all_char, this.current_char, this.total_char,  this.next_line);
    }
   
   
    public void extract_file(char[] all_char, int current_char, int total_char,  TxtAccess next_line){
        boolean run = true;
        while(current_char < total_char && run == true){
            next_line.single_line = next_line.single_line + all_char[current_char];
            if(all_char[current_char] == '\n'){
                run = false;
            }
            current_char++;
        }
        if(current_char < total_char){
            next_line.next_line = new TxtAccess();
            extract_file(all_char, current_char, total_char, next_line.next_line);
        }
    }
   
   
   
   
    public void save_data(){
        if(this.next_line != null){
            this.total_char = char_counter(this.next_line, 0);
        }
        this.all_char = null;
        this.all_char = new char[this.total_char];
        String temp_string = "";
        temp_string = char_transfer(this.next_line, temp_string);
        this.all_char = temp_string.toCharArray();
        save();
    }
   
    public int char_counter(TxtAccess next_line, int total_char){
        total_char = next_line.single_line.length();
        if(next_line.next_line != null){
            return(total_char + char_counter(next_line.next_line, total_char));
        }else{
            return(total_char);
        }
    }
   
    public String char_transfer(TxtAccess next_line, String temp_string){
        temp_string = next_line.single_line;
        if(next_line.next_line != null){
            return(temp_string + char_transfer(next_line.next_line, temp_string));
        }else{
            return(temp_string);
        }
    }
   
    public void save(){
        try {
            FileWriter write = new FileWriter(this.file_name);
            write.write(this.all_char);
            write.close();
        } catch (IOException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
   
   
   
   
   
   
   
    public void show_all_data(){
        if(this.next_line != null){
        show_all(this.next_line);
        }
    }
   
    public void show_all(TxtAccess next_line){
        System.out.print(next_line.single_line);
        if(next_line.next_line != null){
            show_all(next_line.next_line);
        }
    }
   
}
