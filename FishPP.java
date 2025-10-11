public class FishPP implements PreyPP, PredatorPP{ 

    @Override
    public void flee(){
        System.out.println("The smaller fish is swimming away");

    }

    @Override
    public void hunt(){
        System.out.println("The bigger fish is hunting");

    }
    
}
