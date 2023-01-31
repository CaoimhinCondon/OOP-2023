package ie.tudublin;

public class cat {
    
    int numLives = 9;
    String name;
    boolean life = true;

    public void setName(String name){

        this.name = name;
    }

    public cat(){
        
    }

    public cat(String name){

    }

    public void kill (){

        numLives--;

        if (numLives > 0){

            System.out.println("Ouch");
        }
        else {

            life = false;
            System.out.println("Dead");
        }
    }
}
