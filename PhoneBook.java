/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonebook;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook{
    public static void main(String[] args) {
        Map<String,String>pb=new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 to Continue And 0 to exit");
        int n=s.nextInt();
        do{
            System.out.println("-----Phone Book Menu-----");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Sort Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5.View Contactlist");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");
            int ch= s.nextInt();
            switch(ch){
                case 1-> {
                    s.nextLine();
                    System.out.println("Enter Name: ");
                    String name=s.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phno=s.nextLine();
                    pb.put(name, phno);
                    System.out.println("Contact Added");
                    break;}
                case 2->{
                    s.nextLine();
                    System.out. println("Enter name to search");
                    String name=s.nextLine();
                    int i;
                    for(i=0;i<pb.size();i++){
                        if(pb.containsKey(name)){
                            System.out.println("Phone Number: "+pb.get(name));
                            break;
                        }
                    }
                    if(i==pb.size()){
                        System.out.println("Contact does not exist");
                    }
                    break;
                }    
                case 4->{
                    s.nextLine();
                    System.out.println("Enter Name To Delete: ");
                    String name=s.nextLine();
                    if(pb.containsKey(name)){
                        pb.remove(name);
                        System.out.println("Contact Deleted");}
                    else{
                        System.out.println("Contact Not Found");
                    }
                }
                    case 6->{
                        System.out.println("Exiting...");
                        s.close();
                        System.exit(0);
                        break;}
                    default ->{System.out.println("Invalid choice");}
                    case 3->{
                        System.out.println("Sorted By name");
                        List<String> list=new ArrayList<>(pb.keySet());
                        Collections.sort(list);
                        //list.sort(Comparator.naturalOrder());
                        Iterator i=list.iterator();
                        while(i.hasNext()){
                            System.out.println(i.next());
                        }
                        break;
                    }
                    case 5->{
                        
                        Iterator<Map.Entry<String,String>> i=pb.entrySet().iterator();
                        while(i.hasNext()){
                            Map.Entry<String,String>entry=i.next();
                            System.out.println("Name: "+entry.getKey()+", Phone: "+entry.getValue());
                        }
                    }
                    
                
            } 
        }while(n!=0);
    }
}
  

