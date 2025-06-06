package com.shady.user.ModelClasses;

import java.util.LinkedList;

public class DLL {
    public Node head=null;
    public Node tail=null;
    void Append(Employee data){
        Node n=new Node(data);
         if (head ==null) 
         {
            head = n; 
            tail = n; 
            return;
        }
        
        tail.next=n;
        n.prev=tail;
        tail=n;
        n.next=null;


    }
    int count()
    {
        int c=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            c++;

        }
        return c;
    }
   private boolean cheakposistion(int pos)
    {
       
        return (pos>=0 && pos<count());

    }
   public  Cheak whereposistion(int id)
    {
        Cheak cheak =new Cheak();
       
        Node temp = head ;
        int i=0;
            while (temp!=null) {
              
                if (temp.data.employeeId==id) {
                    cheak.Position=i;
                    cheak.found=true;
                    break;
                }
                i++;
                temp=temp.next;
                
            }
            


        return cheak;

    }
    public Employee login(String email, String password) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getEmail().equals(email)  ) 
            {//temp.data.checkPassword(password)
                if (temp.data.checkPassword(password)) {
                    return temp.data;
                } else {
                   throw new IllegalArgumentException("Invalid password");
                }
               
            }
            temp = temp.next;
        }
        
         throw new IllegalArgumentException("Invalid email"); // Invalid email or password
    }
    
    
   public Node search(int pos)
    {
        
        Node temp=tail;
        if (!cheakposistion(pos)) 
        {
            System.out.println("Node not find");
            return null;
        } 
        
        for(int i=count() ; i > pos;i--){
            temp=temp.prev;
            
        }
        return temp;
    }
    
    
    
    void addAtPosition(Employee data, int index)
    {
        
        if(!cheakposistion(index)) 
        { 
         System.out.println("index invalid");
         return;
            
        }
        if(index==count()-1) 
        {
            Append(data);
            return;

        }
        if(index==0)
        {
            
            if(head==null&&tail==null)
            {
                Append(data);
                return ;
            }
            Node n= new Node(data);
            head.prev=n;
            n.next=head;
            head=n;
            
            return;
        }

        Node n= new Node(data);
        Node temp =search(index);
        Node tempPrev=temp.prev;
        n.next=temp;
        n.prev=tempPrev;
        temp.prev=n;
        tempPrev=n;
             
        


    }
   
    void deleteHead()
    {

        if (head==null) return;
        if (count()-1==0) {
            head=null;
            return;
        }
        head = head.next;
        head.prev=null;

    }
    void deleteTail()
    {
        if (head==null) return;
        if (count()-1==0) {
            head=null;
            return;
        }
        tail = tail.prev;
        tail.next=null;

    }
    void deleteAtPos(int id)
    {   
        if (!whereposistion(id).found) {
            
            System.out.print("not found");
            return;
        }
        int pos = whereposistion(id).Position;
        if(head==null) return;
       
        if(pos == 0 ) 
        {
            deleteHead();
            return;
        }
        if(pos == count()-1) 
        {
         deleteTail();
            return;
        }
        Node temp = search(pos);
        temp.prev.next=temp.next;

    }
    void sortAscending()
    {   
      
    }
   


    
    void display()
    {
        if(count()==0)
        {
            System.out.println("DLL is Empty");
            return;
        }
        Node temp=head;
       
        System.out.println(" ==========================");
        System.out.println("|  head.data ->\""+temp.data+"\"         |");
        System.out.println(" ==========================");
        System.out.println("| I | data                 |");
        System.out.println(" ==========================");
        
        
        int i=1;
        while (temp!=null) {
            
           
            
            System.out.println( "|"+i+"| "+temp.data +"                     |");
            temp=temp.next;
            i++;
        }
        
        System.out.println(" =========================");

    }


  public  DLL  toLinkedList(){
    DLL list = new DLL();
        Node current = head; 
        while (current != null) {
            list.Append(current.data); 
            current = current.next; 
        }
        return list;
    }


}
