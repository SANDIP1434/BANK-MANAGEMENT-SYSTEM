


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Bank_db {
    static String u_id[]= {"2005","2006","2007","2008","2009"};
  static String u_p[]= {"1234","5678","9101","3618","4219"};
  static float balance[]= {1000,2000,3000,5000,9000};
  static float transfer[]= {0.0f,0.0f,0.0f,0.0f,0.0f};
  static float withdraw[]= {0.0f,0.0f,0.0f,0.0f,0.0f};
  static float deposit[]= {0.0f,0.0f,0.0f,0.0f,0.0f};
  static String nick_name[]={"ABC","DEF","GHJ","KLM","NOP"};
  
  static int check_creds(String id,String pin){
      int i;
        for(i=0;i<u_id.length;i++){
            if(id.equals(u_id[i]) && pin.equals(u_p[i])){
                login.current_id=u_id[i];
                login.current_p=u_p[i];
                login.ind=i;
                return 1;
            }
            if(id.equals(u_id[i]))
                login.ind=i;
        }
        return 0;
  }
  
  static float check_balance(int ind){
      return balance[ind];
  }
  
  static void withdraw(int ind,float a){
      balance[ind]-=a;  
      withdraw[ind]+=a;
  }
  
   static void deposit(int ind,float a){
      balance[ind]+=a;  
      deposit[ind]+=a;
  }
   
     static void transfer(int ind,int to_ind,float a){
      withdraw(login.ind,a);
       deposit(to_ind, a);
       transfer[login.ind]+=a;    
  }
   
   static float check_deposit(int ind){
      return deposit[ind];  
  }
   
   static float check_withdraw(int ind){
      return withdraw[ind];  
  }
   
   static float check_transfer(int ind){
      return transfer[ind];  
  }
   
   static void change_pin(int ind,String p){
       u_p[ind]=p;
   }
    
}
