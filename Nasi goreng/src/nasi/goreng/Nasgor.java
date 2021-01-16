
package nasi.goreng;


public abstract class Nasgor {
    
    protected String nama;
    
   public  Nasgor (String nama){
        this.nama =nama;
    }
    
       public void Nasgor(String nama ){
           this.nama = nama;
           
       }
       
         public void stnama(String nama){
          this.nama=nama;
    }   
         

   void display(){
       System.out.println(" Resep Mbok jamilah " + nama );
   }
   public void peralatan(){
        peralatan();
    }

  
}
