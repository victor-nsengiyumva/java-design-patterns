public class Paul extends Fighter {

    public Paul(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);

    }

    @Override
    public void display(){
        System.out.println("Hi, I am Paul");
    }
    
    @Override
    public void roll(){
        
    }
}
